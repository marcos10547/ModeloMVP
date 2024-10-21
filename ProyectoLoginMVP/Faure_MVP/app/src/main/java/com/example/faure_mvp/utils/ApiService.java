package com.example.faure_mvp.utils;

import com.example.faure_mvp.beans.User;
import com.example.faure_mvp.login_users.data.LoginUserData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/loginUsers")
    Call<LoginUserData> login(@Body User user);
}