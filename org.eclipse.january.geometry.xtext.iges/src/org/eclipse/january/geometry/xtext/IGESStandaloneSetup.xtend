/*
 * generated by Xtext 2.9.1
 */
package org.eclipse.january.geometry.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class IGESStandaloneSetup extends IGESStandaloneSetupGenerated {

	def static void doSetup() {
		new IGESStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
