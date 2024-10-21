package com.example.faure_mvp.login_users;

import com.example.faure_mvp.beans.User;

public interface Login_Contract {
    interface view{
        void successLogin(User user);
        void failureLogin(String messageError);
    }

    interface presenter{
        void loginAction(User user);
    }

    interface model{
        interface OnLoginUserListener{
            void onFinished(User user);
            void onFailure(String messageError);
        }

        void loginUserAPI(User user, OnLoginUserListener onLoginUserListener);
    }
}
