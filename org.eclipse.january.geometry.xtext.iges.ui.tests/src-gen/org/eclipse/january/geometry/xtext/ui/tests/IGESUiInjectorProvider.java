/*
 * generated by Xtext 2.9.1
 */
package org.eclipse.january.geometry.xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.january.geometry.xtext.iges.ui.internal.IgesActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class IGESUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return IgesActivator.getInstance().getInjector("org.eclipse.january.geometry.xtext.IGES");
	}

}
