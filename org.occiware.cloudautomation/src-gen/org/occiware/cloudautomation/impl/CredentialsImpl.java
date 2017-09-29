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
import org.occiware.cloudautomation.Credentials;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credentials</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.cloudautomation.impl.CredentialsImpl#getCloudautomationCredentialsPassword <em>Cloudautomation Credentials Password</em>}</li>
 *   <li>{@link org.occiware.cloudautomation.impl.CredentialsImpl#getCloudautomationCredentialsUsername <em>Cloudautomation Credentials Username</em>}</li>
 *   <li>{@link org.occiware.cloudautomation.impl.CredentialsImpl#getCloudautomationCredentialsEndpoint <em>Cloudautomation Credentials Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CredentialsImpl extends MixinBaseImpl implements Credentials {
	/**
	 * The default value of the '{@link #getCloudautomationCredentialsPassword() <em>Cloudautomation Credentials Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationCredentialsPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUDAUTOMATION_CREDENTIALS_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudautomationCredentialsPassword() <em>Cloudautomation Credentials Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationCredentialsPassword()
	 * @generated
	 * @ordered
	 */
	protected String cloudautomationCredentialsPassword = CLOUDAUTOMATION_CREDENTIALS_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudautomationCredentialsUsername() <em>Cloudautomation Credentials Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationCredentialsUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUDAUTOMATION_CREDENTIALS_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudautomationCredentialsUsername() <em>Cloudautomation Credentials Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationCredentialsUsername()
	 * @generated
	 * @ordered
	 */
	protected String cloudautomationCredentialsUsername = CLOUDAUTOMATION_CREDENTIALS_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudautomationCredentialsEndpoint() <em>Cloudautomation Credentials Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationCredentialsEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUDAUTOMATION_CREDENTIALS_ENDPOINT_EDEFAULT = "localhost:8080";

	/**
	 * The cached value of the '{@link #getCloudautomationCredentialsEndpoint() <em>Cloudautomation Credentials Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationCredentialsEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String cloudautomationCredentialsEndpoint = CLOUDAUTOMATION_CREDENTIALS_ENDPOINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CredentialsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudautomationPackage.Literals.CREDENTIALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCloudautomationCredentialsPassword() {
		return cloudautomationCredentialsPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudautomationCredentialsPassword(String newCloudautomationCredentialsPassword) {
		String oldCloudautomationCredentialsPassword = cloudautomationCredentialsPassword;
		cloudautomationCredentialsPassword = newCloudautomationCredentialsPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudautomationPackage.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_PASSWORD, oldCloudautomationCredentialsPassword, cloudautomationCredentialsPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCloudautomationCredentialsUsername() {
		return cloudautomationCredentialsUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudautomationCredentialsUsername(String newCloudautomationCredentialsUsername) {
		String oldCloudautomationCredentialsUsername = cloudautomationCredentialsUsername;
		cloudautomationCredentialsUsername = newCloudautomationCredentialsUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudautomationPackage.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_USERNAME, oldCloudautomationCredentialsUsername, cloudautomationCredentialsUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCloudautomationCredentialsEndpoint() {
		return cloudautomationCredentialsEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudautomationCredentialsEndpoint(String newCloudautomationCredentialsEndpoint) {
		String oldCloudautomationCredentialsEndpoint = cloudautomationCredentialsEndpoint;
		cloudautomationCredentialsEndpoint = newCloudautomationCredentialsEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudautomationPackage.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_ENDPOINT, oldCloudautomationCredentialsEndpoint, cloudautomationCredentialsEndpoint));
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
		 *   let severity : Integer[1] = 'Credentials::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[?] = self.entity.oclIsKindOf(Cloudautomationstorage) or
		 *         self.entity.oclIsKindOf(Cloudautomationinstance) or
		 *         self.entity.oclIsKindOf(Cloudautomationnetwork)
		 *       in
		 *         'Credentials::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CloudautomationTables.STR_Credentials_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CloudautomationTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cloudautomation_c_c_Cloudautomationstorage = idResolver.getClass(CloudautomationTables.CLSSid_Cloudautomationstorage, null);
			final /*@NonInvalid*/ Entity entity_1 = this.getEntity();
			final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_1, TYP_cloudautomation_c_c_Cloudautomationstorage).booleanValue();
			/*@NonInvalid*/ boolean or;
			if (oclIsKindOf) {
				or = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cloudautomation_c_c_Cloudautomationinstance_0 = idResolver.getClass(CloudautomationTables.CLSSid_Cloudautomationinstance, null);
				final /*@NonInvalid*/ boolean oclIsKindOf_0 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_1, TYP_cloudautomation_c_c_Cloudautomationinstance_0).booleanValue();
				or = oclIsKindOf_0;
			}
			/*@NonInvalid*/ boolean result;
			if (or) {
				result = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cloudautomation_c_c_Cloudautomationnetwork_0 = idResolver.getClass(CloudautomationTables.CLSSid_Cloudautomationnetwork, null);
				final /*@NonInvalid*/ boolean oclIsKindOf_1 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_1, TYP_cloudautomation_c_c_Cloudautomationnetwork_0).booleanValue();
				result = oclIsKindOf_1;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, CloudautomationTables.STR_Credentials_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, CloudautomationTables.INT_0).booleanValue();
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
			case CloudautomationPackage.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_PASSWORD:
				return getCloudautomationCredentialsPassword();
			case CloudautomationPackage.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_USERNAME:
				return getCloudautomationCredentialsUsername();
			case CloudautomationPackage.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_ENDPOINT:
				return getCloudautomationCredentialsEndpoint();
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
			case CloudautomationPackage.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_PASSWORD:
				setCloudautomationCredentialsPassword((String)newValue);
				return;
			case CloudautomationPackage.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_USERNAME:
				setCloudautomationCredentialsUsername((String)newValue);
				return;
			case CloudautomationPackage.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_ENDPOINT:
				setCloudautomationCredentialsEndpoint((String)newValue);
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
			case CloudautomationPackage.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_PASSWORD:
				setCloudautomationCredentialsPassword(CLOUDAUTOMATION_CREDENTIALS_PASSWORD_EDEFAULT);
				return;
			case CloudautomationPackage.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_USERNAME:
				setCloudautomationCredentialsUsername(CLOUDAUTOMATION_CREDENTIALS_USERNAME_EDEFAULT);
				return;
			case CloudautomationPackage.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_ENDPOINT:
				setCloudautomationCredentialsEndpoint(CLOUDAUTOMATION_CREDENTIALS_ENDPOINT_EDEFAULT);
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
			case CloudautomationPackage.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_PASSWORD:
				return CLOUDAUTOMATION_CREDENTIALS_PASSWORD_EDEFAULT == null ? cloudautomationCredentialsPassword != null : !CLOUDAUTOMATION_CREDENTIALS_PASSWORD_EDEFAULT.equals(cloudautomationCredentialsPassword);
			case CloudautomationPackage.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_USERNAME:
				return CLOUDAUTOMATION_CREDENTIALS_USERNAME_EDEFAULT == null ? cloudautomationCredentialsUsername != null : !CLOUDAUTOMATION_CREDENTIALS_USERNAME_EDEFAULT.equals(cloudautomationCredentialsUsername);
			case CloudautomationPackage.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_ENDPOINT:
				return CLOUDAUTOMATION_CREDENTIALS_ENDPOINT_EDEFAULT == null ? cloudautomationCredentialsEndpoint != null : !CLOUDAUTOMATION_CREDENTIALS_ENDPOINT_EDEFAULT.equals(cloudautomationCredentialsEndpoint);
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
			case CloudautomationPackage.CREDENTIALS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (cloudautomationCredentialsPassword: ");
		result.append(cloudautomationCredentialsPassword);
		result.append(", cloudautomationCredentialsUsername: ");
		result.append(cloudautomationCredentialsUsername);
		result.append(", cloudautomationCredentialsEndpoint: ");
		result.append(cloudautomationCredentialsEndpoint);
		result.append(')');
		return result.toString();
	}

} //CredentialsImpl
