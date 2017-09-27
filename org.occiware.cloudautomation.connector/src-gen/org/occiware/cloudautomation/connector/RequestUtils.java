package org.occiware.cloudautomation.connector;

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
        return new Properties().getProperty("server.endpoint");
    }

    public static boolean postRequestWithSessionId(RequestSpecification request, String url, CredentialsConnector creds){
        if(! responseIs2xx(postRequest(request,url,creds))){
            LOGGER.info("session id expired, renewing a new one");
            creds.refreshSessionId();
            Response response = postRequest(request,url,creds);
            if(! responseIs2xx(response)){
                LOGGER.error(response.asString());
                return false;
            }
        }
        return true;
    }

    private static Response postRequest(RequestSpecification request, String url, CredentialsConnector creds){
        return request.header("sessionid",creds.getSessionid())
                .post(url)
                .then()
                .extract()
                .response();
    }

}
