package com.example.post_api_retrofit;

import android.os.Bundle;
import android.service.autofill.UserData;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InstanceClass.CallApi().registerUser("viren","viren@124@gmail.com","viren123").enqueue(new Callback<UserData>() {
            @Override
            public void onResponse(Call<UserData> call, Response<UserData> response) {
                Log.d("TTT", "onResponse: "+response.body());
            }

            @Override
            public void onFailure(Call<UserData> call, Throwable t) {
                Log.d("TTT", "onFailure: "+t.getLocalizedMessage());
            }
        });
    }
}