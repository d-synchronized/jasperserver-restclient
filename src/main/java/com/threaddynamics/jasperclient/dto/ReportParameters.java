
package com.threaddynamics.jasperclient.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * ReportParameters.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class ReportParameters {

    /** The report parameters. */
    @JsonProperty("reportParameter")
    private List<ReportParameter> reportParameters;

    /**
     * Gets the report parameters.
     * 
     * @return the report parameters
     */
    public List<ReportParameter> getReportParameters() {
        return reportParameters;
    }

    /**
     * Sets the report parameters.
     * 
     * @param reportParameters the new report parameters
     */
    public void setReportParameters(final List<ReportParameter> reportParameters) {
        this.reportParameters = reportParameters;
    }

}
