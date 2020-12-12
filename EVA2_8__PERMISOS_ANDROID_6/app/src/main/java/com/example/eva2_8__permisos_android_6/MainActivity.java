package com.example.eva2_8__permisos_android_6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtTel;
    Button btnCall;
    Intent intent;
    boolean bandera = false;
    final int PERMISO_LLAMAR = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTel = findViewById(R.id.txtTel);
        btnCall = findViewById(R.id.btnCall);
        // verificar los permisos
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            //No tenemos el permiso, hay que solicitarlo
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CALL_PHONE}, PERMISO_LLAMAR);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bandera){
                    String sTel = "Tel: " + txtTel.getText().toString();
                    intent = new Intent(Intent.ACTION_CALL, Uri.parse(sTel));
                    startActivity(intent);
                }
                else
                    Toast.makeText(getApplicationContext(), "No tienes permisos para realizar la llamada", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == PERMISO_LLAMAR){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                bandera = true;
            }
        }
    }
}