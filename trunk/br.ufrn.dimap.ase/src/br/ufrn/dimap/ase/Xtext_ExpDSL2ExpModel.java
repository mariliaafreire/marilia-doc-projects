package br.ufrn.dimap.ase;

import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.project.ExpDSLStandaloneSetup;

import com.google.inject.Injector;

public class Xtext_ExpDSL2ExpModel {
	 public Xtext_ExpDSL2ExpModel(String inModelPath, String outModelPath) throws IOException {
	    	
	    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("myexp", org.xtext.project.expDSL.ExpDSLPackage.eINSTANCE);
	    	    	
	    	Injector injector = new ExpDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
			ResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
			Resource xtextResource = resourceSet.getResource(URI.createURI("\\"+inModelPath), true);
			xtextResource.load(null);
			EcoreUtil.resolveAll(xtextResource);
			Resource xmiResource = resourceSet.createResource(URI.createURI("\\"+outModelPath));
			xmiResource.getContents().add(xtextResource.getContents().get(0));
			xmiResource.save(null);
	    }
}
