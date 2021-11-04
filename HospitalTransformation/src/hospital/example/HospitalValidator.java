package hospital.example;

import org.eclipse.emf.common.util.URI;
import hospital.HospitalTransformation.api.HospitalTransformationHiPEApp;

public class HospitalValidator extends HospitalTransformationHiPEApp  {
	
	public HospitalValidator() {
		createModel(URI.createURI("hospital.xmi"));
	}	

}
