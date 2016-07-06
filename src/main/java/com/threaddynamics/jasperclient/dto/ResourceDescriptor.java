
package com.threaddynamics.jasperclient.dto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * ResourceDescriptor.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("resourceDescriptor")
public class ResourceDescriptor extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8158400114620460359L;

    /** The name. */
    @JsonProperty
    private String name;

    /** The ws type. */
    @JsonProperty
    private String wsType;

    /** The uri string. */
    @JsonProperty
    private String uriString;

    /** The is new. */
    @JsonProperty
    private boolean isNew;

    /** The label. */
    @JsonProperty
    private String label;

    /** The description. */
    @JsonProperty
    private String description;

    /** The creation date. */
    @JsonProperty
    private SimpleDateFormat creationDate;

    /** The resource properties. */
    @JsonProperty("resourceProperty")
    private List<ResourceProperty> resourceProperties = new ArrayList<ResourceProperty>();

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
     * Gets the resource properties.
     * 
     * @return the resource properties
     */
    public List<ResourceProperty> getResourceProperties() {
        return resourceProperties;
    }

    /**
     * Sets the resource properties.
     * 
     * @param resourceProperties the new resource properties
     */
    public void setResourceProperties(List<ResourceProperty> resourceProperties) {
        this.resourceProperties = resourceProperties;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the ws type.
     * 
     * @return the ws type
     */
    public String getWsType() {
        return wsType;
    }

    /**
     * Sets the ws type.
     * 
     * @param wsType the new ws type
     */
    public void setWsType(String wsType) {
        this.wsType = wsType;
    }

    /**
     * Gets the uri string.
     * 
     * @return the uri string
     */
    public String getUriString() {
        return uriString;
    }

    /**
     * Sets the uri string.
     * 
     * @param uriString the new uri string
     */
    public void setUriString(String uriString) {
        this.uriString = uriString;
    }

    /**
     * Checks if is new.
     * 
     * @return true, if is new
     */
    public boolean isNew() {
        return isNew;
    }

    /**
     * Sets the new.
     * 
     * @param isNew the new new
     */
    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

}
