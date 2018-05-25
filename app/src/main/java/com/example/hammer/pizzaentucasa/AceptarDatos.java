package com.example.hammer.pizzaentucasa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AceptarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aceptar_datos);

        Intent datos= getIntent();

        Bundle extras =datos.getExtras();

        if (extras!=null){
            String nombre= extras.getString("nombre");
            String apellido= extras.getString("apellido");
            String comida= extras.getString("comida");
            String edad= extras.getString("edad");
            String direccion= extras.getString("direccion");

            TextView b= (TextView)findViewById(R.id.textViewDatos);

            b.setText("El usuario " + nombre + " " + apellido + " " + edad +" acepta que su comida favorita es : " + comida + " y su direccion de recidencia es : " + direccion + " y acepta que los anteriores datos son reales y se utilizarán para domicilio de los productos adquiridos ");

        }

    }
}
