package org.emoflon.ibex.gt.testsuite.BPMNIR;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.testsuite.GTTestCase;

import BPMNIRGraphTransformation.api.BPMNIRGraphTransformationAPI;
import bpmn2.Bpmn2Package;
import bpmn2InstanceRepresentation.Bpmn2InstanceRepresentationPackage;

/**
 * Abstract test class for the BPMN IR Graph Transformation API. All tests for
 * this API should inherit from this class.
 */
public class BPMNIRAbstractTest extends GTTestCase<BPMNIRGraphTransformationAPI> {

	@Override
	protected String getTestName() {
		return "BPMN-IR";
	}

	@Override
	protected BPMNIRGraphTransformationAPI getAPI(final IContextPatternInterpreter engine, final ResourceSet model) {
		return new BPMNIRGraphTransformationAPI(engine, model, GTTestCase.workspacePath);
	}

	@Override
	protected Map<String, EPackage> getMetaModelPackages() {
		HashMap<String, EPackage> map = new HashMap<String, EPackage>();
		map.put(Bpmn2Package.eNS_URI, Bpmn2Package.eINSTANCE);
		map.put(Bpmn2InstanceRepresentationPackage.eNS_URI, Bpmn2InstanceRepresentationPackage.eINSTANCE);
		return map;
	}
}
