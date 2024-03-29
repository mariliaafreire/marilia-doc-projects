/*
* generated by Xtext
*/
package br.ufrn.dimap.ase.dsl;

import org.eclipse.xtext.junit.GlobalRegistries;
import org.eclipse.xtext.junit.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipse.xtext.junit4.IRegistryConfigurator;

import com.google.inject.Injector;

public class Expdslv3InjectorProvider implements IInjectorProvider, IRegistryConfigurator {
	private GlobalStateMemento globalStateMemento;
	private Injector injector;

	static {
		GlobalRegistries.initializeDefaults();
	}
	
	public Injector getInjector() {
		if (injector == null) {
			this.injector = new Expdslv3StandaloneSetup().createInjectorAndDoEMFRegistration();
		}
		return injector;
	}
	
	public void restoreRegistry() {
		globalStateMemento.restoreGlobalState();
	}

	public void setupRegistry() {
		globalStateMemento = GlobalRegistries.makeCopyOfGlobalState();
	}
	
}
