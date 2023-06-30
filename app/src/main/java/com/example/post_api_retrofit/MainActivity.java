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
        InstanceClass.CallApi().registerUser("vraj","vraj@124@gmail.com","vraj123").enqueue(new Callback<Modelclass>() {
            @Override
            public void onResponse(Call<Modelclass> call, Response<Modelclass> response) {
                Log.d("TTT", "onResponse: "+response.body().getConnection());
            }

            @Override
            public void onFailure(Call<Modelclass> call, Throwable t) {
                Log.d("TTT", "onFailure: "+t.getLocalizedMessage());
            }
        });
    }
}