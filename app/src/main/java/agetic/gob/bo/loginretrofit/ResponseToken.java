package agetic.gob.bo.loginretrofit;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseToken {

    @SerializedName("token")
    @Expose
    private String token;

    /**
     *
     * @return
     * The token
     */
    public String getToken() {
        return token;
    }

    /**
     *
     * @param token
     * The token
     */
    public void setToken(String token) {
        this.token = token;
    }

}