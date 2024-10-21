package com.example.faure_mvp.beans;

public class User {
    int id_usuario;
    String username;
    String password;

    public User(int id_usuario, String username, String password) {
        this.id_usuario = id_usuario;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
