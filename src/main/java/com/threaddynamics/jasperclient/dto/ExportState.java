
package com.threaddynamics.jasperclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * ExportState.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("state")
public class ExportState extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5888369168897860218L;

    /** The export phase. */
    @JsonProperty("phase")
    private String exportPhase;

    /** The export message. */
    @JsonProperty("message")
    private String exportMessage;

    /**
     * Gets the export phase.
     * 
     * @return the export phase
     */
    public String getExportPhase() {
        return exportPhase;
    }

    /**
     * Sets the export phase.
     * 
     * @param exportPhase the new export phase
     */
    public void setExportPhase(String exportPhase) {
        this.exportPhase = exportPhase;
    }

    /**
     * Gets the export message.
     * 
     * @return the export message
     */
    public String getExportMessage() {
        return exportMessage;
    }

    /**
     * Sets the export message.
     * 
     * @param exportMessage the new export message
     */
    public void setExportMessage(String exportMessage) {
        this.exportMessage = exportMessage;
    }

}
