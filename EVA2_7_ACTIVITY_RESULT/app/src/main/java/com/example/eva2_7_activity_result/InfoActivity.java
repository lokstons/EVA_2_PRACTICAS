package com.example.eva2_7_activity_result;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InfoActivity extends AppCompatActivity {

    EditText txtInfo;
    Button btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        txtInfo = findViewById(R.id.txtInfo);
        btnInfo = findViewById(R.id.btnInfo);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // DEVOLVER LOS DATOS
                Intent intent = new Intent();
                String datos = txtInfo.getText().toString();
                intent.putExtra("DATOS", datos);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}