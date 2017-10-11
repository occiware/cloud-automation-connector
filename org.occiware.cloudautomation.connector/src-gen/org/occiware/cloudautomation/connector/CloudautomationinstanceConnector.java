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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.crtp.Large;
import org.eclipse.cmf.occi.crtp.Medium;
import org.eclipse.cmf.occi.crtp.Small;
import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.infrastructure.Resource_tpl;
import org.eclipse.cmf.occi.infrastructure.User_data;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.restassured.http.ContentType;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.occiware.cloudautomation#
 * - term: cloudautomationinstance
 * - title: 
 */
public class CloudautomationinstanceConnector extends org.occiware.cloudautomation.impl.CloudautomationinstanceImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(CloudautomationinstanceConnector.class);
    private String pcaId;

	// Start of user code Cloudautomationinstanceconnector_constructor
	/**
	 * Constructs a cloudautomationinstance connector.
	 */
	CloudautomationinstanceConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code CloudautomationinstanceocciCreate
	/**
	 * Called when this Cloudautomationinstance instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

        //Gather the mixin implied in the instance creation

		ProviderConnector provider = getProviderConnector();
        CredentialsConnector creds = getCredentialsConnector();

        InstancetemplateConnector image = MixinUtils.getMixin(this.getParts(),InstancetemplateConnector.class)
                .orElseThrow(() -> new MissingParametersException("Instancetemplate mixin was not associated to the instance"));

        Optional<Resource_tpl> optionalResourceTpl = MixinUtils.getMixin(this.getParts(),getResourceTplList());
        Optional<User_data> optionalUserData = MixinUtils.getMixin(this.getParts(),User_data.class);

        // Create the json that will be used in the request body

	    JSONObject content = new JSONObject();
        JSONObject genericInfo = new JSONObject();
        JSONObject variables = new JSONObject();

        genericInfo.put("pca.service.model","occi.infrastructure.compute");
        genericInfo.put("pca.service.type","infrastructure");
        genericInfo.put("pca.action.type","create");

	    variables.put("infraName",provider.getEntity().getTitle());
	    variables.put("infraType",provider.getCloudautomationProviderType());
	    variables.put("infraEndpoint",provider.getCloudautomationProviderEndpoint());
        variables.put("instanceName",this.getTitle());
        variables.put("architecture",this.getOcciComputeArchitecture().getName());
        variables.put("imageName",image.getCloudautomationInstancetemplateImageName());

	    optionalResourceTpl.ifPresent(resourceTpl -> variables.put("size",resourceTpl.getEntity().getTitle()));
        optionalUserData.ifPresent(userData -> variables.put("userdata",userData.getEntity().getTitle()));

        content.put("genericInfo",genericInfo);
        content.put("variables",variables);

        //send the request to cloud automation

        LOGGER.info("POST request in order to create the instance ");
        Optional<String> optionalResponse = RequestUtils.postRequestWithSessionId(
                given().contentType(ContentType.JSON)
                        .body(content.toJSONString()),
                getServiceInstancesUrl(),
                creds);


        JSONObject response = (JSONObject) JSONValue.parse(optionalResponse
                .orElseThrow(() -> new ConnectionFailedException("Unable to create the instance "+title)));


        //Update the information following the request response

        LOGGER.info("response : \n"+response );

        JSONObject responseVariables = (JSONObject) response.get("variables");
        this.setOcciComputeState(openstackToComputeStatus((String) responseVariables.get("status")));
        pcaId = (String) responseVariables.get("pca.instance.id");
        LOGGER.info("set pcaID value to :"+pcaId);
	}

	// End of user code

	// Start of user code Cloudautomationinstance_occiRetrieve_method
	/**
	 * Called when this Cloudautomationinstance instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

        CredentialsConnector creds = getCredentialsConnector();


        LOGGER.info("GET request in order to get the instance information");
        Optional<String> optionalResponse = RequestUtils.getRequestWithSessionId(
                given().contentType(ContentType.JSON),
                getServiceInstancesUrl(),
                creds);

        JSONObject response = (JSONObject) JSONValue.parse(optionalResponse
                .orElseThrow(() -> new ConnectionFailedException("Unable to get the instance "+title)));

        LOGGER.info("response : \n"+response );
        LOGGER.info("GET pca id information : "+pcaId);

        JSONObject responseVariables = (JSONObject) ((JSONObject) response.get(pcaId)).get("variables");
        this.setOcciComputeState(openstackToComputeStatus((String) responseVariables.get("status")));
        Optional.ofNullable(responseVariables.get("endpoint"))
                .ifPresent(endpoint -> this.setOcciComputeHostname((String) endpoint));

    }
	// End of user code

	// Start of user code Cloudautomationinstance_occiUpdate_method
	/**
	 * Called when this Cloudautomationinstance instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code CloudautomationinstanceocciDelete_method
	/**
	 * Called when this Cloudautomationinstance instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.

        CredentialsConnector creds = getCredentialsConnector();

        JSONObject content = new JSONObject();
        JSONObject genericInfo = new JSONObject();
        JSONObject variables = new JSONObject();

        genericInfo.put("pca.service.model","occi.infrastructure.compute");
        genericInfo.put("pca.service.type","infrastructure");
        genericInfo.put("pca.action.type","delete");

        ProviderConnector provider = getProviderConnector();

        variables.put("infraName",provider.getEntity().getTitle());
        variables.put("pca.instance.id",this.getTitle());

        content.put("genericInfo",genericInfo);
        content.put("variables",variables);


        LOGGER.info("DELETE request in order to delete the instance ");
        Optional<String> optionalResponse = RequestUtils.deleteRequestWithSessionId(
                given().contentType(ContentType.JSON)
                        .body(content.toJSONString()),
                getServiceInstancesUrl(),
                creds);

        optionalResponse.orElseThrow( () -> new RuntimeException("Failed to delete instance "+this.getTitle()));


    }
	// End of user code

	//
	// Cloudautomationinstance actions.
	//

    private <T extends MixinBase> List<Class<T>> getResourceTplList(){
        List<Class<T>> resourceTplList = new ArrayList<>();
        resourceTplList.add((Class<T>) Small.class);
        resourceTplList.add((Class<T>) Medium.class);
        resourceTplList.add((Class<T>) Large.class);
        return resourceTplList;
    }

    private String getServiceInstancesUrl(){
        return RequestUtils.readServerEndpoint()+"/cloud-automation-service/serviceInstances";
    }

    private ComputeStatus openstackToComputeStatus(String openstackStatus){
		LOGGER.info("openstack status : "+openstackStatus);
        switch (openstackStatus){
            case "BUILD":
            case "DEPLOYING":
                return ComputeStatus.INACTIVE;
            case "RUNNING":
                return ComputeStatus.ACTIVE;
            default:
                return ComputeStatus.ERROR;
        }
    }

    private CredentialsConnector getCredentialsConnector(){
        return MixinUtils.getMixin(this.getParts(),CredentialsConnector.class)
                .orElseThrow(() -> new MissingParametersException("Credentials mixin was not associated to the instance"));
    }

    private ProviderConnector getProviderConnector(){
        return MixinUtils.getMixin(this.getParts(),ProviderConnector.class)
                .orElseThrow(() -> new MissingParametersException("Provider mixin was not associated to the instance"));
    }

}	
