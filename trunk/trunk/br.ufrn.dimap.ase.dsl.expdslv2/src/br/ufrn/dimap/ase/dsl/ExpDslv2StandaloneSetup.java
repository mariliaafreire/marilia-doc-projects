package br.ufrn.dimap.ase.dsl;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;


import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class ExpDslv2StandaloneSetup extends ExpDslv2StandaloneSetupGenerated {

	public static void doSetup() {
		new ExpDslv2StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	public static void main(String args[]){
		ExpDslv2StandaloneSetup expDslExecutor = new ExpDslv2StandaloneSetup();
		expDslExecutor.execute("ExemploProfes2014.expdsl", "ExemploProfes2014.xmi");
	}

	public void execute(String expDSLPath, String xmiPath) {
		Injector injector = new ExpDslv2StandaloneSetup().createInjectorAndDoEMFRegistration();
		
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		URI uri = URI.createURI(expDSLPath);
		// Resource xtextResource = resourceSet.createResource(uri);
		Resource xtextResource = resourceSet.getResource(uri, true);
		
		EcoreUtil.resolveAll(xtextResource);
		
		Resource xmiResource = resourceSet.createResource(URI.createURI(xmiPath));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
