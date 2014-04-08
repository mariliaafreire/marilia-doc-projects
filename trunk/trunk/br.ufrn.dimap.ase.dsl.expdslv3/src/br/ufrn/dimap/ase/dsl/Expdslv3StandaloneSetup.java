
package br.ufrn.dimap.ase.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Expdslv3StandaloneSetup extends Expdslv3StandaloneSetupGenerated{

	public static void doSetup() {
		new Expdslv3StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

