package agetic.gob.bo.loginretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    EditText mUsername, mPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getting references
        mUsername = (EditText) findViewById(R.id.et_username);
        mPassword = (EditText) findViewById(R.id.et_password);


    }

    public void getToken(View view) {


        // retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.27.205:5000/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        LoginInterface service = retrofit.create(LoginInterface.class);
        //make request
        RequestToken requestToken = new RequestToken();
        requestToken.setUsuario(mUsername.getText().toString());
        requestToken.setContrasena(mPassword.getText().toString());
        //starting the service

        Call<ResponseToken> responseToken = service.getTokenAccess(requestToken);
        responseToken.enqueue(new Callback<ResponseToken>() {
            @Override
            public void onResponse(Call<ResponseToken> call, Response<ResponseToken> response) {
                int statusCode = response.code();
                ResponseToken eltoken = response.body();
                Log.d("CARAJOOOO", "el token " + statusCode + " " + eltoken.getToken().toString());
            }

            @Override
            public void onFailure(Call<ResponseToken> call, Throwable t) {
                Log.d("NOOOOOOOO", "el error " + t.getMessage());
            }
        });

    }
}
