
package com.threaddynamics.jasperclient.dto;

import java.text.SimpleDateFormat;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * Folder.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("folder")
@JsonIgnoreProperties
public class Folder extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1922629461253248394L;

    /** The creation date. */
    @JsonProperty
    private SimpleDateFormat creationDate;

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
    private SimpleDateFormat updateDate;

    /** The uri. */
    @JsonProperty
    private String uri;

    /** The version. */
    @JsonProperty
    private int version;

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
    public void setLabel(String label) {
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
    public void setPermissionMask(int permissionMask) {
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
    public void setUri(String uri) {
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
    public void setVersion(int version) {
        this.version = version;
    }

    /**
     * Gets the creation date.
     * 
     * @return the creation date
     */
    public SimpleDateFormat getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the creation date.
     * 
     * @param creationDate the new creation date
     */
    public void setCreationDate(SimpleDateFormat creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Gets the update date.
     * 
     * @return the update date
     */
    public SimpleDateFormat getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the update date.
     * 
     * @param updateDate the new update date
     */
    public void setUpdateDate(SimpleDateFormat updateDate) {
        this.updateDate = updateDate;
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
    public void setDescription(String description) {
        this.description = description;
    }

}
