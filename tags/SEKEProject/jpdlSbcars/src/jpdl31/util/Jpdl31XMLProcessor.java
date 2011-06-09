/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.util;

import java.util.Map;

import jpdl31.Jpdl31Package;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Jpdl31XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jpdl31XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Jpdl31Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Jpdl31ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Jpdl31ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Jpdl31ResourceFactoryImpl());
		}
		return registrations;
	}

} //Jpdl31XMLProcessor
