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
package org.occiware.cloudautomation.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.infrastructure.util.InfrastructureValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.occiware.cloudautomation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.occiware.cloudautomation.CloudautomationPackage
 * @generated
 */
public class CloudautomationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CloudautomationValidator INSTANCE = new CloudautomationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.occiware.cloudautomation";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROVIDER__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Credentials'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREDENTIALS__APPLIES_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Instancetemplate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTANCETEMPLATE__APPLIES_CONSTRAINT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCCIValidator occiValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureValidator infrastructureValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudautomationValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
		infrastructureValidator = InfrastructureValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CloudautomationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CloudautomationPackage.CLOUDAUTOMATIONNETWORK:
				return validateCloudautomationnetwork((Cloudautomationnetwork)value, diagnostics, context);
			case CloudautomationPackage.CLOUDAUTOMATIONINSTANCE:
				return validateCloudautomationinstance((Cloudautomationinstance)value, diagnostics, context);
			case CloudautomationPackage.CLOUDAUTOMATIONSTORAGE:
				return validateCloudautomationstorage((Cloudautomationstorage)value, diagnostics, context);
			case CloudautomationPackage.PROVIDER:
				return validateProvider((Provider)value, diagnostics, context);
			case CloudautomationPackage.CREDENTIALS:
				return validateCredentials((Credentials)value, diagnostics, context);
			case CloudautomationPackage.INSTANCETEMPLATE:
				return validateInstancetemplate((Instancetemplate)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudautomationnetwork(Cloudautomationnetwork cloudautomationnetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cloudautomationnetwork, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cloudautomationnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cloudautomationnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cloudautomationnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cloudautomationnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cloudautomationnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cloudautomationnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cloudautomationnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cloudautomationnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(cloudautomationnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(cloudautomationnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(cloudautomationnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(cloudautomationnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(cloudautomationnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(cloudautomationnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= infrastructureValidator.validateNetworkinterface_targetConstraint(cloudautomationnetwork, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudautomationinstance(Cloudautomationinstance cloudautomationinstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cloudautomationinstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cloudautomationinstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cloudautomationinstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cloudautomationinstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cloudautomationinstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cloudautomationinstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cloudautomationinstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cloudautomationinstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cloudautomationinstance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(cloudautomationinstance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(cloudautomationinstance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(cloudautomationinstance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(cloudautomationinstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudautomationstorage(Cloudautomationstorage cloudautomationstorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cloudautomationstorage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cloudautomationstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cloudautomationstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cloudautomationstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cloudautomationstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cloudautomationstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cloudautomationstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cloudautomationstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cloudautomationstorage, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(cloudautomationstorage, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(cloudautomationstorage, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(cloudautomationstorage, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(cloudautomationstorage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvider(Provider provider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(provider, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validateProvider_appliesConstraint(provider, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvider_appliesConstraint(Provider provider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return provider.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredentials(Credentials credentials, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(credentials, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validateCredentials_appliesConstraint(credentials, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Credentials</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredentials_appliesConstraint(Credentials credentials, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return credentials.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstancetemplate(Instancetemplate instancetemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instancetemplate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instancetemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instancetemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instancetemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instancetemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instancetemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instancetemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instancetemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instancetemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstancetemplate_appliesConstraint(instancetemplate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Instancetemplate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstancetemplate_appliesConstraint(Instancetemplate instancetemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return instancetemplate.appliesConstraint(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CloudautomationValidator
