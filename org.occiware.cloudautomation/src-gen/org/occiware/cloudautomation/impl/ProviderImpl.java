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

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

import org.occiware.cloudautomation.CloudautomationPackage;
import org.occiware.cloudautomation.CloudautomationTables;
import org.occiware.cloudautomation.Provider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.cloudautomation.impl.ProviderImpl#getCloudautomationProviderUsername <em>Cloudautomation Provider Username</em>}</li>
 *   <li>{@link org.occiware.cloudautomation.impl.ProviderImpl#getCloudautomationProviderType <em>Cloudautomation Provider Type</em>}</li>
 *   <li>{@link org.occiware.cloudautomation.impl.ProviderImpl#getCloudautomationProviderPassword <em>Cloudautomation Provider Password</em>}</li>
 *   <li>{@link org.occiware.cloudautomation.impl.ProviderImpl#getCloudautomationProviderEndpoint <em>Cloudautomation Provider Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProviderImpl extends MixinBaseImpl implements Provider {
	/**
	 * The default value of the '{@link #getCloudautomationProviderUsername() <em>Cloudautomation Provider Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationProviderUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUDAUTOMATION_PROVIDER_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudautomationProviderUsername() <em>Cloudautomation Provider Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationProviderUsername()
	 * @generated
	 * @ordered
	 */
	protected String cloudautomationProviderUsername = CLOUDAUTOMATION_PROVIDER_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudautomationProviderType() <em>Cloudautomation Provider Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationProviderType()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUDAUTOMATION_PROVIDER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudautomationProviderType() <em>Cloudautomation Provider Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationProviderType()
	 * @generated
	 * @ordered
	 */
	protected String cloudautomationProviderType = CLOUDAUTOMATION_PROVIDER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudautomationProviderPassword() <em>Cloudautomation Provider Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationProviderPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUDAUTOMATION_PROVIDER_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudautomationProviderPassword() <em>Cloudautomation Provider Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationProviderPassword()
	 * @generated
	 * @ordered
	 */
	protected String cloudautomationProviderPassword = CLOUDAUTOMATION_PROVIDER_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudautomationProviderEndpoint() <em>Cloudautomation Provider Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationProviderEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUDAUTOMATION_PROVIDER_ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudautomationProviderEndpoint() <em>Cloudautomation Provider Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationProviderEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String cloudautomationProviderEndpoint = CLOUDAUTOMATION_PROVIDER_ENDPOINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudautomationPackage.Literals.PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCloudautomationProviderUsername() {
		return cloudautomationProviderUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudautomationProviderUsername(String newCloudautomationProviderUsername) {
		String oldCloudautomationProviderUsername = cloudautomationProviderUsername;
		cloudautomationProviderUsername = newCloudautomationProviderUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_USERNAME, oldCloudautomationProviderUsername, cloudautomationProviderUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCloudautomationProviderType() {
		return cloudautomationProviderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudautomationProviderType(String newCloudautomationProviderType) {
		String oldCloudautomationProviderType = cloudautomationProviderType;
		cloudautomationProviderType = newCloudautomationProviderType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_TYPE, oldCloudautomationProviderType, cloudautomationProviderType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCloudautomationProviderPassword() {
		return cloudautomationProviderPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudautomationProviderPassword(String newCloudautomationProviderPassword) {
		String oldCloudautomationProviderPassword = cloudautomationProviderPassword;
		cloudautomationProviderPassword = newCloudautomationProviderPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_PASSWORD, oldCloudautomationProviderPassword, cloudautomationProviderPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCloudautomationProviderEndpoint() {
		return cloudautomationProviderEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudautomationProviderEndpoint(String newCloudautomationProviderEndpoint) {
		String oldCloudautomationProviderEndpoint = cloudautomationProviderEndpoint;
		cloudautomationProviderEndpoint = newCloudautomationProviderEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_ENDPOINT, oldCloudautomationProviderEndpoint, cloudautomationProviderEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let severity : Integer[1] = 'Provider::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[?] = self.entity.oclIsKindOf(Cloudautomationnetwork) or
		 *         self.entity.oclIsKindOf(Cloudautomationinstance)
		 *       in
		 *         'Provider::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CloudautomationTables.STR_Provider_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CloudautomationTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cloudautomation_c_c_Cloudautomationnetwork = idResolver.getClass(CloudautomationTables.CLSSid_Cloudautomationnetwork, null);
			final /*@NonInvalid*/ Entity entity_0 = this.getEntity();
			final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_0, TYP_cloudautomation_c_c_Cloudautomationnetwork).booleanValue();
			/*@NonInvalid*/ boolean result;
			if (oclIsKindOf) {
				result = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cloudautomation_c_c_Cloudautomationinstance = idResolver.getClass(CloudautomationTables.CLSSid_Cloudautomationinstance, null);
				final /*@NonInvalid*/ boolean oclIsKindOf_0 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_0, TYP_cloudautomation_c_c_Cloudautomationinstance).booleanValue();
				result = oclIsKindOf_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, CloudautomationTables.STR_Provider_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, CloudautomationTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_USERNAME:
				return getCloudautomationProviderUsername();
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_TYPE:
				return getCloudautomationProviderType();
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_PASSWORD:
				return getCloudautomationProviderPassword();
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_ENDPOINT:
				return getCloudautomationProviderEndpoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_USERNAME:
				setCloudautomationProviderUsername((String)newValue);
				return;
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_TYPE:
				setCloudautomationProviderType((String)newValue);
				return;
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_PASSWORD:
				setCloudautomationProviderPassword((String)newValue);
				return;
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_ENDPOINT:
				setCloudautomationProviderEndpoint((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_USERNAME:
				setCloudautomationProviderUsername(CLOUDAUTOMATION_PROVIDER_USERNAME_EDEFAULT);
				return;
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_TYPE:
				setCloudautomationProviderType(CLOUDAUTOMATION_PROVIDER_TYPE_EDEFAULT);
				return;
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_PASSWORD:
				setCloudautomationProviderPassword(CLOUDAUTOMATION_PROVIDER_PASSWORD_EDEFAULT);
				return;
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_ENDPOINT:
				setCloudautomationProviderEndpoint(CLOUDAUTOMATION_PROVIDER_ENDPOINT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_USERNAME:
				return CLOUDAUTOMATION_PROVIDER_USERNAME_EDEFAULT == null ? cloudautomationProviderUsername != null : !CLOUDAUTOMATION_PROVIDER_USERNAME_EDEFAULT.equals(cloudautomationProviderUsername);
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_TYPE:
				return CLOUDAUTOMATION_PROVIDER_TYPE_EDEFAULT == null ? cloudautomationProviderType != null : !CLOUDAUTOMATION_PROVIDER_TYPE_EDEFAULT.equals(cloudautomationProviderType);
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_PASSWORD:
				return CLOUDAUTOMATION_PROVIDER_PASSWORD_EDEFAULT == null ? cloudautomationProviderPassword != null : !CLOUDAUTOMATION_PROVIDER_PASSWORD_EDEFAULT.equals(cloudautomationProviderPassword);
			case CloudautomationPackage.PROVIDER__CLOUDAUTOMATION_PROVIDER_ENDPOINT:
				return CLOUDAUTOMATION_PROVIDER_ENDPOINT_EDEFAULT == null ? cloudautomationProviderEndpoint != null : !CLOUDAUTOMATION_PROVIDER_ENDPOINT_EDEFAULT.equals(cloudautomationProviderEndpoint);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CloudautomationPackage.PROVIDER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cloudautomationProviderUsername: ");
		result.append(cloudautomationProviderUsername);
		result.append(", cloudautomationProviderType: ");
		result.append(cloudautomationProviderType);
		result.append(", cloudautomationProviderPassword: ");
		result.append(cloudautomationProviderPassword);
		result.append(", cloudautomationProviderEndpoint: ");
		result.append(cloudautomationProviderEndpoint);
		result.append(')');
		return result.toString();
	}

} //ProviderImpl
