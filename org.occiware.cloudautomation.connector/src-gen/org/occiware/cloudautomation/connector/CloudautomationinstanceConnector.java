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

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.crtp.Large;
import org.eclipse.cmf.occi.crtp.Medium;
import org.eclipse.cmf.occi.crtp.Small;
import org.eclipse.cmf.occi.infrastructure.Resource_tpl;
import org.eclipse.cmf.occi.infrastructure.User_data;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

		Optional<ProviderConnector> test = getMixin(ProviderConnector.class);
		System.out.println("test "+test);

		ProviderConnector provider = getMixin(ProviderConnector.class)
                .orElseThrow(() -> new MissingParametersException("Provider mixin was not associated to the instance"));


        CredentialsConnector creds = getMixin(CredentialsConnector.class)
                .orElseThrow(() -> new MissingParametersException("Credentials mixin was not associated to the instance"));

        InstancetemplateConnector image = getMixin(InstancetemplateConnector.class)
                .orElseThrow(() -> new MissingParametersException("Instancetemplate mixin was not associated to the instance"));


        Optional<Resource_tpl> optionalResourceTpl = getMixin(getResourceTplList());
        Optional<User_data> optionalUserData = getMixin(User_data.class);

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

        if(RequestUtils.postRequestWithSessionId(given().body(content.toJSONString()),getServiceInstancesUrl(),creds)){
            throw new ConnectionFailedException("Unable to create the instance "+title);
        }

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
		// TODO: Implement this callback or remove this method.
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
	}
	// End of user code

	//
	// Cloudautomationinstance actions.
	//

    /**
     * Get the mixin base instance tClass to apply on
     * instance.
     */
    public <T extends MixinBase> Optional<T> getMixin(Class<T> tClass){
		List<MixinBase> mixinBase = this.getParts();
		return mixinBase.stream()
				.filter(mixinB -> tClass.isInstance(mixinB))
				.findFirst()
				.map(mixin -> (T) mixin);
    }

    /**
     * Get the mixin base instance tClass to apply on
     * instance.
     */
    public <T extends MixinBase> Optional<T> getMixin(List<Class<T>> tClasses){
        List<MixinBase> mixinBases = this.getParts();
        return mixinBases.stream()
                .filter(mixinB -> tClasses.stream()
                        .anyMatch(tClass -> tClass.isInstance(mixinB)))
                .findFirst()
				.map(mixin -> (T) mixin);
	}

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

}	
