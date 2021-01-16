package com.example.laboratorio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class FormularioSintomas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_sintomas);
        Button btn = (Button) findViewById(R.id.EnviarSintomas);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pregunta1= (String) ((TextView) findViewById(R.id.pregunta1)).getText();
                String pregunta2= (String) ((TextView) findViewById(R.id.pregunta2)).getText();
                String pregunta3= (String) ((TextView) findViewById(R.id.pregunta3)).getText();
                String pregunta4= (String) ((TextView) findViewById(R.id.pregunta4)).getText();
                String pregunta5= (String) ((TextView) findViewById(R.id.pregunta5)).getText();
                String pregunta6= (String) ((TextView) findViewById(R.id.pregunta6)).getText();
                int rta1 =  ((RadioGroup) findViewById( R.id.radioGroup)).getCheckedRadioButtonId();
                int rta2 =  ((RadioGroup) findViewById( R.id.radioGroup2)).getCheckedRadioButtonId();
                int rta3 =  ((RadioGroup) findViewById( R.id.radioGroup3)).getCheckedRadioButtonId();
                int rta4 =  ((RadioGroup) findViewById( R.id.radioGroup4)).getCheckedRadioButtonId();
                int rta5 =  ((RadioGroup) findViewById( R.id.radioGroup5)).getCheckedRadioButtonId();
                int rta6 =  ((RadioGroup) findViewById( R.id.radioGroup6)).getCheckedRadioButtonId();
                String respuesta1= (String) ((RadioButton)findViewById(rta1)).getText();
                String respuesta2= (String) ((RadioButton)findViewById(rta2)).getText();
                String respuesta3= (String) ((RadioButton)findViewById(rta3)).getText();
                String respuesta4= (String) ((RadioButton)findViewById(rta4)).getText();
                String respuesta5= (String) ((RadioButton)findViewById(rta5)).getText();
                String respuesta6= (String) ((RadioButton)findViewById(rta6)).getText();

                String mensaje= pregunta1+"\n"+respuesta1+"\n"+
                                pregunta2+"\n"+respuesta2+"\n"+
                                pregunta3+"\n"+respuesta3+"\n"+
                                pregunta4+"\n"+respuesta4+"\n"+
                                pregunta5+"\n"+respuesta5+"\n"+
                                pregunta6+"\n"+respuesta6;

                String escogerTexto = "Enviar via...";
                Intent enviar = new Intent(Intent.ACTION_SEND);
                enviar.setType("text/plain");
                enviar.putExtra(Intent.EXTRA_TEXT, mensaje);
                Intent escoger = Intent.createChooser(enviar, escogerTexto);
                startActivity(escoger);
            }
        });
    }
}