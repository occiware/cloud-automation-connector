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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.occiware.cloudautomation.CloudautomationFactory
 * @model kind="package"
 * @generated
 */
public interface CloudautomationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cloudautomation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.occiware.cloudautomation/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cloudautomation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudautomationPackage eINSTANCE = org.occiware.cloudautomation.impl.CloudautomationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.occiware.cloudautomation.impl.CloudautomationnetworkImpl <em>Cloudautomationnetwork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.cloudautomation.impl.CloudautomationnetworkImpl
	 * @see org.occiware.cloudautomation.impl.CloudautomationPackageImpl#getCloudautomationnetwork()
	 * @generated
	 */
	int CLOUDAUTOMATIONNETWORK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK__ID = InfrastructurePackage.NETWORKINTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK__TITLE = InfrastructurePackage.NETWORKINTERFACE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK__KIND = InfrastructurePackage.NETWORKINTERFACE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK__LOCATION = InfrastructurePackage.NETWORKINTERFACE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK__ATTRIBUTES = InfrastructurePackage.NETWORKINTERFACE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK__MIXINS = InfrastructurePackage.NETWORKINTERFACE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK__PARTS = InfrastructurePackage.NETWORKINTERFACE__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK__SOURCE = InfrastructurePackage.NETWORKINTERFACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK__TARGET = InfrastructurePackage.NETWORKINTERFACE__TARGET;

	/**
	 * The feature id for the '<em><b>Occi Networkinterface Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK__OCCI_NETWORKINTERFACE_INTERFACE = InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Occi Networkinterface Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK__OCCI_NETWORKINTERFACE_MAC = InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_MAC;

	/**
	 * The feature id for the '<em><b>Occi Networkinterface State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK__OCCI_NETWORKINTERFACE_STATE = InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Networkinterface State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK__OCCI_NETWORKINTERFACE_STATE_MESSAGE = InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE_MESSAGE;

	/**
	 * The number of structural features of the '<em>Cloudautomationnetwork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK_FEATURE_COUNT = InfrastructurePackage.NETWORKINTERFACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK___OCCI_CREATE = InfrastructurePackage.NETWORKINTERFACE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK___OCCI_RETRIEVE = InfrastructurePackage.NETWORKINTERFACE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK___OCCI_UPDATE = InfrastructurePackage.NETWORKINTERFACE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK___OCCI_DELETE = InfrastructurePackage.NETWORKINTERFACE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Cloudautomationnetwork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONNETWORK_OPERATION_COUNT = InfrastructurePackage.NETWORKINTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.cloudautomation.impl.CloudautomationinstanceImpl <em>Cloudautomationinstance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.cloudautomation.impl.CloudautomationinstanceImpl
	 * @see org.occiware.cloudautomation.impl.CloudautomationPackageImpl#getCloudautomationinstance()
	 * @generated
	 */
	int CLOUDAUTOMATIONINSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__LOCATION = InfrastructurePackage.COMPUTE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__PARTS = InfrastructurePackage.COMPUTE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__RLINKS = InfrastructurePackage.COMPUTE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__OCCI_COMPUTE_ARCHITECTURE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__OCCI_COMPUTE_CORES = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__OCCI_COMPUTE_HOSTNAME = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__OCCI_COMPUTE_SHARE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__OCCI_COMPUTE_SPEED = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__OCCI_COMPUTE_MEMORY = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__OCCI_COMPUTE_STATE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE__OCCI_COMPUTE_STATE_MESSAGE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The number of structural features of the '<em>Cloudautomationinstance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Cloudautomationinstance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONINSTANCE_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.cloudautomation.impl.CloudautomationstorageImpl <em>Cloudautomationstorage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.cloudautomation.impl.CloudautomationstorageImpl
	 * @see org.occiware.cloudautomation.impl.CloudautomationPackageImpl#getCloudautomationstorage()
	 * @generated
	 */
	int CLOUDAUTOMATIONSTORAGE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE__ID = InfrastructurePackage.STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE__TITLE = InfrastructurePackage.STORAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE__KIND = InfrastructurePackage.STORAGE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE__LOCATION = InfrastructurePackage.STORAGE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE__ATTRIBUTES = InfrastructurePackage.STORAGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE__MIXINS = InfrastructurePackage.STORAGE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE__PARTS = InfrastructurePackage.STORAGE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE__SUMMARY = InfrastructurePackage.STORAGE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE__LINKS = InfrastructurePackage.STORAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE__RLINKS = InfrastructurePackage.STORAGE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE__OCCI_STORAGE_SIZE = InfrastructurePackage.STORAGE__OCCI_STORAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Occi Storage State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE__OCCI_STORAGE_STATE = InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Storage State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE__OCCI_STORAGE_STATE_MESSAGE = InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE_MESSAGE;

	/**
	 * The number of structural features of the '<em>Cloudautomationstorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE_FEATURE_COUNT = InfrastructurePackage.STORAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE___OCCI_CREATE = InfrastructurePackage.STORAGE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE___OCCI_RETRIEVE = InfrastructurePackage.STORAGE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE___OCCI_UPDATE = InfrastructurePackage.STORAGE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE___OCCI_DELETE = InfrastructurePackage.STORAGE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Online</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE___ONLINE = InfrastructurePackage.STORAGE___ONLINE;

	/**
	 * The operation id for the '<em>Offline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE___OFFLINE = InfrastructurePackage.STORAGE___OFFLINE;

	/**
	 * The number of operations of the '<em>Cloudautomationstorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONSTORAGE_OPERATION_COUNT = InfrastructurePackage.STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.cloudautomation.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.cloudautomation.impl.ProviderImpl
	 * @see org.occiware.cloudautomation.impl.CloudautomationPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Cloudautomation Provider Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__CLOUDAUTOMATION_PROVIDER_USERNAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cloudautomation Provider Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__CLOUDAUTOMATION_PROVIDER_TYPE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cloudautomation Provider Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__CLOUDAUTOMATION_PROVIDER_PASSWORD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cloudautomation Provider Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__CLOUDAUTOMATION_PROVIDER_ENDPOINT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.cloudautomation.impl.CredentialsImpl <em>Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.cloudautomation.impl.CredentialsImpl
	 * @see org.occiware.cloudautomation.impl.CloudautomationPackageImpl#getCredentials()
	 * @generated
	 */
	int CREDENTIALS = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Cloudautomation Credentials Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_PASSWORD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cloudautomation Credentials Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_USERNAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cloudautomation Credentials Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_ENDPOINT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.cloudautomation.impl.InstancetemplateImpl <em>Instancetemplate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.cloudautomation.impl.InstancetemplateImpl
	 * @see org.occiware.cloudautomation.impl.CloudautomationPackageImpl#getInstancetemplate()
	 * @generated
	 */
	int INSTANCETEMPLATE = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCETEMPLATE__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCETEMPLATE__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCETEMPLATE__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Cloudautomation Instancetemplate Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCETEMPLATE__CLOUDAUTOMATION_INSTANCETEMPLATE_IMAGE_NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instancetemplate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCETEMPLATE_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCETEMPLATE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instancetemplate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCETEMPLATE_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.occiware.cloudautomation.Cloudautomationnetwork <em>Cloudautomationnetwork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloudautomationnetwork</em>'.
	 * @see org.occiware.cloudautomation.Cloudautomationnetwork
	 * @generated
	 */
	EClass getCloudautomationnetwork();

	/**
	 * Returns the meta object for class '{@link org.occiware.cloudautomation.Cloudautomationinstance <em>Cloudautomationinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloudautomationinstance</em>'.
	 * @see org.occiware.cloudautomation.Cloudautomationinstance
	 * @generated
	 */
	EClass getCloudautomationinstance();

	/**
	 * Returns the meta object for class '{@link org.occiware.cloudautomation.Cloudautomationstorage <em>Cloudautomationstorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloudautomationstorage</em>'.
	 * @see org.occiware.cloudautomation.Cloudautomationstorage
	 * @generated
	 */
	EClass getCloudautomationstorage();

	/**
	 * Returns the meta object for class '{@link org.occiware.cloudautomation.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.occiware.cloudautomation.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.cloudautomation.Provider#getCloudautomationProviderUsername <em>Cloudautomation Provider Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudautomation Provider Username</em>'.
	 * @see org.occiware.cloudautomation.Provider#getCloudautomationProviderUsername()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_CloudautomationProviderUsername();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.cloudautomation.Provider#getCloudautomationProviderType <em>Cloudautomation Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudautomation Provider Type</em>'.
	 * @see org.occiware.cloudautomation.Provider#getCloudautomationProviderType()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_CloudautomationProviderType();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.cloudautomation.Provider#getCloudautomationProviderPassword <em>Cloudautomation Provider Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudautomation Provider Password</em>'.
	 * @see org.occiware.cloudautomation.Provider#getCloudautomationProviderPassword()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_CloudautomationProviderPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.cloudautomation.Provider#getCloudautomationProviderEndpoint <em>Cloudautomation Provider Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudautomation Provider Endpoint</em>'.
	 * @see org.occiware.cloudautomation.Provider#getCloudautomationProviderEndpoint()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_CloudautomationProviderEndpoint();

	/**
	 * Returns the meta object for the '{@link org.occiware.cloudautomation.Provider#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.cloudautomation.Provider#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProvider__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.cloudautomation.Credentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credentials</em>'.
	 * @see org.occiware.cloudautomation.Credentials
	 * @generated
	 */
	EClass getCredentials();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.cloudautomation.Credentials#getCloudautomationCredentialsPassword <em>Cloudautomation Credentials Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudautomation Credentials Password</em>'.
	 * @see org.occiware.cloudautomation.Credentials#getCloudautomationCredentialsPassword()
	 * @see #getCredentials()
	 * @generated
	 */
	EAttribute getCredentials_CloudautomationCredentialsPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.cloudautomation.Credentials#getCloudautomationCredentialsUsername <em>Cloudautomation Credentials Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudautomation Credentials Username</em>'.
	 * @see org.occiware.cloudautomation.Credentials#getCloudautomationCredentialsUsername()
	 * @see #getCredentials()
	 * @generated
	 */
	EAttribute getCredentials_CloudautomationCredentialsUsername();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.cloudautomation.Credentials#getCloudautomationCredentialsEndpoint <em>Cloudautomation Credentials Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudautomation Credentials Endpoint</em>'.
	 * @see org.occiware.cloudautomation.Credentials#getCloudautomationCredentialsEndpoint()
	 * @see #getCredentials()
	 * @generated
	 */
	EAttribute getCredentials_CloudautomationCredentialsEndpoint();

	/**
	 * Returns the meta object for the '{@link org.occiware.cloudautomation.Credentials#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.cloudautomation.Credentials#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCredentials__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.cloudautomation.Instancetemplate <em>Instancetemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instancetemplate</em>'.
	 * @see org.occiware.cloudautomation.Instancetemplate
	 * @generated
	 */
	EClass getInstancetemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.cloudautomation.Instancetemplate#getCloudautomationInstancetemplateImageName <em>Cloudautomation Instancetemplate Image Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudautomation Instancetemplate Image Name</em>'.
	 * @see org.occiware.cloudautomation.Instancetemplate#getCloudautomationInstancetemplateImageName()
	 * @see #getInstancetemplate()
	 * @generated
	 */
	EAttribute getInstancetemplate_CloudautomationInstancetemplateImageName();

	/**
	 * Returns the meta object for the '{@link org.occiware.cloudautomation.Instancetemplate#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.cloudautomation.Instancetemplate#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInstancetemplate__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CloudautomationFactory getCloudautomationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.occiware.cloudautomation.impl.CloudautomationnetworkImpl <em>Cloudautomationnetwork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.cloudautomation.impl.CloudautomationnetworkImpl
		 * @see org.occiware.cloudautomation.impl.CloudautomationPackageImpl#getCloudautomationnetwork()
		 * @generated
		 */
		EClass CLOUDAUTOMATIONNETWORK = eINSTANCE.getCloudautomationnetwork();

		/**
		 * The meta object literal for the '{@link org.occiware.cloudautomation.impl.CloudautomationinstanceImpl <em>Cloudautomationinstance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.cloudautomation.impl.CloudautomationinstanceImpl
		 * @see org.occiware.cloudautomation.impl.CloudautomationPackageImpl#getCloudautomationinstance()
		 * @generated
		 */
		EClass CLOUDAUTOMATIONINSTANCE = eINSTANCE.getCloudautomationinstance();

		/**
		 * The meta object literal for the '{@link org.occiware.cloudautomation.impl.CloudautomationstorageImpl <em>Cloudautomationstorage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.cloudautomation.impl.CloudautomationstorageImpl
		 * @see org.occiware.cloudautomation.impl.CloudautomationPackageImpl#getCloudautomationstorage()
		 * @generated
		 */
		EClass CLOUDAUTOMATIONSTORAGE = eINSTANCE.getCloudautomationstorage();

		/**
		 * The meta object literal for the '{@link org.occiware.cloudautomation.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.cloudautomation.impl.ProviderImpl
		 * @see org.occiware.cloudautomation.impl.CloudautomationPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Cloudautomation Provider Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__CLOUDAUTOMATION_PROVIDER_USERNAME = eINSTANCE.getProvider_CloudautomationProviderUsername();

		/**
		 * The meta object literal for the '<em><b>Cloudautomation Provider Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__CLOUDAUTOMATION_PROVIDER_TYPE = eINSTANCE.getProvider_CloudautomationProviderType();

		/**
		 * The meta object literal for the '<em><b>Cloudautomation Provider Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__CLOUDAUTOMATION_PROVIDER_PASSWORD = eINSTANCE.getProvider_CloudautomationProviderPassword();

		/**
		 * The meta object literal for the '<em><b>Cloudautomation Provider Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__CLOUDAUTOMATION_PROVIDER_ENDPOINT = eINSTANCE.getProvider_CloudautomationProviderEndpoint();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROVIDER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProvider__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.cloudautomation.impl.CredentialsImpl <em>Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.cloudautomation.impl.CredentialsImpl
		 * @see org.occiware.cloudautomation.impl.CloudautomationPackageImpl#getCredentials()
		 * @generated
		 */
		EClass CREDENTIALS = eINSTANCE.getCredentials();

		/**
		 * The meta object literal for the '<em><b>Cloudautomation Credentials Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_PASSWORD = eINSTANCE.getCredentials_CloudautomationCredentialsPassword();

		/**
		 * The meta object literal for the '<em><b>Cloudautomation Credentials Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_USERNAME = eINSTANCE.getCredentials_CloudautomationCredentialsUsername();

		/**
		 * The meta object literal for the '<em><b>Cloudautomation Credentials Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_ENDPOINT = eINSTANCE.getCredentials_CloudautomationCredentialsEndpoint();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREDENTIALS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCredentials__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.cloudautomation.impl.InstancetemplateImpl <em>Instancetemplate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.cloudautomation.impl.InstancetemplateImpl
		 * @see org.occiware.cloudautomation.impl.CloudautomationPackageImpl#getInstancetemplate()
		 * @generated
		 */
		EClass INSTANCETEMPLATE = eINSTANCE.getInstancetemplate();

		/**
		 * The meta object literal for the '<em><b>Cloudautomation Instancetemplate Image Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCETEMPLATE__CLOUDAUTOMATION_INSTANCETEMPLATE_IMAGE_NAME = eINSTANCE.getInstancetemplate_CloudautomationInstancetemplateImageName();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INSTANCETEMPLATE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getInstancetemplate__AppliesConstraint__DiagnosticChain_Map();

	}

} //CloudautomationPackage
