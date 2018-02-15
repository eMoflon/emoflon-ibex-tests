package testsuite.ibex.ClassInhHier2DB_MA.sync.util;

import java.util.Optional;

import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyHelper;
import org.benchmarx.database.core.DatabaseHelper;
import org.emoflon.ibex.tgg.operational.matches.IMatch;
import org.emoflon.ibex.tgg.operational.matches.ImmutableMatchContainer;
import org.emoflon.ibex.tgg.operational.updatepolicy.UpdatePolicy;

import ClassInheritanceHierarchy.ClassPackage;
import Database.DB;
import testsuite.ibex.testUtil.SyncTestCase;

public class SyncTestCaseCD2DB extends SyncTestCase<ClassPackage, DB>{

public final static String projectName = "ClassInhHier2DB_MA";
	
	public SyncTestCaseCD2DB() {
		super(new IbexCD2DB_MA(projectName));
	}
	
	protected ClassInheritanceHierarchyHelper helperClass;
	protected DatabaseHelper helperDB;
	
	@Override
	protected String getProjectName() {
		return projectName;
	}

	@Override
	protected void initHelpers() {
		helperClass = new ClassInheritanceHierarchyHelper();
		helperDB = new DatabaseHelper();
	}
	
	public void setPreferClassUpdatePolicy() {
		((IbexCD2DB_MA) tool).getSync().setUpdatePolicy(new UpdatePolicy() {
			@Override
			public IMatch chooseOneMatch(ImmutableMatchContainer matchContainer) {
				return getMatch(matchContainer, "ClassToTableRule");
			}
		});
	}
	
	public void setPreferSubClassUpdatePolicy() {
		((IbexCD2DB_MA) tool).getSync().setUpdatePolicy(new UpdatePolicy() {
			@Override
			public IMatch chooseOneMatch(ImmutableMatchContainer matchContainer) {
				return getMatch(matchContainer, "SubClassToTable");
			}
		});
	}
	
	public IMatch getMatch(ImmutableMatchContainer matchContainer, String preferedRule) {
		Optional<IMatch> match = matchContainer.getMatches()
				.stream()
				.filter(m -> m.getPatternName().contains(preferedRule))
				.findAny();
		return match.orElse(matchContainer.getNextRandom());
	}
	
	// ---- FWD ----
	
	public void createInheritance() {
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				   .andThen(p -> helperClass.createSubClass(p, "SC1", 0))
			);
		//------------
		assertPostcondition("in/04_SubClassToTable_FWD", "expected/04_SubClassToTable_FWD");
	}
	
	public void createInheritanceWithAttributes() {
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a1", null, 0))
				.andThen( p -> helperClass.createSubClass(p, "SC1", 0))
				.andThen( p -> helperClass.createAttributeInClass(p, "a2", null, 1)));
		//------------
		assertPostcondition("in/06_OneSuperAtt_OneSubAtt_FWD", "expected/06_OneSuperAtt_OneSubAtt_FWD");
	}
	
	
	// ---- BWD ----
	public void createTables(){
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		setPreferClassUpdatePolicy();
		tool.performAndPropagateTargetEdit(util.execute( (DB db) -> helperDB.createTable(db, "C1"))
				.andThen( db -> helperDB.createTable(db, "SC1")));
		//------------
		assertPostcondition("in/SubClassToTable_BWD", "expected/SubClassToTable_BWD");
	}
	
	public void createTablesWithColumns() {
		setPreferClassUpdatePolicy();
		tool.performAndPropagateTargetEdit(util.execute( (DB db) -> helperDB.createTable(db, "C1"))
				.andThen(db -> helperDB.createColumnInTable(db, "a1", 0))
				.andThen( db -> helperDB.createTable(db, "SC1"))
				.andThen(db -> helperDB.createColumnInTable(db, "a2", 1)));
		//------------
		assertPostcondition("in/SubClassToTableWithColumns_BWD", "expected/SubClassToTableWithColumns_BWD");
	}
	
	//this is tricky because you do not if C1->SC1 or SC1->C1
	public void createTablesWithInheritance(){
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		setPreferSubClassUpdatePolicy();
		tool.performAndPropagateTargetEdit(util.execute( (DB db) -> helperDB.createTable(db, "C1"))
				.andThen( db -> helperDB.createTable(db, "SC1")));
		//------------
		assertPostcondition("in/SubClassToTable_BWD", "expected/SubClassToTable_BWD");
	}

}
