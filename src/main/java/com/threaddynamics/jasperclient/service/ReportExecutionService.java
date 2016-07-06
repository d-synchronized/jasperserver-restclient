
package com.threaddynamics.jasperclient.service;

import java.io.File;
import java.text.SimpleDateFormat;

import org.jboss.resteasy.client.ClientResponse;

import com.threaddynamics.exception.CustomException;
import com.threaddynamics.jasperclient.dto.Credentials;
import com.threaddynamics.jasperclient.dto.Export;
import com.threaddynamics.jasperclient.dto.ExportExecution;
import com.threaddynamics.jasperclient.dto.JasperReport;
import com.threaddynamics.jasperclient.dto.ReportExecution;
import com.threaddynamics.jasperclient.dto.ReportExecutionRequest;
import com.threaddynamics.jasperclient.dto.ReportExecutionStatus;
import com.threaddynamics.jasperclient.dto.ReportExecutions;
import com.threaddynamics.jasperclient.resource.ReportExecutionResource;

/**
 * ReportExecutionService.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class ReportExecutionService extends AbstractService<ReportExecutionResource> {

    /**
     * Instantiates a new report execution service.
     * 
     * @param restBaseUri the rest base uri
     * @param login the login
     */
    public ReportExecutionService(final String restBaseUri, final Credentials login) {
        super(restBaseUri, login);
    }

    /*
     * @see com.threaddynamics.jasperclient.client.Service#getResourceClass()
     */
    @Override
    protected Class<ReportExecutionResource> getResourceClass() {
        return ReportExecutionResource.class;
    }

    /**
     * Fetch running report output.
     * 
     * @param reportExecutionRequest the report execution request
     * @return the report execution
     * @throws CustomException the custom exception
     */
    public ReportExecution fetchRunningReportOutput(final ReportExecutionRequest reportExecutionRequest) throws CustomException {
        final ClientResponse<ReportExecution> reportExecutionOutput = resourceProxy.executeReportAsynchronously(authorizationInfo, reportExecutionRequest);
        return parseEntityFromResponse(reportExecutionOutput, CustomException.class);
    }

    /**
     * Search all running reports.
     * 
     * @param reportUri the report uri
     * @param jodId the jod id
     * @param jobLabel the job label
     * @param userName the user name
     * @param from the from
     * @param to the to
     * @return the report executions
     * @throws CustomException the custom exception
     */
    public ReportExecutions searchAllRunningReports(final String reportUri, final String jodId, final String jobLabel, final String userName, final SimpleDateFormat from, final SimpleDateFormat to)
        throws CustomException {
        final ClientResponse<ReportExecutions> searchReportResponse = resourceProxy.searchAllRunningReports(reportUri, jodId, jobLabel, userName, from, to);
        return parseEntityFromResponse(searchReportResponse, CustomException.class);
    }

    /**
     * Poll running report status.
     * 
     * @param executionRequestId the execution request id
     * @return the report execution status
     * @throws CustomException the custom exception
     */
    public ReportExecutionStatus pollRunningReportStatus(final String executionRequestId) throws CustomException {
        final ClientResponse<ReportExecutionStatus> reportExecutionStatus = resourceProxy.pollRunningReportStatus(authorizationInfo, executionRequestId);
        return parseEntityFromResponse(reportExecutionStatus, CustomException.class);
    }

    /**
     * Request report execution details.
     * 
     * @param requestId the request id
     * @return the report execution
     * @throws CustomException the custom exception
     */
    public ReportExecution requestReportExecutionDetails(final String requestId) throws CustomException {
        final ClientResponse<ReportExecution> reportExecutionDetails = resourceProxy.requestReportExecutionDetails(authorizationInfo, requestId);
        return parseEntityFromResponse(reportExecutionDetails, CustomException.class);
    }

    /**
     * Download report execution output.
     * 
     * @param requestId the request id
     * @param exportType the export type
     * @return the file
     * @throws CustomException the custom exception
     */
    public File downloadReportExecutionOutput(final String requestId, final String exportType) throws CustomException {
        final ClientResponse<JasperReport> fileDownloadResponse = resourceProxy.downloadReportExecutionOutput(authorizationInfo, requestId, exportType);
        return parseEntityFromResponse(fileDownloadResponse, CustomException.class).getReportFile();
    }

    /**
     * Poll report execution output export status.
     * 
     * @param authorizationInformation the authorization information
     * @param requestId the request id
     * @param exportType the export type
     * @return the report execution status
     * @throws CustomException the custom exception
     */
    public ReportExecutionStatus pollReportExecutionOutputExportStatus(final String authorizationInformation, final String requestId, final String exportType) throws CustomException {
        final ClientResponse<ReportExecutionStatus> reportExecutionOutputStatusResponse = resourceProxy.pollReportExecutionOutputExportStatus(authorizationInfo, requestId, exportType);
        return parseEntityFromResponse(reportExecutionOutputStatusResponse, CustomException.class);
    }

    /**
     * Download attachments.
     * 
     * @param authorizationInformation the authorization information
     * @param requestId the request id
     * @param exportType the export type
     * @param attachmentFileName the attachment file name
     * @return the file
     * @throws CustomException the custom exception
     */
    public File downloadAttachments(final String authorizationInformation, final String requestId, final String exportType, final String attachmentFileName) throws CustomException {
        final ClientResponse<File> attachmentResponse = resourceProxy.downloadAttachments(authorizationInfo, requestId, exportType, attachmentFileName);
        return parseEntityFromResponse(attachmentResponse, CustomException.class);
    }

    /**
     * Download report execution output asynchronously.
     * 
     * @param requestId the request id
     * @param export the export
     * @return the export execution
     * @throws CustomException the custom exception
     */
    public ExportExecution downloadReportExecutionOutputAsynchronously(final String requestId, final Export export) throws CustomException {
        final ClientResponse<ExportExecution> reportExecutionOutput = resourceProxy.downloadReportExecutionOutputAsynchronously(authorizationInfo, requestId, export);
        return parseEntityFromResponse(reportExecutionOutput, CustomException.class);
    }

    /**
     * Stop running report.
     * 
     * @param authorizationInformation the authorization information
     * @param requestId the request id
     * @param reportExecutionStatus the report execution status
     * @return the report execution status
     * @throws CustomException the custom exception
     */
    public ReportExecutionStatus stopRunningReport(final String authorizationInformation, final String requestId,
        final ReportExecutionStatus reportExecutionStatus) throws CustomException {
        final ClientResponse<ReportExecutionStatus> stopReportExecutionResponse = resourceProxy.stopRunningReport(authorizationInfo, requestId, reportExecutionStatus);
        return parseEntityFromResponse(stopReportExecutionResponse, CustomException.class);
    }

}
