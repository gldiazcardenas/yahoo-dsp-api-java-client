package io.github.gldiazcardenas.yahoodsp;

import io.github.gldiazcardenas.yahoodsp.client.DspApi;
import io.github.gldiazcardenas.yahoodsp.client.model.AuthenticationCredentials;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;

public class DspApiTest {

    private static final String CLIENT_ID = "<<CLIENT_ID>>";
    private static final String CLIENT_SECRET = "<<CLIENT_SECRET>>";

    private static final DspApi API = DspApi.builder().build();

    public static void main(String[] arg) {
        testAuthentication();
    }

    private static void testAuthentication() {
        AuthenticationCredentials credentials = AuthenticationCredentials.builder()
                .setClientId(CLIENT_ID)
                .setClientSecret(CLIENT_SECRET)
                .build();

        Authentication token = API.getAuthenticationService().authenticate(credentials);

        System.out.println(token);
    }

}
