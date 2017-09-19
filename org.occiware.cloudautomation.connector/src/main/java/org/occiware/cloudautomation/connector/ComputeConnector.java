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
 * Generated at Wed Sep 06 13:03:05 CEST 2017 from platform:/plugin/org.eclipse.cmf.occi.infrastructure/model/Infrastructure.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.occiware.cloudautomation.connector;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.eclipse.cmf.occi.infrastructure.Architecture;
import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.infrastructure.StopMethod; 
import org.eclipse.cmf.occi.infrastructure.RestartMethod; 
import org.eclipse.cmf.occi.infrastructure.SuspendMethod; 
import org.eclipse.cmf.occi.infrastructure.SaveMethod;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/infrastructure#
 * - term: compute
 * - title: Compute Resource
 */
public class ComputeConnector extends org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl
{
	
    private static final String ID = "id";
    private static final String KIND = "kind";
    private static final String ATTRIBUTES = "attributes";
    private static final String TITLE = "occi.entity.title";
    private static final String SUMMARY = "occi.core.summary";
    private static final String ARCHITECTURE = "occi.compute.architecture";
    private static final String CORES = "occi.compute.cores";
    private static final String MEMORY = "occi.compute.memory";
    private static final String HOSTNAME = "occi.compute.hostname";
    private static final String STATE = "occi.compute.state";
	
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ComputeConnector.class);

	// Start of user code Computeconnector_constructor
	/**
	 * Constructs a compute connector.
	 */
	ComputeConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		System.out.println("Create compute");
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code ComputeocciCreate
	/**
	 * Called when this Compute instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
		
		try {

            JSONObject attributes = new JSONObject();
            attributes.put(ARCHITECTURE, this.getOcciComputeArchitecture().toString().toUpperCase());
            attributes.put(CORES, this.getOcciComputeCores());
            attributes.put(MEMORY,this.getOcciComputeMemory());
            attributes.put(TITLE, this.getTitle());
			attributes.put(SUMMARY, this.getSummary());

            JSONObject request = new JSONObject();
            request.put(ID,this.getId());
            request.put(KIND,this.getKind().getTitle());
            request.put(ATTRIBUTES,attributes);
			LOGGER.debug("Request sent : " + request.toJSONString());
            JSONObject response = new ConnectPCA().postRequest(request);
			getCloudAutomationInfo(response);
        }catch (Exception e){
	    System.out.println(e.getMessage());
            LOGGER.debug(e.getClass().getName() + " : "+e.getMessage());
        }

	}
	// End of user code

	// Start of user code Compute_occiRetrieve_method
	/**
	 * Called when this Compute instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
		try{
		    JSONObject response = new ConnectPCA().getRequest(this.id);
		    getCloudAutomationInfo(response);
		}catch (Exception e){
		    System.out.println(e.getMessage());
		    LOGGER.debug(e.getClass().getName() + " : "+e.getMessage());
		}

	}
	// End of user code

	// Start of user code Compute_occiUpdate_method
	/**
	 * Called when this Compute instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code ComputeocciDelete_method
	/**
	 * Called when this Compute instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Compute actions.
	//
	// Start of user code Compute_Kind_Start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: start
     * - title: Start the system
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);

		// Compute State Machine.
		switch(getOcciComputeState().getValue()) {

		case ComputeStatus.SUSPENDED_VALUE:
			LOGGER.debug("Fire transition(state=suspended, action=\"start\")...");
			// TODO Implement transition(state=suspended, action="start")
			if(true){
				setOcciComputeState(ComputeStatus.ACTIVE);
			}
			else	
					setOcciComputeState(ComputeStatus.ERROR);
			break;


		case ComputeStatus.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"start\")...");
			// TODO Implement transition(state=inactive, action="start")
			if(true){
				setOcciComputeState(ComputeStatus.ACTIVE);
			}
			else
				setOcciComputeState(ComputeStatus.ERROR);
			break;

		default:
			break;
		}
	}
		// End of user code

	// Start of user code Compute_Kind_Stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: stop
     * - title: Stop the system (graceful, acpioff or poweroff)
	 */
	@Override
	public void stop(final StopMethod method)
	{
		LOGGER.debug("Action stop(" + "method=" + method + ") called on " + this);

		// Compute State Machine.
		switch(getOcciComputeState().getValue()) {

		case ComputeStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"stop\")...");
			// TODO Implement transition(state=active, action="stop")
			if(true){
				setOcciComputeState(ComputeStatus.ERROR);
			}
			else					
				setOcciComputeState(ComputeStatus.INACTIVE);
			break;

		default:
			break;
		}
	}
		// End of user code

	// Start of user code Compute_Kind_Restart_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: restart
     * - title: Restart the system (graceful, warm or cold)
	 */
	@Override
	public void restart(final RestartMethod method)
	{
		LOGGER.debug("Action restart(" + "method=" + method + ") called on " + this);

		// Compute State Machine.
		switch(getOcciComputeState().getValue()) {
		default:
			break;
		}
	}
		// End of user code

	// Start of user code Compute_Kind_Suspend_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: suspend
     * - title: Suspend the system (hibernate or in RAM)
	 */
	@Override
	public void suspend(final SuspendMethod method)
	{
		LOGGER.debug("Action suspend(" + "method=" + method + ") called on " + this);

		// Compute State Machine.
		switch(getOcciComputeState().getValue()) {

		case ComputeStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"suspend\")...");
			// TODO Implement transition(state=active, action="suspend")
			if(true){
				setOcciComputeState(ComputeStatus.ERROR);
			}
			else	
					setOcciComputeState(ComputeStatus.SUSPENDED);
			break;

		default:
			break;
		}
	}
		// End of user code

	// Start of user code Compute_Kind_Save_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: save
     * - title: Save the system (hot, deferred)
	 */
	@Override
	public void save(final SaveMethod method, final String name)
	{
		LOGGER.debug("Action save(" + "method=" + method + "name=" + name + ") called on " + this);

		// Compute State Machine.
		switch(getOcciComputeState().getValue()) {
		default:
			break;
		}
	}
		// End of user code
	
	private void getCloudAutomationInfo(JSONObject response){
		LOGGER.debug("response : "+response.toJSONString());
        JSONObject attributes = (JSONObject) response.get(ATTRIBUTES);
        this.title = (String) getOrDefault(attributes,TITLE,this.title);
        this.summary  = (String) getOrDefault(attributes,SUMMARY,this.summary);
        this.occiComputeCores = Integer.parseInt(String.valueOf(getOrDefault(attributes, CORES,this.occiComputeCores)));
        this.occiComputeMemory = Float.parseFloat( String.valueOf(getOrDefault(attributes,MEMORY,this.occiComputeMemory)));
        this.occiComputeHostname = (String) getOrDefault(attributes,HOSTNAME,this.occiComputeHostname);
        setArchitecture((String) getOrDefault(attributes,ARCHITECTURE,this.occiComputeArchitecture.getName()));
        setStateStatus((String) getOrDefault(attributes,STATE,this.occiComputeState.getName()));
    }

    private Object getOrDefault(JSONObject attributes, String key, Object defaultValue){
		Object value = attributes.get(key);
		return value==null ? defaultValue : value;
	}

    private void setArchitecture(String s){
        if("X86".equalsIgnoreCase(s)) {
        	this.occiComputeArchitecture = Architecture.X86;
        }
        else if("X64".equalsIgnoreCase(s)) {
            this.occiComputeArchitecture = Architecture.X86;
        }
    }

    public void setStateStatus(String stateStatus){
        if("ACTIVE".equalsIgnoreCase(stateStatus)){
            this.occiComputeState = ComputeStatus.ACTIVE;
        }
        else if("SUSPENDED".equalsIgnoreCase(stateStatus)){
            this.occiComputeState = ComputeStatus.SUSPENDED;
        }
        else if("INACTIVE".equalsIgnoreCase(stateStatus)){
            this.occiComputeState= ComputeStatus.INACTIVE;
        }
        else if("ERROR".equalsIgnoreCase(stateStatus)){
            this.occiComputeState = ComputeStatus.ERROR;
        }
    }

}	
