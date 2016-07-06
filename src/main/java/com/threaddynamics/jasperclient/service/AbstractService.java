
package com.threaddynamics.jasperclient.service;

import com.threaddynamics.jasperclient.client.Resource;
import com.threaddynamics.jasperclient.client.Service;
import com.threaddynamics.jasperclient.dto.Credentials;
import com.threaddynamics.jasperclient.utility.Util;

/**
 * AbstractService.java
 * 
 * @param <RT> the generic type
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public abstract class AbstractService<RT extends Resource> extends Service<RT> {

    /** The authorization info. */
    protected String authorizationInfo;

    /**
     * Instantiates a new abstract service.
     * 
     * @param restBaseUri the rest base uri
     * @param login the login
     */
    public AbstractService(final String restBaseUri, final Credentials login) {
        super(restBaseUri);
        authorizationInfo = Util.getAuthorizationInformation(login);
    }

}
