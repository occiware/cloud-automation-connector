/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.occiware.cloudautomation/model/cloudautomation.ecore
 * using:
 *   /org.occiware.cloudautomation/model/cloudautomation.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.occiware.cloudautomation;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.occiware.cloudautomation.CloudautomationTables;

/**
 * CloudautomationTables provides the dispatch tables for the cloudautomation for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class CloudautomationTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(CloudautomationPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_org_occiware_cloudautomation_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://org.occiware.cloudautomation/ecore", null, org.occiware.cloudautomation.CloudautomationPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.occiware.cloudautomation.CloudautomationTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Cloudautomationinstance = org.occiware.cloudautomation.CloudautomationTables.PACKid_http_c_s_s_org_occiware_cloudautomation_s_ecore.getClassId("Cloudautomationinstance", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Cloudautomationnetwork = org.occiware.cloudautomation.CloudautomationTables.PACKid_http_c_s_s_org_occiware_cloudautomation_s_ecore.getClassId("Cloudautomationnetwork", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Cloudautomationstorage = org.occiware.cloudautomation.CloudautomationTables.PACKid_http_c_s_s_org_occiware_cloudautomation_s_ecore.getClassId("Cloudautomationstorage", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Credentials = org.occiware.cloudautomation.CloudautomationTables.PACKid_http_c_s_s_org_occiware_cloudautomation_s_ecore.getClassId("Credentials", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.occiware.cloudautomation.CloudautomationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Instancetemplate = org.occiware.cloudautomation.CloudautomationTables.PACKid_http_c_s_s_org_occiware_cloudautomation_s_ecore.getClassId("Instancetemplate", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Provider = org.occiware.cloudautomation.CloudautomationTables.PACKid_http_c_s_s_org_occiware_cloudautomation_s_ecore.getClassId("Provider", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Credentials_c_c_appliesConstraint = "Credentials::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Instancetemplate_c_c_appliesConstraint = "Instancetemplate::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Provider_c_c_appliesConstraint = "Provider::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			CloudautomationTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudautomationTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Cloudautomationinstance = new EcoreExecutorType(CloudautomationPackage.Literals.CLOUDAUTOMATIONINSTANCE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cloudautomationnetwork = new EcoreExecutorType(CloudautomationPackage.Literals.CLOUDAUTOMATIONNETWORK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cloudautomationstorage = new EcoreExecutorType(CloudautomationPackage.Literals.CLOUDAUTOMATIONSTORAGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Credentials = new EcoreExecutorType(CloudautomationPackage.Literals.CREDENTIALS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Instancetemplate = new EcoreExecutorType(CloudautomationPackage.Literals.INSTANCETEMPLATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Provider = new EcoreExecutorType(CloudautomationPackage.Literals.PROVIDER, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Cloudautomationinstance,
			_Cloudautomationnetwork,
			_Cloudautomationstorage,
			_Credentials,
			_Instancetemplate,
			_Provider
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudautomationTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationinstance__Cloudautomationinstance = new ExecutorFragment(Types._Cloudautomationinstance, CloudautomationTables.Types._Cloudautomationinstance);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationinstance__Compute = new ExecutorFragment(Types._Cloudautomationinstance, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationinstance__Entity = new ExecutorFragment(Types._Cloudautomationinstance, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationinstance__OclAny = new ExecutorFragment(Types._Cloudautomationinstance, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationinstance__OclElement = new ExecutorFragment(Types._Cloudautomationinstance, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationinstance__Resource = new ExecutorFragment(Types._Cloudautomationinstance, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationnetwork__Cloudautomationnetwork = new ExecutorFragment(Types._Cloudautomationnetwork, CloudautomationTables.Types._Cloudautomationnetwork);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationnetwork__Entity = new ExecutorFragment(Types._Cloudautomationnetwork, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationnetwork__Network = new ExecutorFragment(Types._Cloudautomationnetwork, InfrastructureTables.Types._Network);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationnetwork__OclAny = new ExecutorFragment(Types._Cloudautomationnetwork, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationnetwork__OclElement = new ExecutorFragment(Types._Cloudautomationnetwork, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationnetwork__Resource = new ExecutorFragment(Types._Cloudautomationnetwork, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationstorage__Cloudautomationstorage = new ExecutorFragment(Types._Cloudautomationstorage, CloudautomationTables.Types._Cloudautomationstorage);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationstorage__Entity = new ExecutorFragment(Types._Cloudautomationstorage, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationstorage__OclAny = new ExecutorFragment(Types._Cloudautomationstorage, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationstorage__OclElement = new ExecutorFragment(Types._Cloudautomationstorage, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationstorage__Resource = new ExecutorFragment(Types._Cloudautomationstorage, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationstorage__Storage = new ExecutorFragment(Types._Cloudautomationstorage, InfrastructureTables.Types._Storage);

		private static final /*@NonNull*/ ExecutorFragment _Credentials__Credentials = new ExecutorFragment(Types._Credentials, CloudautomationTables.Types._Credentials);
		private static final /*@NonNull*/ ExecutorFragment _Credentials__MixinBase = new ExecutorFragment(Types._Credentials, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Credentials__OclAny = new ExecutorFragment(Types._Credentials, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Credentials__OclElement = new ExecutorFragment(Types._Credentials, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Instancetemplate__Instancetemplate = new ExecutorFragment(Types._Instancetemplate, CloudautomationTables.Types._Instancetemplate);
		private static final /*@NonNull*/ ExecutorFragment _Instancetemplate__MixinBase = new ExecutorFragment(Types._Instancetemplate, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Instancetemplate__OclAny = new ExecutorFragment(Types._Instancetemplate, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Instancetemplate__OclElement = new ExecutorFragment(Types._Instancetemplate, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Provider__MixinBase = new ExecutorFragment(Types._Provider, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Provider__OclAny = new ExecutorFragment(Types._Provider, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Provider__OclElement = new ExecutorFragment(Types._Provider, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Provider__Provider = new ExecutorFragment(Types._Provider, CloudautomationTables.Types._Provider);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudautomationTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudautomationTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudautomationTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final /*@NonNull*/ ExecutorProperty _Credentials__cloudautomationCredentialsEndpoint = new EcoreExecutorProperty(CloudautomationPackage.Literals.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_ENDPOINT, Types._Credentials, 0);
		public static final /*@NonNull*/ ExecutorProperty _Credentials__cloudautomationCredentialsPassword = new EcoreExecutorProperty(CloudautomationPackage.Literals.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_PASSWORD, Types._Credentials, 1);
		public static final /*@NonNull*/ ExecutorProperty _Credentials__cloudautomationCredentialsUsername = new EcoreExecutorProperty(CloudautomationPackage.Literals.CREDENTIALS__CLOUDAUTOMATION_CREDENTIALS_USERNAME, Types._Credentials, 2);

		public static final /*@NonNull*/ ExecutorProperty _Instancetemplate__cloudautomationInstancetemplateImageName = new EcoreExecutorProperty(CloudautomationPackage.Literals.INSTANCETEMPLATE__CLOUDAUTOMATION_INSTANCETEMPLATE_IMAGE_NAME, Types._Instancetemplate, 0);

		public static final /*@NonNull*/ ExecutorProperty _Provider__cloudautomationProviderEndpoint = new EcoreExecutorProperty(CloudautomationPackage.Literals.PROVIDER__CLOUDAUTOMATION_PROVIDER_ENDPOINT, Types._Provider, 0);
		public static final /*@NonNull*/ ExecutorProperty _Provider__cloudautomationProviderPassword = new EcoreExecutorProperty(CloudautomationPackage.Literals.PROVIDER__CLOUDAUTOMATION_PROVIDER_PASSWORD, Types._Provider, 1);
		public static final /*@NonNull*/ ExecutorProperty _Provider__cloudautomationProviderType = new EcoreExecutorProperty(CloudautomationPackage.Literals.PROVIDER__CLOUDAUTOMATION_PROVIDER_TYPE, Types._Provider, 2);
		public static final /*@NonNull*/ ExecutorProperty _Provider__cloudautomationProviderUsername = new EcoreExecutorProperty(CloudautomationPackage.Literals.PROVIDER__CLOUDAUTOMATION_PROVIDER_USERNAME, Types._Provider, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudautomationTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cloudautomationinstance =
		{
			Fragments._Cloudautomationinstance__OclAny /* 0 */,
			Fragments._Cloudautomationinstance__OclElement /* 1 */,
			Fragments._Cloudautomationinstance__Entity /* 2 */,
			Fragments._Cloudautomationinstance__Resource /* 3 */,
			Fragments._Cloudautomationinstance__Compute /* 4 */,
			Fragments._Cloudautomationinstance__Cloudautomationinstance /* 5 */
		};
		private static final int /*@NonNull*/ [] __Cloudautomationinstance = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cloudautomationnetwork =
		{
			Fragments._Cloudautomationnetwork__OclAny /* 0 */,
			Fragments._Cloudautomationnetwork__OclElement /* 1 */,
			Fragments._Cloudautomationnetwork__Entity /* 2 */,
			Fragments._Cloudautomationnetwork__Resource /* 3 */,
			Fragments._Cloudautomationnetwork__Network /* 4 */,
			Fragments._Cloudautomationnetwork__Cloudautomationnetwork /* 5 */
		};
		private static final int /*@NonNull*/ [] __Cloudautomationnetwork = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cloudautomationstorage =
		{
			Fragments._Cloudautomationstorage__OclAny /* 0 */,
			Fragments._Cloudautomationstorage__OclElement /* 1 */,
			Fragments._Cloudautomationstorage__Entity /* 2 */,
			Fragments._Cloudautomationstorage__Resource /* 3 */,
			Fragments._Cloudautomationstorage__Storage /* 4 */,
			Fragments._Cloudautomationstorage__Cloudautomationstorage /* 5 */
		};
		private static final int /*@NonNull*/ [] __Cloudautomationstorage = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Credentials =
		{
			Fragments._Credentials__OclAny /* 0 */,
			Fragments._Credentials__OclElement /* 1 */,
			Fragments._Credentials__MixinBase /* 2 */,
			Fragments._Credentials__Credentials /* 3 */
		};
		private static final int /*@NonNull*/ [] __Credentials = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Instancetemplate =
		{
			Fragments._Instancetemplate__OclAny /* 0 */,
			Fragments._Instancetemplate__OclElement /* 1 */,
			Fragments._Instancetemplate__MixinBase /* 2 */,
			Fragments._Instancetemplate__Instancetemplate /* 3 */
		};
		private static final int /*@NonNull*/ [] __Instancetemplate = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Provider =
		{
			Fragments._Provider__OclAny /* 0 */,
			Fragments._Provider__OclElement /* 1 */,
			Fragments._Provider__MixinBase /* 2 */,
			Fragments._Provider__Provider /* 3 */
		};
		private static final int /*@NonNull*/ [] __Provider = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Cloudautomationinstance.initFragments(_Cloudautomationinstance, __Cloudautomationinstance);
			Types._Cloudautomationnetwork.initFragments(_Cloudautomationnetwork, __Cloudautomationnetwork);
			Types._Cloudautomationstorage.initFragments(_Cloudautomationstorage, __Cloudautomationstorage);
			Types._Credentials.initFragments(_Credentials, __Credentials);
			Types._Instancetemplate.initFragments(_Instancetemplate, __Instancetemplate);
			Types._Provider.initFragments(_Provider, __Provider);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudautomationTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationinstance__Cloudautomationinstance = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationinstance__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationinstance__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationinstance__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationinstance__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationinstance__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationnetwork__Cloudautomationnetwork = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationnetwork__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationnetwork__Network = {
			InfrastructureTables.Operations._Network__down /* down() */,
			InfrastructureTables.Operations._Network__down /* down() */,
			InfrastructureTables.Operations._Network__up /* up() */,
			InfrastructureTables.Operations._Network__up /* up() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationnetwork__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationnetwork__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationnetwork__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationstorage__Cloudautomationstorage = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationstorage__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationstorage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationstorage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationstorage__Resource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationstorage__Storage = {
			InfrastructureTables.Operations._Storage__offline /* offline() */,
			InfrastructureTables.Operations._Storage__offline /* offline() */,
			InfrastructureTables.Operations._Storage__online /* online() */,
			InfrastructureTables.Operations._Storage__online /* online() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Credentials__Credentials = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Credentials__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Credentials__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Credentials__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancetemplate__Instancetemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancetemplate__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancetemplate__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancetemplate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Provider__Provider = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Provider__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Provider__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Provider__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Cloudautomationinstance__Cloudautomationinstance.initOperations(_Cloudautomationinstance__Cloudautomationinstance);
			Fragments._Cloudautomationinstance__Compute.initOperations(_Cloudautomationinstance__Compute);
			Fragments._Cloudautomationinstance__Entity.initOperations(_Cloudautomationinstance__Entity);
			Fragments._Cloudautomationinstance__OclAny.initOperations(_Cloudautomationinstance__OclAny);
			Fragments._Cloudautomationinstance__OclElement.initOperations(_Cloudautomationinstance__OclElement);
			Fragments._Cloudautomationinstance__Resource.initOperations(_Cloudautomationinstance__Resource);

			Fragments._Cloudautomationnetwork__Cloudautomationnetwork.initOperations(_Cloudautomationnetwork__Cloudautomationnetwork);
			Fragments._Cloudautomationnetwork__Entity.initOperations(_Cloudautomationnetwork__Entity);
			Fragments._Cloudautomationnetwork__Network.initOperations(_Cloudautomationnetwork__Network);
			Fragments._Cloudautomationnetwork__OclAny.initOperations(_Cloudautomationnetwork__OclAny);
			Fragments._Cloudautomationnetwork__OclElement.initOperations(_Cloudautomationnetwork__OclElement);
			Fragments._Cloudautomationnetwork__Resource.initOperations(_Cloudautomationnetwork__Resource);

			Fragments._Cloudautomationstorage__Cloudautomationstorage.initOperations(_Cloudautomationstorage__Cloudautomationstorage);
			Fragments._Cloudautomationstorage__Entity.initOperations(_Cloudautomationstorage__Entity);
			Fragments._Cloudautomationstorage__OclAny.initOperations(_Cloudautomationstorage__OclAny);
			Fragments._Cloudautomationstorage__OclElement.initOperations(_Cloudautomationstorage__OclElement);
			Fragments._Cloudautomationstorage__Resource.initOperations(_Cloudautomationstorage__Resource);
			Fragments._Cloudautomationstorage__Storage.initOperations(_Cloudautomationstorage__Storage);

			Fragments._Credentials__Credentials.initOperations(_Credentials__Credentials);
			Fragments._Credentials__MixinBase.initOperations(_Credentials__MixinBase);
			Fragments._Credentials__OclAny.initOperations(_Credentials__OclAny);
			Fragments._Credentials__OclElement.initOperations(_Credentials__OclElement);

			Fragments._Instancetemplate__Instancetemplate.initOperations(_Instancetemplate__Instancetemplate);
			Fragments._Instancetemplate__MixinBase.initOperations(_Instancetemplate__MixinBase);
			Fragments._Instancetemplate__OclAny.initOperations(_Instancetemplate__OclAny);
			Fragments._Instancetemplate__OclElement.initOperations(_Instancetemplate__OclElement);

			Fragments._Provider__MixinBase.initOperations(_Provider__MixinBase);
			Fragments._Provider__OclAny.initOperations(_Provider__OclAny);
			Fragments._Provider__OclElement.initOperations(_Provider__OclElement);
			Fragments._Provider__Provider.initOperations(_Provider__Provider);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudautomationTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cloudautomationinstance = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cloudautomationnetwork = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cloudautomationstorage = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Credentials = {
			CloudautomationTables.Properties._Credentials__cloudautomationCredentialsEndpoint,
			CloudautomationTables.Properties._Credentials__cloudautomationCredentialsPassword,
			CloudautomationTables.Properties._Credentials__cloudautomationCredentialsUsername
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Instancetemplate = {
			CloudautomationTables.Properties._Instancetemplate__cloudautomationInstancetemplateImageName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Provider = {
			CloudautomationTables.Properties._Provider__cloudautomationProviderEndpoint,
			CloudautomationTables.Properties._Provider__cloudautomationProviderPassword,
			CloudautomationTables.Properties._Provider__cloudautomationProviderType,
			CloudautomationTables.Properties._Provider__cloudautomationProviderUsername
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Cloudautomationinstance__Cloudautomationinstance.initProperties(_Cloudautomationinstance);
			Fragments._Cloudautomationnetwork__Cloudautomationnetwork.initProperties(_Cloudautomationnetwork);
			Fragments._Cloudautomationstorage__Cloudautomationstorage.initProperties(_Cloudautomationstorage);
			Fragments._Credentials__Credentials.initProperties(_Credentials);
			Fragments._Instancetemplate__Instancetemplate.initProperties(_Instancetemplate);
			Fragments._Provider__Provider.initProperties(_Provider);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudautomationTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudautomationTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
