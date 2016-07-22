package agetic.gob.bo.loginretrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by ramiro on 22-07-16.
 */
public interface LoginInterface {
    @POST("tokens")
    Call<ResponseToken> getTokenAccess(@Body RequestToken tokenRequest);
}
