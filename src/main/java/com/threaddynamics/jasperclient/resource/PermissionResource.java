
package com.threaddynamics.jasperclient.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientResponse;

import com.threaddynamics.jasperclient.client.Resource;
import com.threaddynamics.jasperclient.dto.Permission;
import com.threaddynamics.jasperclient.dto.Permissions;
import com.threaddynamics.jasperclient.utility.UtilityConstants;

/**
 * PermissionResource.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@Path(UtilityConstants.PERMISSION_SERVICE_PATH)
public interface PermissionResource extends Resource {

    /**
     * Gets the all permissions.
     * 
     * @param authorizationInformation the authorization information
     * @param resourcePath the resource path
     * @param resolveAll the resolve all
     * @param recipientType the recipient type
     * @param effectivePermissions the effective permissions
     * @param recipientId the recipient id
     * @return the all permissions
     */
    @GET
    @Path("{resourcePath}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<Permissions> getAllPermissions(@HeaderParam("Authorization") String authorizationInformation,
        @PathParam("resourcePath") String resourcePath, @QueryParam("resolveAll") boolean resolveAll,
        @QueryParam("recipientType") String recipientType, @QueryParam("effectivePermissions") boolean effectivePermissions, @QueryParam("recipientId") String recipientId);

    /**
     * Gets the single permission.
     * 
     * @param authorizationInformation the authorization information
     * @param resourcePath the resource path
     * @param receipient the receipient
     * @return the single permission
     */
    @GET
    @Path("{resourcePath}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<Permission> getSinglePermission(@HeaderParam("Authorization") String authorizationInformation,
        @PathParam("resourcePath") String resourcePath, @MatrixParam("recipient") String receipient);

    /**
     * Assign multiple permissions.
     * 
     * @param authorizationInfo the authorization info
     * @param permissions the permissions
     * @return the client response
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<Permissions> assignMultiplePermissions(@HeaderParam("Authorization") String authorizationInfo,
        final Permissions permissions);

    /**
     * Assign single permission.
     * 
     * @param authorizationInfo the authorization info
     * @param permission the permission
     * @return the client response
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<Permission> assignSinglePermission(@HeaderParam("Authorization") String authorizationInfo,
        final Permission permission);

    /**
     * Modify assigned permissions.
     * 
     * @param authorizationInformation the authorization information
     * @param resourcePath the resource path
     * @param permissions the permissions
     * @return the client response
     */
    @PUT
    @Path("{resourcePath}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<Permissions> modifyAssignedPermissions(@HeaderParam("Authorization") String authorizationInformation,
        @PathParam("resourcePath") String resourcePath, Permissions permissions);

    /**
     * Modify assigned permission.
     * 
     * @param authorizationInformation the authorization information
     * @param resourcePath the resource path
     * @param receipient the receipient
     * @param permission the permission
     * @return the client response
     */
    @PUT
    @Path("{resourcePath}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<Permission> modifyAssignedPermission(@HeaderParam("Authorization") String authorizationInformation,
        @PathParam("resourcePath") String resourcePath, @MatrixParam("receipient") String receipient, Permission permission);

    /**
     * Delete all assigned permissions.
     * 
     * @param authorizationInformation the authorization information
     * @param resourcePath the resource path
     * @return the client response
     */
    @DELETE
    @Path("{resourcePath}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<Permission> deleteAllAssignedPermissions(@HeaderParam("Authorization") String authorizationInformation,
        @PathParam("resourcePath") String resourcePath);

    /**
     * Delete assigned permissions.
     * 
     * @param authorizationInformation the authorization information
     * @param resourcePath the resource path
     * @param receipient the receipient
     * @return the client response
     */
    @DELETE
    @Path("{resourcePath}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<Permission> deleteAssignedPermissions(@HeaderParam("Authorization") String authorizationInformation,
        @PathParam("resourcePath") String resourcePath, @MatrixParam("receipient") String receipient);

}
