package com.example.hammer.pizzaentucasa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class FormularioActividad extends AppCompatActivity  implements OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_actividad);

        Button guardar = (Button) findViewById(R.id.irFormularioFinal);
        guardar.setOnClickListener(this);


    }

    public void onClick(View v) {

        String aux;

        Boolean check18;
        Boolean check17;
        Intent formularioFinal = new Intent(this,AceptarDatos.class);
        switch(v.getId()) {


            case R.id.irFormularioFinal:



                aux =((EditText)findViewById(R.id.editTextNombre)).getText().toString();

                formularioFinal.putExtra("nombre",aux);

                aux =((EditText)findViewById(R.id.editTextApellido)).getText().toString();

                formularioFinal.putExtra("apellido",aux);

                aux =((EditText)findViewById(R.id.editTextComida)).getText().toString();

                formularioFinal.putExtra("comida",aux);

                if ( ((RadioButton)findViewById(R.id.radioButton17)).isChecked()){

                    formularioFinal.putExtra("edad","menor de edad");

                }else if(((RadioButton)findViewById(R.id.radioButton18)).isChecked()){

                    formularioFinal.putExtra("edad","mayor de edad");
                }else{

                    formularioFinal.putExtra("edad","sin definir edad");
                }


                aux =((EditText)findViewById(R.id.editTextDireccion)).getText().toString();

                formularioFinal.putExtra("direccion",aux);
                break;

        }

        startActivity(formularioFinal);

    }

}
