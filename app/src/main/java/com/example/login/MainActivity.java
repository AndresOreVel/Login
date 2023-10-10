package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Busca el botón por su ID
        Button buttonLogin = findViewById(R.id.buttonLogin);

        // Configura un OnClickListener para el botón
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para iniciar la actividad Login2
                Intent intent = new Intent(MainActivity.this, Login2.class);
                startActivity(intent);
            }
        });
    }
}