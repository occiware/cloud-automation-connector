/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.occiware.cloudautomation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.occiware.cloudautomation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudautomationFactoryImpl extends EFactoryImpl implements CloudautomationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloudautomationFactory init() {
		try {
			CloudautomationFactory theCloudautomationFactory = (CloudautomationFactory)EPackage.Registry.INSTANCE.getEFactory(CloudautomationPackage.eNS_URI);
			if (theCloudautomationFactory != null) {
				return theCloudautomationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CloudautomationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudautomationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CloudautomationPackage.CLOUDAUTOMATIONNETWORK: return createCloudautomationnetwork();
			case CloudautomationPackage.CLOUDAUTOMATIONINSTANCE: return createCloudautomationinstance();
			case CloudautomationPackage.CLOUDAUTOMATIONSTORAGE: return createCloudautomationstorage();
			case CloudautomationPackage.PROVIDER: return createProvider();
			case CloudautomationPackage.CREDENTIALS: return createCredentials();
			case CloudautomationPackage.INSTANCETEMPLATE: return createInstancetemplate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloudautomationnetwork createCloudautomationnetwork() {
		CloudautomationnetworkImpl cloudautomationnetwork = new CloudautomationnetworkImpl();
		return cloudautomationnetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloudautomationinstance createCloudautomationinstance() {
		CloudautomationinstanceImpl cloudautomationinstance = new CloudautomationinstanceImpl();
		return cloudautomationinstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloudautomationstorage createCloudautomationstorage() {
		CloudautomationstorageImpl cloudautomationstorage = new CloudautomationstorageImpl();
		return cloudautomationstorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Credentials createCredentials() {
		CredentialsImpl credentials = new CredentialsImpl();
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instancetemplate createInstancetemplate() {
		InstancetemplateImpl instancetemplate = new InstancetemplateImpl();
		return instancetemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudautomationPackage getCloudautomationPackage() {
		return (CloudautomationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CloudautomationPackage getPackage() {
		return CloudautomationPackage.eINSTANCE;
	}

} //CloudautomationFactoryImpl
