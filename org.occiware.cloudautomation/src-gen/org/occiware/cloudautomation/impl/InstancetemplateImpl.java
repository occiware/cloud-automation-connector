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
import org.occiware.cloudautomation.Instancetemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instancetemplate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.cloudautomation.impl.InstancetemplateImpl#getCloudautomationInstancetemplateImageName <em>Cloudautomation Instancetemplate Image Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstancetemplateImpl extends MixinBaseImpl implements Instancetemplate {
	/**
	 * The default value of the '{@link #getCloudautomationInstancetemplateImageName() <em>Cloudautomation Instancetemplate Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationInstancetemplateImageName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUDAUTOMATION_INSTANCETEMPLATE_IMAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudautomationInstancetemplateImageName() <em>Cloudautomation Instancetemplate Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudautomationInstancetemplateImageName()
	 * @generated
	 * @ordered
	 */
	protected String cloudautomationInstancetemplateImageName = CLOUDAUTOMATION_INSTANCETEMPLATE_IMAGE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstancetemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudautomationPackage.Literals.INSTANCETEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCloudautomationInstancetemplateImageName() {
		return cloudautomationInstancetemplateImageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudautomationInstancetemplateImageName(String newCloudautomationInstancetemplateImageName) {
		String oldCloudautomationInstancetemplateImageName = cloudautomationInstancetemplateImageName;
		cloudautomationInstancetemplateImageName = newCloudautomationInstancetemplateImageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudautomationPackage.INSTANCETEMPLATE__CLOUDAUTOMATION_INSTANCETEMPLATE_IMAGE_NAME, oldCloudautomationInstancetemplateImageName, cloudautomationInstancetemplateImageName));
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
		 *   let
		 *     severity : Integer[1] = 'Instancetemplate::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Cloudautomationinstance)
		 *       in
		 *         'Instancetemplate::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CloudautomationTables.STR_Instancetemplate_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CloudautomationTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cloudautomation_c_c_Cloudautomationinstance_0 = idResolver.getClass(CloudautomationTables.CLSSid_Cloudautomationinstance, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_cloudautomation_c_c_Cloudautomationinstance_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, CloudautomationTables.STR_Instancetemplate_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, CloudautomationTables.INT_0).booleanValue();
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
			case CloudautomationPackage.INSTANCETEMPLATE__CLOUDAUTOMATION_INSTANCETEMPLATE_IMAGE_NAME:
				return getCloudautomationInstancetemplateImageName();
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
			case CloudautomationPackage.INSTANCETEMPLATE__CLOUDAUTOMATION_INSTANCETEMPLATE_IMAGE_NAME:
				setCloudautomationInstancetemplateImageName((String)newValue);
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
			case CloudautomationPackage.INSTANCETEMPLATE__CLOUDAUTOMATION_INSTANCETEMPLATE_IMAGE_NAME:
				setCloudautomationInstancetemplateImageName(CLOUDAUTOMATION_INSTANCETEMPLATE_IMAGE_NAME_EDEFAULT);
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
			case CloudautomationPackage.INSTANCETEMPLATE__CLOUDAUTOMATION_INSTANCETEMPLATE_IMAGE_NAME:
				return CLOUDAUTOMATION_INSTANCETEMPLATE_IMAGE_NAME_EDEFAULT == null ? cloudautomationInstancetemplateImageName != null : !CLOUDAUTOMATION_INSTANCETEMPLATE_IMAGE_NAME_EDEFAULT.equals(cloudautomationInstancetemplateImageName);
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
			case CloudautomationPackage.INSTANCETEMPLATE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (cloudautomationInstancetemplateImageName: ");
		result.append(cloudautomationInstancetemplateImageName);
		result.append(')');
		return result.toString();
	}

} //InstancetemplateImpl
