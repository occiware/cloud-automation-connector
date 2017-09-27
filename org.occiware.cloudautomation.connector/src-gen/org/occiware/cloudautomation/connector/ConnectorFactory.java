/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Tue Sep 26 17:39:18 CEST 2017 from platform:/resource/org.occiware.cloudautomation/model/cloudautomation.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.occiware.cloudautomation.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: cloudautomation
 * - scheme: http://org.occiware.cloudautomation#
 */
public class ConnectorFactory extends org.occiware.cloudautomation.impl.CloudautomationFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.occiware.cloudautomation#
	 * - term: cloudautomationnetwork
	 * - title: 
	 */
	@Override
	public org.occiware.cloudautomation.Cloudautomationnetwork createCloudautomationnetwork() {
		return new CloudautomationnetworkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.occiware.cloudautomation#
	 * - term: cloudautomationinstance
	 * - title: 
	 */
	@Override
	public org.occiware.cloudautomation.Cloudautomationinstance createCloudautomationinstance() {
		return new CloudautomationinstanceConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.occiware.cloudautomation#
	 * - term: cloudautomationstorage
	 * - title: 
	 */
	@Override
	public org.occiware.cloudautomation.Cloudautomationstorage createCloudautomationstorage() {
		return new CloudautomationstorageConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.occiware.cloudautomation#
	 * - term: provider
	 * - title: 
	 */
	@Override
	public org.occiware.cloudautomation.Provider createProvider() {
		return new ProviderConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.occiware.cloudautomation#
	 * - term: credentials
	 * - title: 
	 */
	@Override
	public org.occiware.cloudautomation.Credentials createCredentials() {
		return new CredentialsConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.occiware.cloudautomation#
	 * - term: instancetemplate
	 * - title: 
	 */
	@Override
	public org.occiware.cloudautomation.Instancetemplate createInstancetemplate() {
		return new InstancetemplateConnector();
	}

}
