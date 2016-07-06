
package com.threaddynamics.jasperclient.service;

import java.io.File;

import org.jboss.resteasy.client.ClientResponse;

import com.threaddynamics.exception.CustomException;
import com.threaddynamics.jasperclient.dto.Credentials;
import com.threaddynamics.jasperclient.resource.ImportResource;
import com.threaddynamics.jasperclient.response.ImportExportResponse;

/**
 * ImportService.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class ImportService extends AbstractService<ImportResource> {

    /**
     * Instantiates a new import service.
     * 
     * @param restBaseUri the rest base uri
     * @param login the login
     */
    public ImportService(final String restBaseUri, final Credentials login) {
        super(restBaseUri, login);
    }

    /*
     * @see com.threaddynamics.jasperclient.client.Service#getResourceClass()
     */
    @Override
    protected Class<ImportResource> getResourceClass() {
        return ImportResource.class;
    }

    /**
     * Import resource into server.
     * 
     * @param updateExistikngResource the update existikng resource
     * @param skipUserUpdate the skip user update
     * @param includeAccessEvents the include access events
     * @param includeAduitEvents the include aduit events
     * @param includeMoniteringEvents the include monitering events
     * @param includeServerSetting the include server setting
     * @param zippedContentCatalog the zipped content catalog
     * @return the import export response
     * @throws CustomException the custom exception
     */
    public ImportExportResponse importResourceIntoServer(final boolean updateExistikngResource, final boolean skipUserUpdate, final boolean includeAccessEvents,
        final boolean includeAduitEvents, final boolean includeMoniteringEvents, final boolean includeServerSetting, final File zippedContentCatalog) throws CustomException {
        final ClientResponse<ImportExportResponse> importServiceResponse =
            resourceProxy.importResource(authorizationInfo, updateExistikngResource, skipUserUpdate, includeAccessEvents, includeAduitEvents, includeMoniteringEvents,
                includeServerSetting, zippedContentCatalog);
        return parseEntityFromResponse(importServiceResponse, CustomException.class);
    }
}
