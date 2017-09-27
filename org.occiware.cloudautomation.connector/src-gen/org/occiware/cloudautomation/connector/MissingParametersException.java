package org.occiware.cloudautomation.connector;

public class MissingParametersException extends RuntimeException{

    public MissingParametersException(String message){
        super(message);
    }
}
