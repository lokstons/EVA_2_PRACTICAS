package com.example.eva2_5_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView txtDato;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtDato = findViewById(R.id.txtDato);
        intent = getIntent();
        Bundle bundle = intent.getExtras();
        txtDato.append(bundle.getString("CIUDAD"));
        txtDato.append(bundle.getInt("POSICION") + "");
    }
}