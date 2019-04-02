package org.emoflon.ibex.tgg.run.adele2aadl;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.adele2aadl.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.osate.aadl2.impl.Aadl2PackageImpl;
import org.osate.aadl2.impl.AadlPackageImpl;
import org.osate.aadl2.instance.impl.InstancePackageImpl;
// import org.osate.aadl2.impl.Aadl2PackageImpl;
// import org.osate.aadl2.instance.impl.InstancePackageImpl;
import org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl;
import org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl;
import org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl;
import org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl;
import org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl;
import org.topcased.adele.model.ba_components.impl.Ba_componentsPackageImpl;
import org.topcased.adele.model.ba_features.impl.Ba_featuresPackageImpl;
import org.topcased.adele.model.ba_relations.impl.Ba_relationsPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		

		EPackage adele_comp = ADELE_ComponentsPackageImpl.init();

		rs.getPackageRegistry().put("platform:/resource/Adele2Aadl/metamodels/src/ADELE_Components.ecore", adele_comp);
		EPackage adele_feat = ADELE_FeaturesPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/Adele2Aadl/metamodels/src/ADELE_Features.ecore", adele_feat);
		
		
		EPackage adele_rel = ADELE_RelationsPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/Adele2Aadl/metamodels/src/ADELE_Relations.ecore", adele_rel);
		
		EPackage ba_comp = Ba_componentsPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/Adele2Aadl/metamodels/src/BA_components.ecore",ba_comp);

		
		EPackage ba_rel = Ba_relationsPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/Adele2Aadl/metamodels/src/BA_relations.ecore",ba_rel);

		EPackage ba_feat = Ba_featuresPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/Adele2Aadl/metamodels/src/BA_features.ecore",ba_feat );

		
		EPackage ker_sp = KernelSpicesPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/Adele2Aadl/metamodels/src/KernelSpices.ecore",ker_sp);

		
		EPackage obj_des= ObjectDescriptionModelPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/Adele2Aadl/metamodels/src/ObjectDescriptionModel.ecore",obj_des );

		EPackage aadl_trg= Aadl2PackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/Adele2Aadl/metamodels/trg/aadl2.ecore",aadl_trg);
		
		EPackage aadl_inst= InstancePackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/Adele2Aadl/metamodels/trg/instance.ecore",aadl_inst);
		
//		strategy.loadAndRegisterMetamodel("platform:/resource/Adele2Aadl/metamodels/trg/aadl2.ecore");
//		strategy.loadAndRegisterMetamodel("platform:/resource/Adele2Aadl/metamodels/trg/instance.ecore");
//		

	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("Adele2Aadl");
		options.projectPath("Adele2Aadl");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
