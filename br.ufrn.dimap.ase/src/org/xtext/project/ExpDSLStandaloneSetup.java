
package org.xtext.project;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ExpDSLStandaloneSetup extends ExpDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new ExpDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	
	public static void main(String args[]){
		Injector injector = new ExpDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		URI uri = URI.createURI("teste.myexp");
		// Resource xtextResource = resourceSet.createResource(uri);
		Resource xtextResource = resourceSet.getResource(uri, true);
		
		EcoreUtil.resolveAll(xtextResource);
		
		Resource xmiResource = resourceSet.createResource(URI.createURI("teste.xmi"));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
	}
	}
}

