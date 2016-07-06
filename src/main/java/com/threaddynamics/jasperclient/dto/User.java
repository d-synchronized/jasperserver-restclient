
package com.threaddynamics.jasperclient.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * User.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("user")
public class User extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6533800517931278874L;

    /** The externally defined. */
    @JsonProperty
    private boolean externallyDefined;

    /** The full name. */
    @JsonProperty
    private String fullName;

    /** The email address. */
    @JsonProperty("emailAddress")
    private String emailAddress;

    /** The password. */
    @JsonProperty("password")
    private String password;

    /** The username. */
    @JsonProperty
    private String username;

    /** The enabled. */
    @JsonProperty
    private boolean enabled;

    /** The roles. */
    @JsonProperty("roles")
    private List<Role> roles = new ArrayList<Role>();

    /** The previous password change time. */
    @JsonProperty
    private Date previousPasswordChangeTime;

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
     * Gets the full name.
     * 
     * @return the full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the full name.
     * 
     * @param fullName the new full name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Gets the username.
     * 
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     * 
     * @param username the new username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Checks if is enabled.
     * 
     * @return true, if is enabled
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the enabled.
     * 
     * @param enabled the new enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

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

    /**
     * Gets the previous password change time.
     * 
     * @return the previous password change time
     */
    public Date getPreviousPasswordChangeTime() {
        return previousPasswordChangeTime;
    }

    /**
     * Sets the previous password change time.
     * 
     * @param previousPasswordChangeTime the new previous password change time
     */
    public void setPreviousPasswordChangeTime(Date previousPasswordChangeTime) {
        this.previousPasswordChangeTime = previousPasswordChangeTime;
    }

    /**
     * Gets the email address.
     * 
     * @return the email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the email address.
     * 
     * @param emailAddress the new email address
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Gets the password.
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * 
     * @param password the new password
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
