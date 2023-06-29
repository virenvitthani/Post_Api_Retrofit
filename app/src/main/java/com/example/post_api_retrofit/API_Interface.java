package com.example.post_api_retrofit;

import android.service.autofill.UserData;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface API_Interface {

    @FormUrlEncoded
    @POST("Register.php")
    Call<UserData> registerUser(@Field("Name") String name, @Field("Email") String email, @Field("Password") String password);
}
