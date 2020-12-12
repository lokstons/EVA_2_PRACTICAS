package com.example.eva2_3_intentos_explicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Intent intent;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        // ACTION : EL OBJETO QUE LANZA LA NUEVA ACTIVIDAD
        // DATA : LA CLASE DE LA NUEVA ACTIVIDAD
        intent = new Intent(this, SecundaryActivity.class);

    }
}