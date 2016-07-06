
package com.threaddynamics.jasperclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * ReportExecutionRequest.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@JsonRootName("reportExecutionRequest")
public class ReportExecutionRequest extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5987132875389961065L;

    /** The report unit uri. */
    @JsonProperty("reportUnitUri")
    private String reportUnitUri;

    /** The asychronous. */
    @JsonProperty("async")
    private boolean asychronous;

    /** The fresh data. */
    @JsonProperty("freshData")
    private boolean freshData;

    /** The save data snapshot. */
    @JsonProperty("saveDataSnapshot")
    private boolean saveDataSnapshot;

    /** The output format. */
    @JsonProperty("outputFormat")
    private String outputFormat;

    /** The interactive. */
    @JsonProperty("interactive")
    private boolean interactive;

    /** The ignore pagination. */
    @JsonProperty("ignorePagination")
    private boolean ignorePagination;

    /** The pages. */
    @JsonProperty("pages")
    private String pages;

    /** The report parameters. */
    @JsonProperty("parameters")
    private ReportParameters reportParameters;

    /**
     * Checks if is asychronous.
     * 
     * @return true, if is asychronous
     */
    public boolean isAsychronous() {
        return asychronous;
    }

    /**
     * Sets the asychronous.
     * 
     * @param asychronous the new asychronous
     */
    public void setAsychronous(final boolean asychronous) {
        this.asychronous = asychronous;
    }

    /**
     * Checks if is fresh data.
     * 
     * @return true, if is fresh data
     */
    public boolean isFreshData() {
        return freshData;
    }

    /**
     * Sets the fresh data.
     * 
     * @param freshData the new fresh data
     */
    public void setFreshData(final boolean freshData) {
        this.freshData = freshData;
    }

    /**
     * Checks if is save data snapshot.
     * 
     * @return true, if is save data snapshot
     */
    public boolean isSaveDataSnapshot() {
        return saveDataSnapshot;
    }

    /**
     * Sets the save data snapshot.
     * 
     * @param saveDataSnapshot the new save data snapshot
     */
    public void setSaveDataSnapshot(final boolean saveDataSnapshot) {
        this.saveDataSnapshot = saveDataSnapshot;
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
    public void setOutputFormat(final String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * Checks if is interactive.
     * 
     * @return true, if is interactive
     */
    public boolean isInteractive() {
        return interactive;
    }

    /**
     * Sets the interactive.
     * 
     * @param interactive the new interactive
     */
    public void setInteractive(final boolean interactive) {
        this.interactive = interactive;
    }

    /**
     * Checks if is ignore pagination.
     * 
     * @return true, if is ignore pagination
     */
    public boolean isIgnorePagination() {
        return ignorePagination;
    }

    /**
     * Sets the ignore pagination.
     * 
     * @param ignorePagination the new ignore pagination
     */
    public void setIgnorePagination(final boolean ignorePagination) {
        this.ignorePagination = ignorePagination;
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
    public void setPages(final String pages) {
        this.pages = pages;
    }

    /**
     * Gets the report unit uri.
     * 
     * @return the report unit uri
     */
    public String getReportUnitUri() {
        return reportUnitUri;
    }

    /**
     * Sets the report unit uri.
     * 
     * @param reportUnitUri the new report unit uri
     */
    public void setReportUnitUri(final String reportUnitUri) {
        this.reportUnitUri = reportUnitUri;
    }

    /**
     * Gets the report parameters.
     * 
     * @return the report parameters
     */
    public ReportParameters getReportParameters() {
        return reportParameters;
    }

    /**
     * Sets the report parameters.
     * 
     * @param reportParameters the new report parameters
     */
    public void setReportParameters(final ReportParameters reportParameters) {
        this.reportParameters = reportParameters;
    }

}
