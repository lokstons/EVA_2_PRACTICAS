package com.example.eva2_1_intentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // URI --> UNIFORM RESOURCE IDENTIFICATOR
        // protocolo: identificador
        // URL --> UNIFORM RESOURCE LOCATOR
        // https://www.google.com
        String stel = "tel:45411651";

        intent = new Intent(Intent.ACTION_DIAL, Uri.parse(stel)); // intento implícito
    }
}