package com.example.eva2_4_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView txtVwDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtVwDatos = findViewById(R.id.txtVwDatos);
        Intent intent = getIntent();
        txtVwDatos.append(intent.getStringExtra("MENSAJE"));
        txtVwDatos.append("" + intent.getIntExtra("ENTERO", 0));
        txtVwDatos.append("" + intent.getFloatExtra("PRECIO", 0.0f));
    }


}