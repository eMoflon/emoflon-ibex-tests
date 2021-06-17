package testsuite.ibex.TerraceHouses2BlockSet.integrate;

import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.APPLY_USER_DELTA;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.CLEAN_UP;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_BROKEN_MATCHES;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_CONFLICTS;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.TRANSLATE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

import org.benchmarx.terracehouses.core.TerraceHousesHelper;
import org.benchmarx.woodenblockset.core.WoodenBlockSetHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.DeletePreserveConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.OperationalMultiplicityConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.util.CRSHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationPattern;
import org.junit.Test;

import TerraceHouses.District;
import WoodenBlockSet.BlockSet;
import WoodenBlockSet.Construction;
import WoodenBlockSet.Playroom;
import testsuite.ibex.TerraceHouses2BlockSet.integrate.util.IntegIbexTerraceHouses2BlockSet;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class Multiplicity extends IntegrateTestCase<District, Playroom> {

	public final static String projectName = "TerraceHouses2BlockSet";

	private TerraceHousesHelper helperTerraceHouses;
	private WoodenBlockSetHelper helperWoodenBlockSet;

	public Multiplicity() {
		super(new IntegIbexTerraceHouses2BlockSet(projectName, "multipl"));
	}

	@Override
	protected void initHelpers() {
		helperTerraceHouses = new TerraceHousesHelper();
		helperWoodenBlockSet = new WoodenBlockSetHelper();
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}

	private final String testpath = "integrate/expected/multipl/";

	private final IntegrationPattern pattern = new IntegrationPattern(Arrays.asList( //
			APPLY_USER_DELTA //
//			, REPAIR //
			, RESOLVE_CONFLICTS //
			, RESOLVE_BROKEN_MATCHES //
			, TRANSLATE //
			, CLEAN_UP //
	));

	private void multiplicityConflict(Consumer<OperationalMultiplicityConflict> s, String path) {
		AtomicBoolean detectedConflict = new AtomicBoolean(false);

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver(c -> {
			detectedConflict.set(true);
			assertEquals(1, c.getConflicts().stream().filter(cft -> cft instanceof OperationalMultiplicityConflict).count());
			CRSHelper.forEachResolve(c, OperationalMultiplicityConflict.class, s);
		});
		tool.applyAndIntegrateDelta((d, p) -> {
			// src:
			helperTerraceHouses.createBuilding(helperTerraceHouses.getBuilding(d, "Colorado Apartments"), "Left Building", null);
			// trg:
			BlockSet set = helperWoodenBlockSet.getConstruction(p, "Colorado Apartments").getBlockSet();
			Construction constr = helperWoodenBlockSet.createConstruction(set, "Right Building");
			helperWoodenBlockSet.createCuboid(constr, "red");
		});

		assertTrue(detectedConflict.get());
		assertCondition(path);
	}

	@Test
	public void multiplicityConflict_preferSource() {
		multiplicityConflict(s -> s.crs_preferSource(), testpath + "multipl_src/");
	}

	@Test
	public void multiplicityConflict_preferTarget() {
		multiplicityConflict(s -> s.crs_preferTarget(), testpath + "multipl_trg/");
	}

	@Test
	public void noMultiplicityConflict() {
		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver(cc -> {
			CRSHelper.forEachResolve(cc, DeletePreserveConflict.class, c -> c.crs_revokeDeletion());
			CRSHelper.forEachConflict(cc, c -> {
				assertFalse(c instanceof OperationalMultiplicityConflict);
			});
		});

		tool.applyAndIntegrateDelta((d, p) -> {
			// src:
			d.getStreetBeginnings().clear();
			// trg:
			Construction constr = helperWoodenBlockSet.getConstruction(p, "Colorado Apartments");
			helperWoodenBlockSet.createCuboid(constr, "yellow");
		});
		
		assertCondition(testpath + "no_multipl/");
	}

}
