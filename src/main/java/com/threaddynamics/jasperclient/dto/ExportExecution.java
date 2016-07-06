
package com.threaddynamics.jasperclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * ExportExecution.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("exportExecution")
public class ExportExecution extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -270417277083215897L;

    /** The export execution identifier. */
    @JsonProperty("id")
    private String exportExecutionIdentifier;

    /** The status. */
    @JsonProperty
    private String status;

    /** The output resource. */
    @JsonProperty
    private OutputResource outputResource;

    /**
     * Gets the export execution identifier.
     * 
     * @return the export execution identifier
     */
    public String getExportExecutionIdentifier() {
        return exportExecutionIdentifier;
    }

    /**
     * Sets the export execution identifier.
     * 
     * @param exportExecutionIdentifier the new export execution identifier
     */
    public void setExportExecutionIdentifier(String exportExecutionIdentifier) {
        this.exportExecutionIdentifier = exportExecutionIdentifier;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param status the new status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the output resource.
     * 
     * @return the output resource
     */
    public OutputResource getOutputResource() {
        return outputResource;
    }

    /**
     * Sets the output resource.
     * 
     * @param outputResource the new output resource
     */
    public void setOutputResource(OutputResource outputResource) {
        this.outputResource = outputResource;
    }

}
