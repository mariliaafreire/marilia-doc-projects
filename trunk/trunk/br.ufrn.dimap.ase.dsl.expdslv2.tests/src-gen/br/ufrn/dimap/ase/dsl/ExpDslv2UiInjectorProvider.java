/*
* generated by Xtext
*/
package br.ufrn.dimap.ase.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ExpDslv2UiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return br.ufrn.dimap.ase.dsl.ui.internal.ExpDslv2Activator.getInstance().getInjector("br.ufrn.dimap.ase.dsl.ExpDslv2");
	}
	
}
