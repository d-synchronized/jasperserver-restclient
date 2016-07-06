
package com.threaddynamics.jasperclient.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * Resources.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("resources")
public class Resources {

    /** The resources. */
    @JsonProperty("resourceLookup")
    private List<Resource> resourceList;

    /**
     * Gets the resource list.
     * 
     * @return the resource list
     */
    public List<Resource> getResourceList() {
        return resourceList;
    }

    /**
     * Sets the resource list.
     * 
     * @param resourceList the new resource list
     */
    public void setResourceList(final List<Resource> resourceList) {
        this.resourceList = resourceList;
    }

}
