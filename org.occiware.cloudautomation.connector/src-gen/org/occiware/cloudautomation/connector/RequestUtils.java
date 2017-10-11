package org.occiware.cloudautomation.connector;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestUtils {

    private static Logger LOGGER = LoggerFactory.getLogger(RequestUtils.class);

    public static boolean responseIs2xx(Response response) {
        if (!(200 <= response.getStatusCode() && response.getStatusCode() < 300)) {
            return false;
        }
        return true;
    }

    public static String readServerEndpoint(){
        Properties prop = new Properties();
        try (InputStream input = RequestUtils.class.getClassLoader().getResourceAsStream("resources/config.properties")){
            prop.load(input);
            return prop.getProperty("server.endpoint");

        } catch (IOException ex) {
            LOGGER.error("Unable to get the cloud automation service url from config.properties", ex);
        }
        return "localhost:8080";
    }

    public static Optional<String> getRequestWithSessionId(RequestSpecification request, String url ,CredentialsConnector creds){
        if(creds.getSessionid() == null){
            creds.refreshSessionId();
        }
        Response response = getRequest(request,url,creds);
        if(! responseIs2xx(response)){
            LOGGER.info("Session id expired, renewing a new one");
            creds.refreshSessionId();
            response = getRequest(request,url,creds);
            LOGGER.info("POST with session id renewed");
            if(! responseIs2xx(response)){
                LOGGER.error("Post request failed : \n"+response.asString());
                return Optional.empty();
            }
        }
        return Optional.of(response.asString());
    }

    public static Optional<String> postRequestWithSessionId(RequestSpecification request, String url, CredentialsConnector creds){
        if (creds.getSessionid() == null){
            creds.refreshSessionId();
        }
        Response response = postRequest(request,url,creds);
        if(! responseIs2xx(response)){
            LOGGER.info("Session id expired, renewing a new one");
            creds.refreshSessionId();
            response = postRequest(request,url,creds);
            LOGGER.info("POST with session id renewed");
            if(! responseIs2xx(response)){
                LOGGER.error("Post request failed : \n"+response.asString());
                return Optional.empty();
            }
        }
        return Optional.of(response.asString());
    }

    public static Optional<String> deleteRequestWithSessionId(RequestSpecification request, String url, CredentialsConnector creds){
        if(creds.getSessionid()==null){
            creds.refreshSessionId();
        }
        Response response = deleteRequest(request,url,creds);
        if(! responseIs2xx(response)){
            LOGGER.info("Session id expired, renewing a new one");
            creds.refreshSessionId();
            response = deleteRequest(request,url,creds);
            LOGGER.info("POST with session id renewed");
            if(! responseIs2xx(response)){
                LOGGER.error("Post request failed : \n"+response.asString());
                return Optional.empty();
            }
        }
        return Optional.of(response.asString());
    }

    private static Response getRequest(RequestSpecification request, String url, CredentialsConnector creds){
        return request.header("sessionid", creds.getSessionid())
                .get(url)
                .then()
                .extract()
                .response();
    }

    private static Response postRequest(RequestSpecification request, String url, CredentialsConnector creds){
        return request.header("sessionid", creds.getSessionid())
                .post(url)
                .then()
                .extract()
                .response();
    }

    private static Response deleteRequest(RequestSpecification request, String url, CredentialsConnector creds) {
        return request.header("sessionid", creds.getSessionid())
                .delete(url)
                .then()
                .extract()
                .response();
    }

}
