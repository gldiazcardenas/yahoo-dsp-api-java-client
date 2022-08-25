package io.github.gldiazcardenas.yahoodsp.examples;

import io.github.gldiazcardenas.yahoodsp.Payloads;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.AuthenticationCredentials;

/**
 * @author Gabriel Diaz, Aug 25th 2022.
 */
public class AuthenticationExample implements Example {

    public static void main(String[] arg) {
        AuthenticationCredentials credentials = Payloads.authenticationCredentials()
                .setClientId(CLIENT_ID)
                .setClientSecret(CLIENT_SECRET);

        Authentication token = API.getAuthenticationService().authenticate(credentials);
        System.out.println(token);
    }

}
