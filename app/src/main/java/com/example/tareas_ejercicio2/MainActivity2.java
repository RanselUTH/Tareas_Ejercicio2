package com.example.tareas_ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText resultado, res2, res3, res4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultado = (EditText) findViewById(R.id.txtresultado);
        res2 = (EditText) findViewById(R.id.txtresultaoA);
        res3 = (EditText) findViewById(R.id.txtresultadoE);
        res4 = (EditText) findViewById(R.id.txtresultadoC);
        resultado.setText(getIntent().getExtras().getString("nombre"));
        res2.setText(getIntent().getExtras().getString("apellido"));
        res3.setText(getIntent().getExtras().getString("edad"));
        res4.setText(getIntent().getExtras().getString("correo"));
    }
}