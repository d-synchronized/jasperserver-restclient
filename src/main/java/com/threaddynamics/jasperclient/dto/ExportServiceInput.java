
package com.threaddynamics.jasperclient.dto;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * ExportServiceInput.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class ExportServiceInput extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4492107035058373680L;

    /** The roles. */
    @JsonProperty("roles")
    private List<String> roles = new ArrayList<String>();

    /** The users. */
    @JsonProperty("users")
    private List<String> users = new ArrayList<String>();

    /** The uris. */
    @JsonProperty("uris")
    private List<String> uris = new ArrayList<String>();

    /** The parameters. */
    @JsonProperty("parameters")
    private List<String> parameters = new ArrayList<String>();

    /**
     * Gets the roles.
     * 
     * @return the roles
     */
    public List<String> getRoles() {
        return roles;
    }

    /**
     * Sets the roles.
     * 
     * @param roles the new roles
     */
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    /**
     * Gets the users.
     * 
     * @return the users
     */
    public List<String> getUsers() {
        return users;
    }

    /**
     * Sets the users.
     * 
     * @param users the new users
     */
    public void setUsers(List<String> users) {
        this.users = users;
    }

    /**
     * Gets the uris.
     * 
     * @return the uris
     */
    public List<String> getUris() {
        return uris;
    }

    /**
     * Sets the uris.
     * 
     * @param uris the new uris
     */
    public void setUris(List<String> uris) {
        this.uris = uris;
    }

    /**
     * Gets the parameters.
     * 
     * @return the parameters
     */
    public List<String> getParameters() {
        return parameters;
    }

    /**
     * Sets the parameters.
     * 
     * @param parameters the new parameters
     */
    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

}
