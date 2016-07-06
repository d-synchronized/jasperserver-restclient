
package com.threaddynamics.jasperclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * OutputResource.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("outputResource")
public class OutputResource extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5751291494118293229L;

    /** The content type. */
    @JsonProperty("contentType")
    private String contentType;

    /** The file name. */
    @JsonProperty("fileName")
    private String fileName;

    /**
     * Gets the content type.
     * 
     * @return the content type
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the content type.
     * 
     * @param contentType the new content type
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Gets the file name.
     * 
     * @return the file name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the file name.
     * 
     * @param fileName the new file name
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
