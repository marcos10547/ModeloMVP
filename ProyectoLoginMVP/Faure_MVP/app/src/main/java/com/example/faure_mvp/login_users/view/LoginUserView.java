package com.example.faure_mvp.login_users.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.faure_mvp.R;
import com.example.faure_mvp.beans.User;
import com.example.faure_mvp.login_users.Login_Contract;
import com.example.faure_mvp.login_users.presenter.LoginUserPresenter;

public class LoginUserView extends AppCompatActivity implements Login_Contract.view {
    EditText username;
    EditText password;
    Button Login;
    private LoginUserPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        presenter = new LoginUserPresenter(this);
//        Toast.makeText(this, "Llego", Toast.LENGTH_LONG).show();
        initComponents();

    }

    void initComponents(){
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        Login = findViewById(R.id.loginBtn);
        Login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                User user = new User(1, username.getText().toString(), password.getText().toString());
                presenter.loginAction(user);
                System.out.println(user.getUsername());
                System.out.println(user.getPassword());
            }
        });
    }

    @Override
    public void successLogin(User user) {

    }

    @Override
    public void failureLogin(String messageError) {

    }
}
