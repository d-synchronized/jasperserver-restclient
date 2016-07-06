
package com.threaddynamics.jasperclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * Role.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("role")
public class Role extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1640889417740291343L;

    /** The externally defined. */
    @JsonProperty
    private boolean externallyDefined;

    /** The role type. */
    @JsonProperty("name")
    private String roleType;

    /**
     * Checks if is externally defined.
     * 
     * @return true, if is externally defined
     */
    public boolean isExternallyDefined() {
        return externallyDefined;
    }

    /**
     * Sets the externally defined.
     * 
     * @param externallyDefined the new externally defined
     */
    public void setExternallyDefined(boolean externallyDefined) {
        this.externallyDefined = externallyDefined;
    }

    /**
     * Gets the role type.
     * 
     * @return the role type
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * Sets the role type.
     * 
     * @param roleType the new role type
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

}
