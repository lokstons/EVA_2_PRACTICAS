package com.example.eva2_2_action_sendto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtTel, txtMensaje;
    Button btnEnviar;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        txtTel = findViewById(R.id.txtTel);
        txtMensaje = findViewById(R.id.txtMensaje);
        btnEnviar = findViewById(R.id.btnEnviar);
    }

    @Override
    protected void onResume() {
        super.onResume();

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sTel = "smsto:" + txtTel.getText().toString();
                String sMensaje = txtMensaje.getText().toString();
                intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));
                intent.putExtra("sms_body", sMensaje);
                startActivity(intent);
            }
        });
    }
}