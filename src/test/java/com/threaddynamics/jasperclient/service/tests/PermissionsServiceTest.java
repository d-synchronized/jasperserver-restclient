package com.threaddynamics.jasperclient.service.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.threaddynamics.exception.CustomException;
import com.threaddynamics.jasperclient.dto.Credentials;
import com.threaddynamics.jasperclient.dto.Permissions;
import com.threaddynamics.jasperclient.service.PermissionService;
import com.threaddynamics.jasperclient.utility.UtilityConstants;


public class PermissionsServiceTest {

    private PermissionService permissionsService;

    @Before
    public void setUpBeforeClass() throws Exception {
        final Credentials login = new Credentials("jasperadmin", "jasperadmin");
        permissionsService = new PermissionService(UtilityConstants.JASPER_SERVER_HOST_URI, login);
    }

    @Test
    public void testGetAllPermissions() {
        try {
            final Permissions permissions = permissionsService.getAllPermissions("reports", true, null, false, "user:/ajay");
            Assert.assertNotNull("The user object is not null", permissions);
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

}
