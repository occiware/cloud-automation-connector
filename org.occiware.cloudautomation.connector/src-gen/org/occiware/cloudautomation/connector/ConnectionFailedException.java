package org.occiware.cloudautomation.connector;

public class ConnectionFailedException extends RuntimeException {

    public ConnectionFailedException(String message){
        super(message);
    }
}
