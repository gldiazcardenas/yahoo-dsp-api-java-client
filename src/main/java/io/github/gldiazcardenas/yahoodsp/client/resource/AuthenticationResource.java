package io.github.gldiazcardenas.yahoodsp.client.resource;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AuthenticationResource {

    @POST("access_token")
    @FormUrlEncoded
    Authentication authenticate(@Field("grant_type") String grantType,
                                @Field("client_assertion_type") String clientAssertionType,
                                @Field("client_assertion") String clientAssertion,
                                @Field("scope") String scope,
                                @Field("realm") String realm) throws DspApiException;

}
