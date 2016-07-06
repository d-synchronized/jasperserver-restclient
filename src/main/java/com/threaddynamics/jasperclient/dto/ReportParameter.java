
package com.threaddynamics.jasperclient.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * ReportParameter.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("reportParameter")
public class ReportParameter extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1453967972448022283L;
    /** The value. */
    @JsonProperty("value")
    private List<String> value;

    /** The name. */
    @JsonProperty("name")
    private String name;

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public List<String> getValue() {
        return value;
    }

    /**
     * Sets the value.
     * 
     * @param value the new value
     */
    public void setValue(List<String> value) {
        this.value = value;
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

}
