
package com.threaddynamics.jasperclient.utility;

import org.apache.commons.codec.binary.Base64;

import com.threaddynamics.jasperclient.dto.Credentials;

/**
 * Util.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class Util {

    /**
     * Gets the authorization information.
     * 
     * @param loginCredentials the login
     * @return the authorization information
     */
    public static String getAuthorizationInformation(final Credentials loginCredentials) {

        final String jasperServerUsername = loginCredentials.getUsername();
        final String jasperServerPassword = loginCredentials.getPassword();

        final byte[] base64Encoded = Base64.encodeBase64((jasperServerUsername + ":" + jasperServerPassword).getBytes());
        final String authorizationInformation = UtilityConstants.AUTHORIZATION_INFO_PREFIX + new String(base64Encoded);

        return authorizationInformation;

    }

    /**
     * Encode slash.
     * 
     * @param slashedString the slashed string
     * @return the string
     */
    public static String encodeSlash(String slashedString) {
        return slashedString.replaceAll("/", "%2F");
    }

}
