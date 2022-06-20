package com.example.tareas_ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombres, apellidos, edad, correos;
    Button enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombres = (EditText) findViewById(R.id.txtnombre);
        apellidos = (EditText) findViewById(R.id.txtapellido);
        edad = (EditText) findViewById(R.id.txtedad);
        correos = (EditText) findViewById(R.id.txtcorreo);
        enviar = (Button) findViewById(R.id.butenviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra( "nombre", nombres.getText().toString());
                intent.putExtra( "apellido", apellidos.getText().toString());
                intent.putExtra("edad", edad.getText().toString());
                intent.putExtra("correo", correos.getText().toString());
                startActivity(intent);
            }
        });
    }
}