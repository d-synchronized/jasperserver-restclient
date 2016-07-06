
package com.threaddynamics.jasperclient.dto;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * ReportExecution.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("reportExecution")
public class ReportExecution extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3452907158663380805L;

    /** The current page. */
    @JsonProperty
    private int currentPage;

    /** The exports. */
    @JsonProperty("exports")
    private List<Export> exports = new ArrayList<Export>();

    /** The report uri. */
    @JsonProperty
    private String reportURI;

    /** The request id. */
    @JsonProperty
    private String requestId;

    /** The status. */
    @JsonProperty
    private String status;

    /** The total pages. */
    @JsonProperty
    private int totalPages;

    /** The error descriptor. */
    @JsonProperty("errorDescriptor")
    private String errorDescriptor;

    /**
     * Gets the current page.
     * 
     * @return the current page
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Sets the current page.
     * 
     * @param currentPage the new current page
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * Gets the exports.
     * 
     * @return the exports
     */
    public List<Export> getExports() {
        return exports;
    }

    /**
     * Sets the exports.
     * 
     * @param exports the new exports
     */
    public void setExports(List<Export> exports) {
        this.exports = exports;
    }

    /**
     * Gets the report uri.
     * 
     * @return the report uri
     */
    public String getReportURI() {
        return reportURI;
    }

    /**
     * Sets the report uri.
     * 
     * @param reportURI the new report uri
     */
    public void setReportURI(String reportURI) {
        this.reportURI = reportURI;
    }

    /**
     * Gets the request id.
     * 
     * @return the request id
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the request id.
     * 
     * @param requestId the new request id
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
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
     * Gets the total pages.
     * 
     * @return the total pages
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the total pages.
     * 
     * @param totalPages the new total pages
     */
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
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

}
