package com.example.faure_mvp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.faure_mvp.login_users.view.LoginUserView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  // Asegúrate de que super.onCreate() está antes de setContentView()
        setContentView(R.layout.activity_main);  // Asegúrate de que este layout existe

        // Iniciar la actividad LoginUserView
        Intent mainIntent = new Intent(MainActivity.this, LoginUserView.class);
        startActivity(mainIntent);
        finish();  // Finalizar MainActivity después de iniciar LoginUserView
    }

}