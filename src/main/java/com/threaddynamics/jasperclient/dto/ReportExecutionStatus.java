
package com.threaddynamics.jasperclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * ReportExecutionStatus.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class ReportExecutionStatus extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3415709344232925548L;

    /** The value. */
    @JsonProperty
    private String value;

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value.
     * 
     * @param value the new value
     */
    public void setValue(String value) {
        this.value = value;
    }

}
