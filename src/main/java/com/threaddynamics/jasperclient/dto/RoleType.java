
package com.threaddynamics.jasperclient.dto;

/**
 * RoleType.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public enum RoleType {

    USER("ROLE_USER"),
    ADMINISTRATOR("ROLE_ADMINISTRATOR"),

    /** The manager. */
    MANAGER("ROLE_MANAGER");

    private String roleType;

    RoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

}
