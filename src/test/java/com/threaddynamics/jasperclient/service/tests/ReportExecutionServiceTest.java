package com.threaddynamics.jasperclient.service.tests;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;

import com.threaddynamics.exception.CustomException;
import com.threaddynamics.jasperclient.dto.Credentials;
import com.threaddynamics.jasperclient.dto.ReportExecution;
import com.threaddynamics.jasperclient.dto.ReportExecutionRequest;
import com.threaddynamics.jasperclient.dto.ReportExecutionStatus;
import com.threaddynamics.jasperclient.dto.ReportExecutions;
import com.threaddynamics.jasperclient.dto.ReportParameter;
import com.threaddynamics.jasperclient.dto.ReportParameters;
import com.threaddynamics.jasperclient.service.ReportExecutionService;
import com.threaddynamics.jasperclient.utility.UtilityConstants;

public class ReportExecutionServiceTest {

    private static ReportExecutionService reportExecutionService;

    private static ReportExecution reportExecution;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        final Credentials login = new Credentials("jasperadmin", "jasperadmin");
        reportExecutionService = new ReportExecutionService(UtilityConstants.JASPER_SERVER_HOST_URI, login);
    }

    // @Test
    public void testFetchRunningReportOutput() {

        final ReportExecutionRequest reportExecutionRequest = new ReportExecutionRequest();
        reportExecutionRequest.setAsychronous(true);
        reportExecutionRequest.setFreshData(false);
        reportExecutionRequest.setIgnorePagination(false);
        reportExecutionRequest.setInteractive(true);
        reportExecutionRequest.setOutputFormat("html");
        reportExecutionRequest.setPages("0-1");
        reportExecutionRequest.setReportUnitUri("/reports/samples/Freight");
        reportExecutionRequest.setSaveDataSnapshot(false);

        final ReportParameter reportParameter = new ReportParameter();
        reportParameter.setName("RequestDate");

        final List<String> values = new ArrayList<>();
        values.add("1998-06-01");
        values.add("1999-08-01");
        reportParameter.setValue(values);

        final List<ReportParameter> reportParameters = new ArrayList<ReportParameter>();
        reportParameters.add(reportParameter);

        final ReportParameters reportParameters2 = new ReportParameters();
        reportParameters2.setReportParameters(reportParameters);
        reportExecutionRequest.setReportParameters(reportParameters2);
        try {
            reportExecution = reportExecutionService.fetchRunningReportOutput(reportExecutionRequest);
        } catch (final CustomException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(reportExecution);
    }

    // @Test
    public void testfindAllRunningReports() {

        ReportExecutions reportExecutions = null;
        try {
            reportExecutions = reportExecutionService.searchAllRunningReports("reports/interactive/TableReport", null, null, null, null, null);
        } catch (final CustomException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(reportExecutions);
    }

    // @Test
    public void testPollRunningReport() {
        ReportExecutionStatus reportExecutionStatus = null;
        try {
            reportExecutionStatus = reportExecutionService.pollRunningReportStatus(reportExecution.getRequestId());
        } catch (final CustomException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(reportExecutionStatus);
    }

    // @Test
    public void testGetReportExecutionDetails() {

        try {
            reportExecution = reportExecutionService.requestReportExecutionDetails(reportExecution.getRequestId());
            @SuppressWarnings("unused")
            final File file = reportExecutionService.downloadReportExecutionOutput(reportExecution.getRequestId(), "xls");
        } catch (final CustomException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(reportExecution);
    }

    // @Test
    public void testDownloadReportExecutionOutput() {
        File file = null;
        try {
            file = reportExecutionService.downloadReportExecutionOutput(reportExecution.getRequestId(), "xls");
        } catch (final CustomException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(file);
    }

}
