
package com.threaddynamics.jasperclient.response;

import org.codehaus.jackson.annotate.JsonProperty;

import com.threaddynamics.jasperclient.dto.BaseDto;

/**
 * ImportExportResponse.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class ImportExportResponse extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5837418980638646199L;

    /** The service identifier. */
    @JsonProperty("id")
    private String serviceIdentifier;

    /** The service phase. */
    @JsonProperty("phase")
    private String servicePhase;

    /** The service message. */
    @JsonProperty("message")
    private String serviceMessage;

    /**
     * Gets the service identifier.
     * 
     * @return the service identifier
     */
    public String getServiceIdentifier() {
        return serviceIdentifier;
    }

    /**
     * Sets the service identifier.
     * 
     * @param serviceIdentifier the new service identifier
     */
    public void setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }

    /**
     * Gets the service phase.
     * 
     * @return the service phase
     */
    public String getServicePhase() {
        return servicePhase;
    }

    /**
     * Sets the service phase.
     * 
     * @param servicePhase the new service phase
     */
    public void setServicePhase(String servicePhase) {
        this.servicePhase = servicePhase;
    }

    /**
     * Gets the service message.
     * 
     * @return the service message
     */
    public String getServiceMessage() {
        return serviceMessage;
    }

    /**
     * Sets the service message.
     * 
     * @param serviceMessage the new service message
     */
    public void setServiceMessage(String serviceMessage) {
        this.serviceMessage = serviceMessage;
    }

}
