
package com.threaddynamics.jasperclient.dto;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * Users.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("users")
public class Users extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3605815870220308507L;

    /** The users. */
    @JsonProperty("user")
    private List<User> users = new ArrayList<User>();

    /**
     * Gets the users.
     * 
     * @return the users
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Sets the users.
     * 
     * @param users the new users
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }

}
