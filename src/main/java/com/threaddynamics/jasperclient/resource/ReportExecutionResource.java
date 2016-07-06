
package com.threaddynamics.jasperclient.resource;

import java.io.File;
import java.text.SimpleDateFormat;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientResponse;

import com.threaddynamics.jasperclient.client.Resource;
import com.threaddynamics.jasperclient.dto.Export;
import com.threaddynamics.jasperclient.dto.ExportExecution;
import com.threaddynamics.jasperclient.dto.JasperReport;
import com.threaddynamics.jasperclient.dto.ReportExecution;
import com.threaddynamics.jasperclient.dto.ReportExecutionRequest;
import com.threaddynamics.jasperclient.dto.ReportExecutionStatus;
import com.threaddynamics.jasperclient.dto.ReportExecutions;
import com.threaddynamics.jasperclient.utility.UtilityConstants;

/**
 * ReportExecutionResource.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@Path(UtilityConstants.REPORT_EXECUTION_SERVICE_PATH)
public interface ReportExecutionResource extends Resource {

    /**
     * Execute report asynchronously.
     * 
     * @param authorizationInformation the authorization information
     * @param reportExecutionRequest the report execution request
     * @return the client response
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<ReportExecution>
        executeReportAsynchronously(@HeaderParam("Authorization") String authorizationInformation, ReportExecutionRequest reportExecutionRequest);

    /**
     * Search all running reports.
     * 
     * @param reportUri the report uri
     * @param jodId the jod id
     * @param jobLabel the job label
     * @param userName the user name
     * @param from the from
     * @param to the to
     * @return the client response
     */
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<ReportExecutions> searchAllRunningReports(@QueryParam("reportURI") String reportUri, @QueryParam("jobID") String jodId,
        @QueryParam("jobLabel") String jobLabel, @QueryParam("userName") String userName, @QueryParam("fireTimeFrom") SimpleDateFormat from,
        @QueryParam("fireTimeTo") SimpleDateFormat to);

    /**
     * Poll running report status.
     * 
     * @param authorizationInformation the authorization information
     * @param executionRequestId the execution request id
     * @return the client response
     */
    @GET
    @Path("{requestId}/status")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<ReportExecutionStatus> pollRunningReportStatus(@HeaderParam("Authorization") String authorizationInformation,
        @PathParam("requestId") String executionRequestId);

    /**
     * Request report execution details.
     * 
     * @param authorizationInformation the authorization information
     * @param requestId the request id
     * @return the client response
     */
    @GET
    @Path("{requestId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<ReportExecution> requestReportExecutionDetails(@HeaderParam("Authorization") String authorizationInformation, @PathParam("requestId") String requestId);

    /**
     * Download report execution output.
     * 
     * @param authorizationInformation the authorization information
     * @param requestId the request id
     * @param exportType the export type
     * @return the client response
     */
    @GET
    @Path("{requestId}/exports/{exportId}/outputResource")
    @Consumes(MediaType.APPLICATION_JSON)
    public ClientResponse<JasperReport> downloadReportExecutionOutput(@HeaderParam("Authorization") String authorizationInformation, @PathParam("requestId") String requestId,
        @PathParam("exportId") String exportType);

    /**
     * Poll report execution output export status.
     * 
     * @param authorizationInformation the authorization information
     * @param requestId the request id
     * @param exportType the export type
     * @return the client response
     */
    @GET
    @Path("{requestId}/exports/{exportId}/status")
    @Consumes(MediaType.APPLICATION_JSON)
    public ClientResponse<ReportExecutionStatus> pollReportExecutionOutputExportStatus(@HeaderParam("Authorization") String authorizationInformation,
        @PathParam("requestId") String requestId, @PathParam("exportId") String exportType);

    /**
     * Download attachments.
     * 
     * @param authorizationInformation the authorization information
     * @param requestId the request id
     * @param exportType the export type
     * @param attachmentFileName the attachment file name
     * @return the client response
     */
    @GET
    @Path("{requestId}/exports/{exportId}/attachments/{attachmentFileName}")
    @Consumes(MediaType.APPLICATION_JSON)
    public ClientResponse<File> downloadAttachments(@HeaderParam("Authorization") String authorizationInformation, @PathParam("requestId") String requestId,
        @PathParam("exportId") String exportType, @PathParam("attachmentFileName") String attachmentFileName);

    /**
     * Download report execution output asynchronously.
     * 
     * @param authorizationInformation the authorization information
     * @param requestId the request id
     * @param export the export
     * @return the client response
     */
    @POST
    @Path("{requestId}/exports")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<ExportExecution> downloadReportExecutionOutputAsynchronously(@HeaderParam("Authorization") String authorizationInformation,
        @PathParam("requestId") String requestId, Export export);

    /**
     * Stop running report.
     * 
     * @param authorizationInformation the authorization information
     * @param requestId the request id
     * @param reportExecutionStatus the report execution status
     * @return the client response
     */
    @PUT
    @Path("{requestId}/status")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<ReportExecutionStatus> stopRunningReport(@HeaderParam("Autorization") String authorizationInformation, @PathParam("requestId") String requestId,
        ReportExecutionStatus reportExecutionStatus);

}
