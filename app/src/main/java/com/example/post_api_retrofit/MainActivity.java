package com.example.post_api_retrofit;

import android.os.Bundle;
import android.service.autofill.UserData;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText name,email,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InstanceClass.CallApi().registerUser(name.getText().toString(),email.getText().toString(),password.getText().toString()).enqueue(new Callback<Modelclass>() {
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
        });
    }
}