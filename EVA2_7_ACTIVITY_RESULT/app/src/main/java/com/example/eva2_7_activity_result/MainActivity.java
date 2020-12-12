package com.example.eva2_7_activity_result;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final int INFO_ACTIVITY = 100;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        intent = new Intent(this, InfoActivity.class);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(intent, INFO_ACTIVITY);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){ // IDENTIFICA LA ACTIVIDAD
            case INFO_ACTIVITY:
                    if(resultCode == Activity.RESULT_OK){ // SI REGRESARON RESULTADOS O NO
                        // AQUÍ HACEMOS ALGO CON LOS DATOS QUE NOS REGRESARON
                        Toast.makeText(this, data.getStringExtra("DATOS"), Toast.LENGTH_SHORT);
                    }
                break;
            default:
        }
    }
}