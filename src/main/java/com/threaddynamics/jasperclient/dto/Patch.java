
package com.threaddynamics.jasperclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * Patch.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("patch")
public class Patch extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7455557858977307715L;

    /** The field. */
    @JsonProperty
    private String field;

    /** The value. */
    @JsonProperty
    private String value;

    /** The expression. */
    @JsonProperty
    private String expression;

    /**
     * Gets the field.
     * 
     * @return the field
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the field.
     * 
     * @param field the new field
     */
    public void setField(String field) {
        this.field = field;
    }

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

    /**
     * Gets the expression.
     * 
     * @return the expression
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the expression.
     * 
     * @param expression the new expression
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

}
