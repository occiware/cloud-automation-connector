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

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.cloudautomation.Provider#getCloudautomationProviderUsername <em>Cloudautomation Provider Username</em>}</li>
 *   <li>{@link org.occiware.cloudautomation.Provider#getCloudautomationProviderType <em>Cloudautomation Provider Type</em>}</li>
 *   <li>{@link org.occiware.cloudautomation.Provider#getCloudautomationProviderPassword <em>Cloudautomation Provider Password</em>}</li>
 *   <li>{@link org.occiware.cloudautomation.Provider#getCloudautomationProviderEndpoint <em>Cloudautomation Provider Endpoint</em>}</li>
 * </ul>
 *
 * @see org.occiware.cloudautomation.CloudautomationPackage#getProvider()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Provider extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Cloudautomation Provider Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the username to connect to the provider
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudautomation Provider Username</em>' attribute.
	 * @see #setCloudautomationProviderUsername(String)
	 * @see org.occiware.cloudautomation.CloudautomationPackage#getProvider_CloudautomationProviderUsername()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware.cloudautomation/ecore!Provider!cloudautomationProviderUsername'"
	 * @generated
	 */
	String getCloudautomationProviderUsername();

	/**
	 * Sets the value of the '{@link org.occiware.cloudautomation.Provider#getCloudautomationProviderUsername <em>Cloudautomation Provider Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudautomation Provider Username</em>' attribute.
	 * @see #getCloudautomationProviderUsername()
	 * @generated
	 */
	void setCloudautomationProviderUsername(String value);

	/**
	 * Returns the value of the '<em><b>Cloudautomation Provider Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the type of infrastructure used
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudautomation Provider Type</em>' attribute.
	 * @see #setCloudautomationProviderType(String)
	 * @see org.occiware.cloudautomation.CloudautomationPackage#getProvider_CloudautomationProviderType()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware.cloudautomation/ecore!Provider!cloudautomationProviderType'"
	 * @generated
	 */
	String getCloudautomationProviderType();

	/**
	 * Sets the value of the '{@link org.occiware.cloudautomation.Provider#getCloudautomationProviderType <em>Cloudautomation Provider Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudautomation Provider Type</em>' attribute.
	 * @see #getCloudautomationProviderType()
	 * @generated
	 */
	void setCloudautomationProviderType(String value);

	/**
	 * Returns the value of the '<em><b>Cloudautomation Provider Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the password to connect to the provider
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudautomation Provider Password</em>' attribute.
	 * @see #setCloudautomationProviderPassword(String)
	 * @see org.occiware.cloudautomation.CloudautomationPackage#getProvider_CloudautomationProviderPassword()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware.cloudautomation/ecore!Provider!cloudautomationProviderPassword'"
	 * @generated
	 */
	String getCloudautomationProviderPassword();

	/**
	 * Sets the value of the '{@link org.occiware.cloudautomation.Provider#getCloudautomationProviderPassword <em>Cloudautomation Provider Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudautomation Provider Password</em>' attribute.
	 * @see #getCloudautomationProviderPassword()
	 * @generated
	 */
	void setCloudautomationProviderPassword(String value);

	/**
	 * Returns the value of the '<em><b>Cloudautomation Provider Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the provider platform url
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudautomation Provider Endpoint</em>' attribute.
	 * @see #setCloudautomationProviderEndpoint(String)
	 * @see org.occiware.cloudautomation.CloudautomationPackage#getProvider_CloudautomationProviderEndpoint()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware.cloudautomation/ecore!Provider!cloudautomationProviderEndpoint'"
	 * @generated
	 */
	String getCloudautomationProviderEndpoint();

	/**
	 * Sets the value of the '{@link org.occiware.cloudautomation.Provider#getCloudautomationProviderEndpoint <em>Cloudautomation Provider Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudautomation Provider Endpoint</em>' attribute.
	 * @see #getCloudautomationProviderEndpoint()
	 * @generated
	 */
	void setCloudautomationProviderEndpoint(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Provider::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[?] = self.entity.oclIsKindOf(Cloudautomationnetwork) or\n *         self.entity.oclIsKindOf(Cloudautomationinstance)\n *       in\n *         \'Provider::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.occiware.cloudautomation.CloudautomationTables%&gt;.STR_Provider_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.occiware.cloudautomation.CloudautomationTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_cloudautomation_c_c_Cloudautomationnetwork = idResolver.getClass(&lt;%org.occiware.cloudautomation.CloudautomationTables%&gt;.CLSSid_Cloudautomationnetwork, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity_0 = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean oclIsKindOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_0, TYP_cloudautomation_c_c_Cloudautomationnetwork).booleanValue();\n\t/*@NonInvalid\052/ boolean result;\n\tif (oclIsKindOf) {\n\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_cloudautomation_c_c_Cloudautomationinstance = idResolver.getClass(&lt;%org.occiware.cloudautomation.CloudautomationTables%&gt;.CLSSid_Cloudautomationinstance, null);\n\t\tfinal /*@NonInvalid\052/ boolean oclIsKindOf_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_0, TYP_cloudautomation_c_c_Cloudautomationinstance).booleanValue();\n\t\tresult = oclIsKindOf_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.occiware.cloudautomation.CloudautomationTables%&gt;.STR_Provider_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.occiware.cloudautomation.CloudautomationTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Provider
