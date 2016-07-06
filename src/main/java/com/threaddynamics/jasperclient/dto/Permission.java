
package com.threaddynamics.jasperclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * Permission.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("repositoryPermission")
public class Permission extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4688035934927385272L;

    /** The permisssion code. */
    @JsonProperty("mask")
    private int permisssionCode;

    /** The recipient. */
    @JsonProperty("recipient")
    private String recipient;

    /** The resource path. */
    @JsonProperty("uri")
    private String resourcePath;

    /**
     * Gets the recipient.
     * 
     * @return the recipient
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Sets the recipient.
     * 
     * @param recipient the new recipient
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     * Gets the permisssion code.
     * 
     * @return the permisssion code
     */
    public int getPermisssionCode() {
        return permisssionCode;
    }

    /**
     * Sets the permisssion code.
     * 
     * @param permisssionCode the new permisssion code
     */
    public void setPermisssionCode(int permisssionCode) {
        this.permisssionCode = permisssionCode;
    }

    /**
     * Gets the resource path.
     * 
     * @return the resource path
     */
    public String getResourcePath() {
        return resourcePath;
    }

    /**
     * Sets the resource path.
     * 
     * @param resourcePath the new resource path
     */
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

}
