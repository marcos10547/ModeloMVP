package com.example.faure_mvp.login_users.model;

import android.util.Log;

import com.example.faure_mvp.beans.User;
import com.example.faure_mvp.login_users.Login_Contract;
import com.example.faure_mvp.login_users.data.LoginUserData;
import com.example.faure_mvp.utils.ApiService;
import com.example.faure_mvp.utils.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginUserModel implements Login_Contract.model {
    private static final String base_url = "http://192.168.104.77:3000/";

    @Override
    public void loginUserAPI(User user, OnLoginUserListener onLoginUserListener) {
        ApiService apiService = RetrofitClient.getClient(base_url).create(ApiService.class);
        Log.e("Email+password", user.getUsername()+ "" +user.getPassword());
        User userL = new User();
        userL.setUsername(user.getUsername());
        userL.setPassword(user.getPassword());

        Call<LoginUserData> call = apiService.login(userL);

        call.enqueue(new Callback<LoginUserData>() {
            @Override
            public void onResponse(Call<LoginUserData> call, Response<LoginUserData> response) {

                if (response.isSuccessful()) {
                    LoginUserData myData = response.body();
                    if (myData != null && myData.getUser() != null) {
                        onLoginUserListener.onFinished(userL);
                    } else {
                        onLoginUserListener.onFailure("No se ha encontrado el usuario!!!");
                    }
                }
            }

            @Override
            public void onFailure(Call<LoginUserData> call, Throwable t) {
                handleNetworkError(t, onLoginUserListener);
            }
        });

    }

    private void handleNetworkError(Throwable t, OnLoginUserListener listener) {
        listener.onFailure("" + t);
    }
}
