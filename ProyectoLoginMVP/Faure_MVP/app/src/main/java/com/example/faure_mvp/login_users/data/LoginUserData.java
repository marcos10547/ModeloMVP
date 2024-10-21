package com.example.faure_mvp.login_users.data;

import com.example.faure_mvp.beans.User;

public class LoginUserData {
    private String message;
    private User user;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
