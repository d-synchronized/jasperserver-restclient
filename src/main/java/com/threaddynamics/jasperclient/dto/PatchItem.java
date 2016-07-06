
package com.threaddynamics.jasperclient.dto;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * PatchItem.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("patchItems")
public class PatchItem extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1506119919767367872L;

    /** The version. */
    @JsonProperty
    private int version;

    /** The patches. */
    @JsonProperty("patch")
    private List<Patch> patches = new ArrayList<Patch>();

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
     * Gets the patches.
     * 
     * @return the patches
     */
    public List<Patch> getPatches() {
        return patches;
    }

    /**
     * Sets the patches.
     * 
     * @param patches the new patches
     */
    public void setPatches(List<Patch> patches) {
        this.patches = patches;
    }

}
