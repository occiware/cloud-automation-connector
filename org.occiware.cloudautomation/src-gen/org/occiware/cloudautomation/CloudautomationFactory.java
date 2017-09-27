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
package org.occiware.cloudautomation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.occiware.cloudautomation.CloudautomationPackage
 * @generated
 */
public interface CloudautomationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudautomationFactory eINSTANCE = org.occiware.cloudautomation.impl.CloudautomationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cloudautomationnetwork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloudautomationnetwork</em>'.
	 * @generated
	 */
	Cloudautomationnetwork createCloudautomationnetwork();

	/**
	 * Returns a new object of class '<em>Cloudautomationinstance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloudautomationinstance</em>'.
	 * @generated
	 */
	Cloudautomationinstance createCloudautomationinstance();

	/**
	 * Returns a new object of class '<em>Cloudautomationstorage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloudautomationstorage</em>'.
	 * @generated
	 */
	Cloudautomationstorage createCloudautomationstorage();

	/**
	 * Returns a new object of class '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider</em>'.
	 * @generated
	 */
	Provider createProvider();

	/**
	 * Returns a new object of class '<em>Credentials</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Credentials</em>'.
	 * @generated
	 */
	Credentials createCredentials();

	/**
	 * Returns a new object of class '<em>Instancetemplate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instancetemplate</em>'.
	 * @generated
	 */
	Instancetemplate createInstancetemplate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CloudautomationPackage getCloudautomationPackage();

} //CloudautomationFactory
