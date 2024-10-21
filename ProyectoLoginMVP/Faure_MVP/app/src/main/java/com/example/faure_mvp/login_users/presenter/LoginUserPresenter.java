package com.example.faure_mvp.login_users.presenter;

import com.example.faure_mvp.beans.User;
import com.example.faure_mvp.login_users.Login_Contract;
import com.example.faure_mvp.login_users.model.LoginUserModel;

public class LoginUserPresenter implements Login_Contract.presenter, Login_Contract.model.OnLoginUserListener {
    private Login_Contract.view view;
    private Login_Contract.model model;

    public LoginUserPresenter(Login_Contract.view view){
        this.view = view;
        model = new LoginUserModel();
    }

    @Override
    public void onFinished(User user) {
        view.successLogin(user);
    }

    @Override
    public void onFailure(String messageError) {
        view.failureLogin(messageError);
    }

    @Override
    public void loginAction(User user) {
        if(user != null){
            model.loginUserAPI(user, this);
        } else {
            view.failureLogin("Campos vacios");
        }
    }
}
