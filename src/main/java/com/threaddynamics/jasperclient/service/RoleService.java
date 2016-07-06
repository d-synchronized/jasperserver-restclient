
package com.threaddynamics.jasperclient.service;

import org.jboss.resteasy.client.ClientResponse;

import com.threaddynamics.exception.CustomException;
import com.threaddynamics.jasperclient.dto.Credentials;
import com.threaddynamics.jasperclient.dto.Role;
import com.threaddynamics.jasperclient.dto.Roles;
import com.threaddynamics.jasperclient.resource.RoleResource;

/**
 * RoleService.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class RoleService extends AbstractService<RoleResource> {

    /**
     * Instantiates a new role service.
     * 
     * @param restBaseUri the rest base uri
     * @param login the login
     */
    public RoleService(final String restBaseUri, final Credentials login) {
        super(restBaseUri, login);
    }

    /*
     * @see com.threaddynamics.jasperclient.client.Service#getResourceClass()
     */
    @Override
    protected Class<RoleResource> getResourceClass() {
        return RoleResource.class;
    }

    /**
     * Search all roles.
     * 
     * @return the roles
     * @throws CustomException the custom exception
     */
    public Roles searchAllRoles() throws CustomException {
        final ClientResponse<Roles> roles = resourceProxy.searchAllRoles(authorizationInfo);
        return parseEntityFromResponse(roles, CustomException.class);
    }

    /**
     * Search specific roles.
     * 
     * @param searchString the search string
     * @return the roles
     * @throws CustomException the custom exception
     */
    public Roles searchSpecificRoles(final String searchString) throws CustomException {
        final ClientResponse<Roles> roles = resourceProxy.searchSpecificRoles(authorizationInfo, searchString);
        return parseEntityFromResponse(roles, CustomException.class);
    }

    /**
     * Search role.
     * 
     * @param roleId the role id
     * @return the string
     * @throws CustomException the custom exception
     */
    public Role searchRole(final String roleId) throws CustomException {
        final ClientResponse<Role> roleSearchReponse = resourceProxy.searchRole(authorizationInfo, roleId);
        return parseEntityFromResponse(roleSearchReponse, CustomException.class);
    }

    /**
     * Creates the role.
     * 
     * @param authorizationinfo the authorizationinfo
     * @param userId the user id
     * @param role the role
     * @return the role
     * @throws CustomException the custom exception
     */
    public Role createRole(final String userId, final Role role) throws CustomException {
        final ClientResponse<Role> createdRole = resourceProxy.createRole(authorizationInfo, userId, role);
        return parseEntityFromResponse(createdRole, CustomException.class);

    }

    /**
     * Delete role.
     * 
     * @param authorizationinfo the authorizationinfo
     * @param roleId the role id
     * @return the string
     * @throws CustomException the custom exception
     */
    public String deleteRole(String roleId) throws CustomException {
        final ClientResponse<String> deleteRoleResponse = resourceProxy.deleteRole(authorizationInfo, roleId);
        return parseEntityFromResponse(deleteRoleResponse, CustomException.class);
    }

}
