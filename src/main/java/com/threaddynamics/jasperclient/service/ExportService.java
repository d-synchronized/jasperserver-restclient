
package com.threaddynamics.jasperclient.service;

import java.io.File;

import org.jboss.resteasy.client.ClientResponse;

import com.threaddynamics.exception.CustomException;
import com.threaddynamics.jasperclient.dto.Credentials;
import com.threaddynamics.jasperclient.dto.ExportServiceInput;
import com.threaddynamics.jasperclient.resource.ExportResource;
import com.threaddynamics.jasperclient.response.ImportExportResponse;

/**
 * ExportService.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class ExportService extends AbstractService<ExportResource> {

    /**
     * Instantiates a new export service.
     * 
     * @param restBaseUri the rest base uri
     * @param login the login
     */
    public ExportService(String restBaseUri, Credentials login) {
        super(restBaseUri, login);
    }

    /*
     * @see com.threaddynamics.jasperclient.client.Service#getResourceClass()
     */
    @Override
    protected Class<ExportResource> getResourceClass() {
        return ExportResource.class;
    }

    /**
     * Gets the object export identifier.
     * 
     * @param exportServiceInput the export service input
     * @return the object export identifier
     * @throws CustomException the custom exception
     */
    public ImportExportResponse getObjectExportIdentifier(final ExportServiceInput exportServiceInput) throws CustomException {
        final ClientResponse<ImportExportResponse> exportServiceResponse = resourceProxy.getExportIdForResource(authorizationInfo, exportServiceInput);
        return parseEntityFromResponse(exportServiceResponse, CustomException.class);
    }

    /**
     * Gets the export service status.
     * 
     * @param exportStatusIndetifier the export status indetifier
     * @return the export service status
     * @throws CustomException the custom exception
     */
    public ImportExportResponse getExportServiceStatus(final String exportStatusIndetifier) throws CustomException {
        final ClientResponse<ImportExportResponse> exportServiceRespose = resourceProxy.getExportStatus(authorizationInfo, exportStatusIndetifier);
        return parseEntityFromResponse(exportServiceRespose, CustomException.class);
    }

    /**
     * Fetch export service output.
     * 
     * @param exportStatusIndetifier the export status indetifier
     * @param fileName the file name
     * @return the file
     * @throws CustomException the custom exception
     */
    public File fetchExportServiceOutput(final String exportStatusIndetifier, final String fileName) throws CustomException {
        final ClientResponse<File> exportServiceRespose = resourceProxy.fetchExportedOutput(authorizationInfo, exportStatusIndetifier, fileName);
        return parseEntityFromResponse(exportServiceRespose, CustomException.class);
    }

}
