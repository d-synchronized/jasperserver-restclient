
package com.threaddynamics.jasperclient.dto;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * Export.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("export")
public class Export extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5095255314543594924L;

    /** The id. */
    @JsonProperty
    private String id;

    /** The status. */
    @JsonProperty
    private String status;

    /** The output resource. */
    @JsonProperty
    private OutputResource outputResource;

    /** The attachments. */
    @JsonProperty("attachments")
    private List<Attachment> attachments = new ArrayList<Attachment>();

    /** The output format. */
    @JsonProperty
    private String outputFormat;

    /** The pages. */
    @JsonProperty
    private String pages;

    /** The attachments prefix. */
    @JsonProperty
    private String attachmentsPrefix;

    /** The error descriptor. */
    @JsonProperty("errorDescriptor")
    private String errorDescriptor;

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     * 
     * @param id the new id
     */
    public void setId(String id) {
        this.id = id;
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

    /**
     * Gets the attachments.
     * 
     * @return the attachments
     */
    public List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     * Sets the attachments.
     * 
     * @param attachments the new attachments
     */
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    /**
     * Gets the output format.
     * 
     * @return the output format
     */
    public String getOutputFormat() {
        return outputFormat;
    }

    /**
     * Sets the output format.
     * 
     * @param outputFormat the new output format
     */
    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * Gets the pages.
     * 
     * @return the pages
     */
    public String getPages() {
        return pages;
    }

    /**
     * Sets the pages.
     * 
     * @param pages the new pages
     */
    public void setPages(String pages) {
        this.pages = pages;
    }

    /**
     * Gets the attachments prefix.
     * 
     * @return the attachments prefix
     */
    public String getAttachmentsPrefix() {
        return attachmentsPrefix;
    }

    /**
     * Sets the attachments prefix.
     * 
     * @param attachmentsPrefix the new attachments prefix
     */
    public void setAttachmentsPrefix(String attachmentsPrefix) {
        this.attachmentsPrefix = attachmentsPrefix;
    }

    /**
     * Gets the error descriptor.
     * 
     * @return the error descriptor
     */
    public String getErrorDescriptor() {
        return errorDescriptor;
    }

    /**
     * Sets the error descriptor.
     * 
     * @param errorDescriptor the new error descriptor
     */
    public void setErrorDescriptor(String errorDescriptor) {
        this.errorDescriptor = errorDescriptor;
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
}
