package com.sebastian.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrincipalActividad extends Activity{

    TextView texto;
    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_actividad);

        texto = (TextView)findViewById(R.id.lblTextoSuperior);
        nombre = (EditText)findViewById(R.id.txtNombre);
        Button boton = (Button)findViewById(R.id.btnAceptar);
        texto.setText("Hola a todos");
    }

    public void tomarNombre(View v){
        String nom = nombre.getText().toString();
        texto.setText(nom);
    }
}
