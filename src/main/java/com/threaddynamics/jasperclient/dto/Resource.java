
package com.threaddynamics.jasperclient.dto;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.threaddynamics.jasperclient.utility.SimpleDateDeserializer;

/**
 * Resource.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class Resource {

    /** The creation date. */
    @JsonProperty
    private Date creationDate;

    /** The description. */
    @JsonProperty
    private String description;

    /** The label. */
    @JsonProperty
    private String label;

    /** The permission mask. */
    @JsonProperty
    private int permissionMask;

    /** The update date. */
    @JsonProperty
    private Date updateDate;

    /** The uri. */
    @JsonProperty
    private String uri;

    /** The version. */
    @JsonProperty
    private int version;

    /** The resource type. */
    @JsonProperty
    private String resourceType;

    /**
     * Gets the creation date.
     * 
     * @return the creation date
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the creation date.
     * 
     * @param creationDate the new creation date
     */
    @JsonDeserialize(using = SimpleDateDeserializer.class)
    public void setCreationDate(final Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Gets the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * 
     * @param description the new description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Gets the label.
     * 
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the label.
     * 
     * @param label the new label
     */
    public void setLabel(final String label) {
        this.label = label;
    }

    /**
     * Gets the permission mask.
     * 
     * @return the permission mask
     */
    public int getPermissionMask() {
        return permissionMask;
    }

    /**
     * Sets the permission mask.
     * 
     * @param permissionMask the new permission mask
     */
    public void setPermissionMask(final int permissionMask) {
        this.permissionMask = permissionMask;
    }

    /**
     * Gets the uri.
     * 
     * @return the uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the uri.
     * 
     * @param uri the new uri
     */
    public void setUri(final String uri) {
        this.uri = uri;
    }

    /**
     * Gets the version.
     * 
     * @return the version
     */
    public int getVersion() {
        return version;
    }

    /**
     * Sets the version.
     * 
     * @param version the new version
     */
    public void setVersion(final int version) {
        this.version = version;
    }

    /**
     * Gets the resource type.
     * 
     * @return the resource type
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Sets the resource type.
     * 
     * @param resourceType the new resource type
     */
    public void setResourceType(final String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Gets the update date.
     * 
     * @return the update date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the update date.
     * 
     * @param updateDate the new update date
     */
    @JsonDeserialize(using = SimpleDateDeserializer.class)
    public void setUpdateDate(final Date updateDate) {
        this.updateDate = updateDate;
    }

}
