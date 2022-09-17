package io.github.gldiazcardenas.yahoodsp.client.resource;

import io.github.gldiazcardenas.yahoodsp.client.service.AuthenticationService;

/**
 * @author Gabriel Diaz, Sep 16th 2022.
 */
public interface SecuredResource {

    String AUTH_METHOD_HEADER_WITH_VALUE = AuthenticationService.HEADER_AUTH_METHOD + ":" + AuthenticationService.DEFAULT_AUTH_METHOD;
    String AUTH_TOKEN_HEADER_NAME = AuthenticationService.HEADER_AUTH_TOKEN;

}
