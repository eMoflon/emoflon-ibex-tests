/*
 * generated by Xtext 2.37.0
 */
package org.emoflon.express.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.emoflon.express.ui.internal.ExpressActivator;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ExpressExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(ExpressActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		ExpressActivator activator = ExpressActivator.getInstance();
		return activator != null ? activator.getInjector(ExpressActivator.ORG_EMOFLON_EXPRESS_EXPRESS) : null;
	}

}
