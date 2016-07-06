
package com.threaddynamics.jasperclient.resource;

import java.io.File;

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
import com.threaddynamics.jasperclient.dto.Folder;
import com.threaddynamics.jasperclient.dto.PatchItem;
import com.threaddynamics.jasperclient.dto.Resources;
import com.threaddynamics.jasperclient.utility.UtilityConstants;

/**
 * RepositoryResource.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@Path(UtilityConstants.REPOSITORY_SERVICE_PATH)
public interface RepositoryResource extends Resource {

    /**
     * Gets the file resource.
     * 
     * @param authorizationInformation the authorization information
     * @param resourcePath the resource path
     * @return the file resource
     */
    @GET
    @Path("{resourcePath}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<Folder> getFileResource(@HeaderParam("Authorization") String authorizationInformation,
        @PathParam("resourcePath") String resourcePath);

    /**
     * Download file resource.
     * 
     * @param authorizationInformation the authorization information
     * @param resourcePath the resource path
     * @return the client response
     */
    @GET
    @Path("{resourcePath}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.MULTIPART_FORM_DATA)
    public ClientResponse<File> downloadFileResource(@HeaderParam("Authorization") String authorizationInformation,
        @PathParam("resourcePath") String resourcePath);

    /**
     * Creates the folder with auto id.
     * 
     * @param authorizationInformation the authorization information
     * @param resourcePath the resource path
     * @param createFolder the create folder
     * @param folder the folder
     * @return the client response
     */
    @POST
    @Path("{resourcePath}")
    @Consumes("application/repository.folder+json")
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<String> createFolderWithAutoId(@HeaderParam("Authorization") String authorizationInformation,
        @PathParam("resourcePath") String resourcePath, @QueryParam("createFolders") boolean createFolder, Folder folder);

    /**
     * Creates the modify folder with identifier provided.
     * 
     * @param authorizationInformation the authorization information
     * @param resourcePath the resource path
     * @param createFolder the create folder
     * @param overwrite the overwrite
     * @param resouceId the resouce id
     * @param folder the folder
     * @return the client response
     */
    @PUT
    @Path("{resourcePath}")
    @Consumes("application/repository.folder+json")
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<String> createModifyFolderWithIdentifierProvided(@HeaderParam("Authorization") String authorizationInformation,
        @PathParam("resourcePath") String resourcePath, @QueryParam("createFolders") boolean createFolder, @QueryParam("overwrite") boolean overwrite,
        @QueryParam("resourceId") String resouceId, Folder folder);

    /**
     * Modify folder.
     * 
     * @param authorizationInformation the authorization information
     * @param resourcePath the resource path
     * @param patchItem the patch item
     * @param patchHeader the patch header
     * @return the client response
     */
    @POST
    @Path("{resourcePath}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<String> modifyFolder(@HeaderParam("Authorization") String authorizationInformation,
        @PathParam("resourcePath") String resourcePath, PatchItem patchItem, @HeaderParam("X-HTTP-Method-Override") String patchHeader);

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<Resources> viewAllRepositoryResources(@HeaderParam("Authorization") String authorizationInformation, @QueryParam("q") String searchString,
        @QueryParam("folderUri") String folderUri, @QueryParam("recursive") boolean recursive, @QueryParam("type") String type, @QueryParam("accessType") String accessType,
        @QueryParam("showHiddenItems") boolean showHiddenItems, @QueryParam("sortBy") String sortBy, @QueryParam("limit") int limit, @QueryParam("offset") int offset,
        @QueryParam("forceTotalCount") boolean forceTotalCount);

}
