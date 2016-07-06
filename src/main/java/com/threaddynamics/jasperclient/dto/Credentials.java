
package com.threaddynamics.jasperclient.dto;

/**
 * Credentials.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class Credentials extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8050373964245868055L;

    /** The username. */
    private String username;

    /** The password. */
    private String password;

    /**
     * Instantiates a new credentials.
     * 
     * @param username the username
     * @param password the password
     */
    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
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
