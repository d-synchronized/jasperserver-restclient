/*


 */
package com.threaddynamics.jasperclient.service.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.threaddynamics.exception.CustomException;
import com.threaddynamics.jasperclient.dto.Credentials;
import com.threaddynamics.jasperclient.dto.Role;
import com.threaddynamics.jasperclient.dto.RoleType;
import com.threaddynamics.jasperclient.dto.User;
import com.threaddynamics.jasperclient.dto.Users;
import com.threaddynamics.jasperclient.service.UserService;
import com.threaddynamics.jasperclient.utility.UtilityConstants;

/**
 * UserServiceTest.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class UserServiceTest {

    private UserService userService;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUpBeforeClass() throws Exception {
        final Credentials login = new Credentials("jasperadmin", "jasperadmin");
        userService = new UserService(UtilityConstants.JASPER_SERVER_HOST_URI, login);
    }

    @Test
    public void testGetAllUsers() {
        try {
            final Users users = userService.getUsers();
            Assert.assertNotNull("The user object is not null", users);
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetSpevificUsers() {
        try {
            final Users users = userService.getSpecificUsers("j");
            Assert.assertNotNull("The user object is not null", users);
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetparticularUser() {
        try {
            final User user = userService.getUser("kamal");
            Assert.assertNotNull("The user object is not null", user);
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCreateUser() {
        try {
            final User user = new User();
            user.setEnabled(true);
            user.setFullName("ajay");
            user.setEmailAddress("ajay.deshwal@gmail.com");
            user.setPassword("ajay");
            user.setUsername("ajay");

            final List<Role> roles = new ArrayList<Role>();

            final Role role = new Role();
            role.setRoleType(RoleType.ADMINISTRATOR.getRoleType());
            roles.add(role);
            user.setRoles(roles);

            final User createdUser = userService.createUser(user);
            Assert.assertNotNull("The user object is not null", createdUser);
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDeleteUser() {
        try {
            userService.deleteUser("ajay");
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

}
