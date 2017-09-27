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
 * A representation of the model object '<em><b>Credentials</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.cloudautomation.Credentials#getPassword <em>Password</em>}</li>
 *   <li>{@link org.occiware.cloudautomation.Credentials#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.cloudautomation.Credentials#getCloudautomationEndpoint <em>Cloudautomation Endpoint</em>}</li>
 * </ul>
 *
 * @see org.occiware.cloudautomation.CloudautomationPackage#getCredentials()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Credentials extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.occiware.cloudautomation.CloudautomationPackage#getCredentials_Password()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware.cloudautomation/ecore!Credentials!password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.occiware.cloudautomation.Credentials#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.occiware.cloudautomation.CloudautomationPackage#getCredentials_Username()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware.cloudautomation/ecore!Credentials!username'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.occiware.cloudautomation.Credentials#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Cloudautomation Endpoint</b></em>' attribute.
	 * The default value is <code>"localhost:8080"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudautomation Endpoint</em>' attribute.
	 * @see #setCloudautomationEndpoint(String)
	 * @see org.occiware.cloudautomation.CloudautomationPackage#getCredentials_CloudautomationEndpoint()
	 * @model default="localhost:8080" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware.cloudautomation/ecore!Credentials!cloudautomationEndpoint'"
	 * @generated
	 */
	String getCloudautomationEndpoint();

	/**
	 * Sets the value of the '{@link org.occiware.cloudautomation.Credentials#getCloudautomationEndpoint <em>Cloudautomation Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudautomation Endpoint</em>' attribute.
	 * @see #getCloudautomationEndpoint()
	 * @generated
	 */
	void setCloudautomationEndpoint(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Credentials::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[?] = self.entity.oclIsKindOf(Cloudautomationstorage) or\n *         self.entity.oclIsKindOf(Cloudautomationinstance) or\n *         self.entity.oclIsKindOf(Cloudautomationnetwork)\n *       in\n *         \'Credentials::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.occiware.cloudautomation.CloudautomationTables%&gt;.STR_Credentials_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.occiware.cloudautomation.CloudautomationTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_cloudautomation_c_c_Cloudautomationstorage = idResolver.getClass(&lt;%org.occiware.cloudautomation.CloudautomationTables%&gt;.CLSSid_Cloudautomationstorage, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity_1 = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean oclIsKindOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_1, TYP_cloudautomation_c_c_Cloudautomationstorage).booleanValue();\n\t/*@NonInvalid\052/ boolean or;\n\tif (oclIsKindOf) {\n\t\tor = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_cloudautomation_c_c_Cloudautomationinstance_0 = idResolver.getClass(&lt;%org.occiware.cloudautomation.CloudautomationTables%&gt;.CLSSid_Cloudautomationinstance, null);\n\t\tfinal /*@NonInvalid\052/ boolean oclIsKindOf_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_1, TYP_cloudautomation_c_c_Cloudautomationinstance_0).booleanValue();\n\t\tor = oclIsKindOf_0;\n\t}\n\t/*@NonInvalid\052/ boolean result;\n\tif (or) {\n\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_cloudautomation_c_c_Cloudautomationnetwork_0 = idResolver.getClass(&lt;%org.occiware.cloudautomation.CloudautomationTables%&gt;.CLSSid_Cloudautomationnetwork, null);\n\t\tfinal /*@NonInvalid\052/ boolean oclIsKindOf_1 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_1, TYP_cloudautomation_c_c_Cloudautomationnetwork_0).booleanValue();\n\t\tresult = oclIsKindOf_1;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.occiware.cloudautomation.CloudautomationTables%&gt;.STR_Credentials_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.occiware.cloudautomation.CloudautomationTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Credentials
