
package com.threaddynamics.jasperclient.service;

import org.jboss.resteasy.client.ClientResponse;

import com.threaddynamics.exception.CustomException;
import com.threaddynamics.jasperclient.dto.Credentials;
import com.threaddynamics.jasperclient.dto.Permission;
import com.threaddynamics.jasperclient.dto.Permissions;
import com.threaddynamics.jasperclient.resource.PermissionResource;
import com.threaddynamics.jasperclient.utility.Util;

/**
 * PermissionService.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class PermissionService extends AbstractService<PermissionResource> {

    /**
     * Instantiates a new permission service.
     * 
     * @param restBaseUri the rest base uri
     * @param login the login
     */
    public PermissionService(final String restBaseUri, final Credentials login) {
        super(restBaseUri, login);
    }

    /*
     * @see com.threaddynamics.jasperclient.client.Service#getResourceClass()
     */
    @Override
    protected Class<PermissionResource> getResourceClass() {
        return PermissionResource.class;
    }

    /**
     * Gets the all permissions.
     * 
     * @param resourcePath the resource path
     * @param resolveAll the resolve all
     * @param recipientType the recipient type
     * @param effectivePermissions the effective permissions
     * @param receipientId the receipient id
     * @return the all permissions
     * @throws CustomException the custom exception
     */
    public Permissions getAllPermissions(final String resourcePath, final boolean resolveAll, final String recipientType, final boolean effectivePermissions,
        final String receipientId) throws CustomException {
        final ClientResponse<Permissions> permissions =
            resourceProxy.getAllPermissions(authorizationInfo, resourcePath, resolveAll, recipientType, effectivePermissions, Util.encodeSlash(receipientId));
        return parseEntityFromResponse(permissions, CustomException.class);
    }

    /**
     * Gets the single permission.
     * 
     * @param resourcePath the resource path
     * @param receipient the receipient
     * @return the single permission
     * @throws CustomException the custom exception
     */
    public Permission getSinglePermission(final String resourcePath, final String receipient) throws CustomException {
        ClientResponse<Permission> permissionResponse = resourceProxy.getSinglePermission(authorizationInfo, resourcePath, receipient);
        return parseEntityFromResponse(permissionResponse, CustomException.class);
    }

    /**
     * Assign multiple permissions.
     * 
     * @param authorizationInfo the authorization info
     * @param permissions the permissions
     * @return the permissions
     * @throws CustomException the custom exception
     */
    public Permissions assignMultiplePermissions(final String authorizationInfo, final Permissions permissions) throws CustomException {
        ClientResponse<Permissions> permissionsResponse = resourceProxy.assignMultiplePermissions(authorizationInfo, permissions);
        return parseEntityFromResponse(permissionsResponse, CustomException.class);
    }

    /**
     * Assign single permission.
     * 
     * @param permission the permission
     * @return the permission
     * @throws CustomException the custom exception
     */
    public Permission assignSinglePermission(final Permission permission) throws CustomException {
        ClientResponse<Permission> permissionResponse = resourceProxy.assignSinglePermission(authorizationInfo, permission);
        return parseEntityFromResponse(permissionResponse, CustomException.class);
    }

    /**
     * Modify assigned permissions.
     * 
     * @param resourcePath the resource path
     * @param permissions the permissions
     * @return the permissions
     * @throws CustomException the custom exception
     */
    public Permissions modifyAssignedPermissions(final String resourcePath, final Permissions permissions) throws CustomException {
        ClientResponse<Permissions> permissionResponse = resourceProxy.modifyAssignedPermissions(authorizationInfo, resourcePath, permissions);
        return parseEntityFromResponse(permissionResponse, CustomException.class);
    }

    /**
     * Modify assigned permission.
     * 
     * @param resourcePath the resource path
     * @param receipient the receipient
     * @param permission the permission
     * @return the permission
     * @throws CustomException the custom exception
     */
    public Permission modifyAssignedPermission(final String resourcePath, final String receipient, final Permission permission) throws CustomException {
        ClientResponse<Permission> permissionResponse = resourceProxy.modifyAssignedPermission(authorizationInfo, resourcePath, receipient, permission);
        return parseEntityFromResponse(permissionResponse, CustomException.class);

    }

    /**
     * Delete all assigned permissions.
     * 
     * @param resourcePath the resource path
     * @return the permission
     * @throws CustomException the custom exception
     */
    public Permission deleteAllAssignedPermissions(final String resourcePath) throws CustomException {
        ClientResponse<Permission> permissionResponse = resourceProxy.deleteAllAssignedPermissions(authorizationInfo, resourcePath);
        return parseEntityFromResponse(permissionResponse, CustomException.class);
    }

    /**
     * Delete assigned permissions.
     * 
     * @param resourcePath the resource path
     * @param receipient the receipient
     * @return the permission
     * @throws CustomException the custom exception
     */
    public Permission deleteAssignedPermissions(final String resourcePath, String receipient) throws CustomException {
        ClientResponse<Permission> permissionResponse = resourceProxy.deleteAssignedPermissions(authorizationInfo, resourcePath, receipient);
        return parseEntityFromResponse(permissionResponse, CustomException.class);
    }

}
