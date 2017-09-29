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

import static io.restassured.RestAssured.given;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.restassured.response.Response;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.occiware.cloudautomation#
 * - term: credentials
 * - title: 
 */
public class CredentialsConnector extends org.occiware.cloudautomation.impl.CredentialsImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(CredentialsConnector.class);

    private static final String PATH = "/rest/scheduler/login";

    private String sessionid;

    // Start of user code Credentialsconnector_constructor
	/**
	 * Constructs a credentials connector.
	 */
	CredentialsConnector()
	{
            sessionid = requestSessionId();
	}

	public void refreshSessionId(){
        sessionid = requestSessionId();
    }

    public String getSessionid(){
	    return sessionid;
    }

	private String requestSessionId(){
        LOGGER.info("Try to get the sessionid from : "+getUrl());
        String bodyContent = "username="+cloudautomationCredentialsUsername+"&password="+cloudautomationCredentialsPassword;
        Response response = given().body(bodyContent)
                .when()
                .post(getUrl())
                .then()
                .extract()
                .response();
        if(! RequestUtils.responseIs2xx(response)){
            LOGGER.info("Failed to get the sessionid from cloudautomation");
            throw new ConnectionFailedException("Failed to get the session id");
        }
        return response.asString();
    }

    private String getUrl(){
        return RequestUtils.readServerEndpoint()+PATH;
    }
    // End of user code
}	
