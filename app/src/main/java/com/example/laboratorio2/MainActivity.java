package com.example.laboratorio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1= (Button) findViewById(R.id.ej1);
        Button btn2= (Button) findViewById(R.id.ej2);
        Button btn3= (Button) findViewById(R.id.ej3);
        Button btn4= (Button) findViewById(R.id.ej4);
        Button btnFS= (Button) findViewById(R.id.sin);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ej1 = new Intent(MainActivity.this, Ejercicio1.class);
                startActivity(ej1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ej2 = new Intent(MainActivity.this, Ejercicio2.class);
                startActivity(ej2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ej3 = new Intent(MainActivity.this, Ejercicio3.class);
                startActivity(ej3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ej4 = new Intent(MainActivity.this, Ejercicio4.class);
                startActivity(ej4);
            }
        });


        btnFS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ej4 = new Intent(MainActivity.this, FormularioSintomas.class);
                startActivity(ej4);
            }
        });

    }
}