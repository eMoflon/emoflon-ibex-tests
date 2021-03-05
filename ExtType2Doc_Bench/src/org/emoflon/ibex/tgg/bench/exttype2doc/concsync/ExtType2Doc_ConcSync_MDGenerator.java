package org.emoflon.ibex.tgg.bench.exttype2doc.concsync;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.bench.exttype2doc.ExtType2Doc_MDGenerator;

import ExtDocModel.Doc;
import ExtDocModel.Entry;
import ExtDocModel.EntryType;
import ExtDocModel.GlossaryEntry;
import ExtType2Doc_ConcSync.ExtType2Doc_ConcSyncFactory;
import ExtType2Doc_ConcSync.ExtendingType2Doc__Marker;
import ExtType2Doc_ConcSync.Field2Entry;
import ExtType2Doc_ConcSync.Field2Entry__Marker;
import ExtType2Doc_ConcSync.GlossaryEntry__Marker;
import ExtType2Doc_ConcSync.GlossaryLink__Marker;
import ExtType2Doc_ConcSync.Method2Entry;
import ExtType2Doc_ConcSync.Method2Entry__Marker;
import ExtType2Doc_ConcSync.Package2DocCont;
import ExtType2Doc_ConcSync.Package2DocCont__Marker;
import ExtType2Doc_ConcSync.Param2Entry;
import ExtType2Doc_ConcSync.Param2Entry__Marker;
import ExtType2Doc_ConcSync.Type2Doc;
import ExtType2Doc_ConcSync.Type2Doc__Marker;
import ExtTypeModel.Field;
import ExtTypeModel.Method;
import ExtTypeModel.Parameter;
import ExtTypeModel.Type;

public class ExtType2Doc_ConcSync_MDGenerator extends ExtType2Doc_MDGenerator<ExtType2Doc_ConcSyncFactory, ExtType2Doc_ConcSync_Params> {

	private int glossaryLinkCounter;

	public ExtType2Doc_ConcSync_MDGenerator(Resource source, Resource target, Resource corr, Resource protocol, Resource delta) {
		super(source, target, corr, protocol, delta);
	}

	@Override
	protected ExtType2Doc_ConcSyncFactory corrFactoryInstance() {
		return ExtType2Doc_ConcSyncFactory.eINSTANCE;
	}

	//// MODEL ////

	@Override
	protected void genModel() {
		glossaryLinkCounter = 0;

		createContainers();
		createGlossaryEntries();
		createTypeAndDocHierarchies();
	}

	private void createContainers() {
		// SRC
		createContainerPackage();
		// TRG
		createDocContainer();
		createGlossary();
		// CORR
		Package2DocCont p2dc = (Package2DocCont) createCorr(cFactory.createPackage2DocCont(), sContainer, tContainer);
		// MARKER
		Package2DocCont__Marker marker = cFactory.createPackage2DocCont__Marker();
		marker.setCREATE__SRC__p(sContainer);
		marker.setCREATE__CORR__p2dc(p2dc);
		marker.setCREATE__TRG__dc(tContainer);
		protocol.getContents().add(marker);
	}

	private void createTypeAndDocHierarchies() {
		for (int i = 0; i < parameters.num_of_root_types; i++)
			createRootTypeAndDoc(i);
	}

	private void createRootTypeAndDoc(int index) {
		String postfix = SEP + index;

		// SRC
		Type t = createType(postfix, false, sContainer);
		// TRG
		Doc d = createDoc(postfix);
		// CORR
		Type2Doc t2d = (Type2Doc) createCorr(cFactory.createType2Doc(), t, d);
		// MARKER
		Type2Doc__Marker marker = cFactory.createType2Doc__Marker();
		marker.setCONTEXT__SRC__p(sContainer);
		marker.setCONTEXT__CORR__p2dc((Package2DocCont) src2corr.get(sContainer));
		marker.setCONTEXT__TRG__dc(tContainer);
		marker.setCREATE__SRC__t(t);
		marker.setCREATE__CORR__t2d(t2d);
		marker.setCREATE__TRG__d(d);
		protocol.getContents().add(marker);

		createMethodsAndEntries(t, d, postfix);
		createFieldsAndEntries(t, d, postfix);

		createTypeAndDocHierarchy(t, d, 1, postfix);
	}

	private void createTypeAndDocHierarchy(Type rootT, Doc rootD, int currentDepth, String oldPostfix) {
		if (currentDepth >= parameters.inheritance_depth)
			return;

		for (int i = 0; i < parameters.horizontal_inheritance_scale; i++)
			createTypeAndDocInheritance(rootT, rootD, currentDepth, oldPostfix, i);
	}

	private void createTypeAndDocInheritance(Type superT, Doc superD, int currentDepth, String oldPostfix, int index) {
		String postfix = oldPostfix + SEP + index;

		// SRC
		Type t = createType(postfix, false, sContainer);
		createTypeInheritance(superT, t);
		// TRG
		Doc d = createDoc(postfix);
		createDocLink(superD, d);
		// CORR
		Type2Doc t2d = (Type2Doc) createCorr(cFactory.createType2Doc(), t, d);
		// MARKER
		ExtendingType2Doc__Marker marker = cFactory.createExtendingType2Doc__Marker();
		marker.setCONTEXT__SRC__p(sContainer);
		marker.setCONTEXT__CORR__p2dc((Package2DocCont) src2corr.get(sContainer));
		marker.setCONTEXT__TRG__dc(tContainer);
		marker.setCONTEXT__SRC__t(superT);
		marker.setCONTEXT__CORR__t2d((Type2Doc) src2corr.get(superT));
		marker.setCONTEXT__TRG__d(superD);
		marker.setCREATE__SRC__nt(t);
		marker.setCREATE__CORR__nt2nd(t2d);
		marker.setCREATE__TRG__nd(d);
		protocol.getContents().add(marker);

		createMethodsAndEntries(t, d, postfix);
		createFieldsAndEntries(t, d, postfix);

		switch (parameters.scaleOrientation) {
		case HORIZONTAL:
			createTypeAndDocHierarchy(t, d, currentDepth + 1, postfix);
			break;
		case VERTICAL:
			if (index == 0)
				createTypeAndDocHierarchy(t, d, currentDepth + 1, postfix);
			break;
		default:
			break;
		}
	}

	private void createMethodsAndEntries(Type t, Doc d, String oldPostfix) {
		for (int i = 0; i < parameters.num_of_methods; i++)
			createMethodAndEntry(t, d, oldPostfix, i);
	}

	private void createMethodAndEntry(Type t, Doc d, String oldPostfix, int index) {
		String postfix = oldPostfix + SEP + index;

		// SRC
		Method m = createMethod(postfix, t);
		// TRG
		Entry e = createEntry(postfix, EntryType.METHOD, d);
		// CORR
		Method2Entry m2e = (Method2Entry) createCorr(cFactory.createMethod2Entry(), m, e);
		// MARKER
		Method2Entry__Marker marker = cFactory.createMethod2Entry__Marker();
		marker.setCONTEXT__SRC__t(t);
		marker.setCONTEXT__CORR__t2d((Type2Doc) src2corr.get(t));
		marker.setCONTEXT__TRG__d(d);
		marker.setCREATE__SRC__m(m);
		marker.setCREATE__CORR__m2e(m2e);
		marker.setCREATE__TRG__e(e);
		protocol.getContents().add(marker);

		createParameters(m, e, postfix);
		createGlossaryLinks(e);
	}

	private void createFieldsAndEntries(Type t, Doc d, String oldPostfix) {
		for (int i = 0; i < parameters.num_of_fields; i++)
			createFieldAndEntry(t, d, oldPostfix, i);
	}

	private void createFieldAndEntry(Type t, Doc d, String oldPostfix, int index) {
		String postfix = oldPostfix + SEP + index;

		// SRC
		Field f = createField(postfix, t);
		// TRG
		Entry e = createEntry(postfix, EntryType.FIELD, d);
		// CORR
		Field2Entry f2e = (Field2Entry) createCorr(cFactory.createField2Entry(), f, e);
		// MARKER
		Field2Entry__Marker marker = cFactory.createField2Entry__Marker();
		marker.setCONTEXT__SRC__t(t);
		marker.setCONTEXT__CORR__t2d((Type2Doc) src2corr.get(t));
		marker.setCONTEXT__TRG__d(d);
		marker.setCREATE__SRC__f(f);
		marker.setCREATE__CORR__f2e(f2e);
		marker.setCREATE__TRG__e(e);
		protocol.getContents().add(marker);

		createGlossaryLinks(e);
	}

	private void createParameters(Method m, Entry e, String oldPostfix) {
		for (int i = 0; i < parameters.num_of_parameters; i++)
			createParameters(m, e, oldPostfix, i);
	}

	private void createParameters(Method m, Entry e, String oldPostfix, int index) {
		String postfix = oldPostfix + SEP + index;

		// SRC
		Parameter p = createParameter(postfix, m);
		// CORR
		Param2Entry p2e = (Param2Entry) createCorr(cFactory.createParam2Entry(), p, e);
		// MARKER
		Param2Entry__Marker marker = cFactory.createParam2Entry__Marker();
		marker.setCONTEXT__SRC__m(m);
		marker.setCONTEXT__CORR__m2e((Method2Entry) src2corr.get(m));
		marker.setCONTEXT__TRG__e(e);
		marker.setCREATE__SRC__p(p);
		marker.setCREATE__CORR__p2e(p2e);
		protocol.getContents().add(marker);
	}

	private void createGlossaryEntries() {
		for (int i = 0; i < parameters.num_of_glossar_entries; i++)
			createGlossaryEntry(i);
	}

	private void createGlossaryEntry(int index) {
		String postfix = SEP + index;

		// TRG
		GlossaryEntry ge = createGlossaryEntry(postfix);
		// MARKER
		GlossaryEntry__Marker marker = cFactory.createGlossaryEntry__Marker();
		marker.setCONTEXT__TRG__g(tContainer.getGlossary());
		marker.setCREATE__TRG__ge(ge);
		protocol.getContents().add(marker);
	}

	private void createGlossaryLinks(Entry e) {
		for (int i = 0; i < parameters.num_of_glossar_links_per_entry; i++)
			createGlossaryLink(e, i);
	}

	private void createGlossaryLink(Entry e, int index) {
		String glossaryEntryName = "GlossaryEntry" + SEP + (glossaryLinkCounter % parameters.num_of_glossar_entries);
		GlossaryEntry ge = name2glossaryEntry.get(glossaryEntryName);
		glossaryLinkCounter++;

		// TRG
		createGlossaryLink(e, ge);
		// MARKER
		GlossaryLink__Marker marker = cFactory.createGlossaryLink__Marker();
		marker.setCONTEXT__TRG__e(e);
		marker.setCONTEXT__TRG__ge(ge);
		protocol.getContents().add(marker);
	}

	//// DELTA ////

	@Override
	protected void genDelta() {
		// TODO Auto-generated method stub

	}

}
