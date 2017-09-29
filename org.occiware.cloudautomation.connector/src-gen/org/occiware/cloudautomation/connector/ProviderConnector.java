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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.occiware.cloudautomation#
 * - term: provider
 * - title: 
 */
public class ProviderConnector extends org.occiware.cloudautomation.impl.ProviderImpl
{
    private static final String INFRASTRUCTURE_PATH = "/connector-iaas/infrastructures/";

    /**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ProviderConnector.class);

	// Start of user code Providerconnector_constructor
	/**
	 * Constructs a provider connector.
	 */
	ProviderConnector()
	{
	    LOGGER.info("Mixin provider added");
	}

	public String getInfrastructureUrl(){
	    return RequestUtils.readServerEndpoint()+INFRASTRUCTURE_PATH;
    }
	// End of user code
}	
