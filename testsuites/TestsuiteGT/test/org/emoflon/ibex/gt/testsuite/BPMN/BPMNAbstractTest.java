package org.emoflon.ibex.gt.testsuite.BPMN;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.testsuite.GTTestCase;

import BPMNGraphTransformation.api.BPMNGraphTransformationAPI;
import bpmn2.Bpmn2Package;

/**
 * Abstract test class for the BPMN Graph Transformation API. All tests for this
 * API should inherit from this class.
 */
public class BPMNAbstractTest extends GTTestCase<BPMNGraphTransformationAPI> {

	@Override
	protected String getTestName() {
		return "BPMN";
	}

	@Override
	protected BPMNGraphTransformationAPI getAPI(final IContextPatternInterpreter engine,
			final ResourceSet model) {
		return new BPMNGraphTransformationAPI(engine, model, GTTestCase.workspacePath);
	}

	@Override
	protected Map<String, EPackage> getMetaModelPackages() {
		HashMap<String, EPackage> map = new HashMap<String, EPackage>();
		map.put(Bpmn2Package.eNS_URI, Bpmn2Package.eINSTANCE);
		return map;
	}
}
