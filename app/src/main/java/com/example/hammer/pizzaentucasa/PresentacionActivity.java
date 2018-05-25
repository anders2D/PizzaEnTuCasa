package com.example.hammer.pizzaentucasa;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;


public class PresentacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);

        CountDownTimer countDownTimer = new CountDownTimer(5000, 1000) {

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                IrAFormulario();
            }

        }.start();
    }

    public void IrAFormulario(){
        Intent formulario = new Intent(this,FormularioActividad.class);
        startActivity(formulario);
    }
}
