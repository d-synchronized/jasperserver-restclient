
package com.threaddynamics.jasperclient.dto;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * ReportExecutions.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class ReportExecutions extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1430416657955099199L;

    /** The report executions. */
    @JsonProperty("reportExecutions")
    private List<ReportExecution> reportExecutions = new ArrayList<ReportExecution>();

    /**
     * Gets the report executions.
     * 
     * @return the report executions
     */
    public List<ReportExecution> getReportExecutions() {
        return reportExecutions;
    }

    /**
     * Sets the report executions.
     * 
     * @param reportExecutions the new report executions
     */
    public void setReportExecutions(List<ReportExecution> reportExecutions) {
        this.reportExecutions = reportExecutions;
    }

}
