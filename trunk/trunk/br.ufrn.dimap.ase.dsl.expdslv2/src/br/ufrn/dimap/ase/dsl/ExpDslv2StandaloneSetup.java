package br.ufrn.dimap.ase.dsl;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class ExpDslv2StandaloneSetup extends ExpDslv2StandaloneSetupGenerated {

	public static void doSetup() {
		new ExpDslv2StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
