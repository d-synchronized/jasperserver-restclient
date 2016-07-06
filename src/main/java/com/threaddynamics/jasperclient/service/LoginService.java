
package com.threaddynamics.jasperclient.service;

import org.jboss.resteasy.client.ClientResponse;

import com.threaddynamics.exception.CustomException;
import com.threaddynamics.jasperclient.dto.Credentials;
import com.threaddynamics.jasperclient.resource.LoginResource;

/**
 * LoginService.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class LoginService extends AbstractService<LoginResource> {

    /**
     * Instantiates a new login service.
     * 
     * @param restBaseUri the rest base uri
     * @param login the login
     */
    public LoginService(final String restBaseUri, final Credentials login) {
        super(restBaseUri, login);
    }

    /*
     * @see com.threaddynamics.jasperclient.client.Service#getResourceClass()
     */
    @Override
    protected Class<LoginResource> getResourceClass() {
        return LoginResource.class;
    }

    /**
     * Login to jasper.
     * 
     * @param username the username
     * @param password the password
     * @return the string
     * @throws CustomException the custom exception
     */
    public String loginToJasper(final String username, final String password)
        throws CustomException {
        final ClientResponse<String> loginResponse = resourceProxy.loginToJasper(username, password);
        return parseEntityFromResponse(loginResponse, CustomException.class);
    }

}
