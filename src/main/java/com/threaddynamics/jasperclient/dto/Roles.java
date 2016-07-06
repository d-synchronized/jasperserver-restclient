
package com.threaddynamics.jasperclient.dto;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * Roles.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("roles")
public class Roles extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 946834086896832400L;

    /** The roles. */
    @JsonProperty("role")
    private List<Role> roles = new ArrayList<Role>();

    /**
     * Gets the roles.
     * 
     * @return the roles
     */
    public List<Role> getRoles() {
        return roles;
    }

    /**
     * Sets the roles.
     * 
     * @param roles the new roles
     */
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

}
