
package com.threaddynamics.jasperclient.resource;

import java.io.File;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientResponse;

import com.threaddynamics.jasperclient.client.Resource;
import com.threaddynamics.jasperclient.response.ImportExportResponse;
import com.threaddynamics.jasperclient.utility.UtilityConstants;

/**
 * ImportResource.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@Path(UtilityConstants.IMPORT_SERVICE_PATH)
public interface ImportResource extends Resource {

    /**
     * Import resource.
     * 
     * @param authorizationInformation the authorization information
     * @param updateExistikngResource the update existikng resource
     * @param skipUserUpdate the skip user update
     * @param includeAccessEvents the include access events
     * @param includeAduitEvents the include aduit events
     * @param includeMoniteringEvents the include monitering events
     * @param includeServerSetting the include server setting
     * @param zippedContentCatalog the zipped content catalog
     * @return the client response
     */
    @POST
    @Consumes("application/zip")
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<ImportExportResponse> importResource(@HeaderParam("Authorization") String authorizationInformation,
        @QueryParam("update?") boolean updateExistikngResource,
        @QueryParam("skip-user-update?") boolean skipUserUpdate, @QueryParam("include-accessevents?") boolean includeAccessEvents,
        @QueryParam("include-audit-events?") boolean includeAduitEvents,
        @QueryParam("include-monitoringevents?") boolean includeMoniteringEvents, @QueryParam("include-serversetting?") boolean includeServerSetting,
        File zippedContentCatalog);

}
