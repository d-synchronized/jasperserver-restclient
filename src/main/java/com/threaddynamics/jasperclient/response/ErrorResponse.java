
package com.threaddynamics.jasperclient.response;

import java.util.Collection;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

import com.threaddynamics.jasperclient.dto.BaseDto;
import com.threaddynamics.jasperclient.dto.Parameter;

/**
 * ErrorResponse.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("errorDescriptor")
public class ErrorResponse extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7884710793205352600L;

    /** The error code. */
    @JsonProperty("errorCode")
    private String errorCode;

    /** The error message. */
    @JsonProperty("message")
    private String errorMessage;

    /** The parameters. */
    @JsonProperty("parameters")
    private Collection<Parameter> parameters;

    /**
     * Gets the error code.
     * 
     * @return the error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the error code.
     * 
     * @param errorCode the new error code
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Gets the error message.
     * 
     * @return the error message
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the error message.
     * 
     * @param errorMessage the new error message
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Gets the parameters.
     * 
     * @return the parameters
     */
    public Collection<Parameter> getParameters() {
        return parameters;
    }

    /**
     * Sets the parameters.
     * 
     * @param parameters the new parameters
     */
    public void setParameters(Collection<Parameter> parameters) {
        this.parameters = parameters;
    }

}
