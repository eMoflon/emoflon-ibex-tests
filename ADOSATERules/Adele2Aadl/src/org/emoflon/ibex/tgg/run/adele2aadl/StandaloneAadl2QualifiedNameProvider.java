package org.emoflon.ibex.tgg.run.adele2aadl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.PackageSection;
import org.osate.aadl2.Property;
import org.osate.aadl2.PropertyConstant;
import org.osate.aadl2.PropertySet;
import org.osate.aadl2.PropertyType;
import org.osate.aadl2.modelsupport.util.AadlUtil;
import org.osate.annexsupport.AnnexLinkingService;
import org.osate.annexsupport.AnnexRegistry;
import org.osate.xtext.aadl2.naming.Aadl2QualifiedNameProvider;

public class StandaloneAadl2QualifiedNameProvider extends Aadl2QualifiedNameProvider {
	
	protected StandaloneAnnexRegistry annexRegistry;

	protected AnnexLinkingService getAnnexLinkingService( final String annexName ) {
		if ( annexRegistry == null ) {
			annexRegistry = StandaloneAnnexRegistry.getRegistry(AnnexRegistry.ANNEX_LINKINGSERVICE_EXT_ID);
		}
		
		return annexRegistry.getAnnexLinkingService( annexName );
	}

	// Enable to limit indexing to global items
	@Override
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		if (!(obj instanceof NamedElement)) {
			return null;
		}
		NamedElement annex = AadlUtil.getContainingAnnex(obj);
		if (annex != null) {
			String annexName = annex.getName();
			if (annexName != null) {
//				if (annexlinkingserviceregistry == null) {
//					getAnnexLinkingServiceRegistry();
//				}
//				if (annexlinkingserviceregistry != null) {
				AnnexLinkingService linkingservice = getAnnexLinkingService(annexName);
				
				if ( linkingservice != null ) {
					return linkingservice.getFullyQualifiedName( obj );
//					}
				}
			}
		}
		if (obj instanceof AadlPackage || obj instanceof Classifier || obj instanceof PropertyConstant
				|| obj instanceof Property || obj instanceof PropertySet || obj instanceof PropertyType ||
				// DB: We also want a qualified name for package sections
				obj instanceof PackageSection) {
			if (((NamedElement) obj).getName() == null) {
				return null;
			}
			return getConverter().toQualifiedName(getTheName((NamedElement) obj));
		}
		return null;
	}
}
