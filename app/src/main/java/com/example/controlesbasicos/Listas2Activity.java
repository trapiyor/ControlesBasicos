package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Listas2Activity extends AppCompatActivity {

    // DEclaracion global de controles
    ListView lsvDatos;
    Button btnPaises, btnPlanetas, btnColores, btnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listas2);

        btnPaises = findViewById(R.id.btnPaises);
        btnPlanetas = findViewById(R.id.btnPlanetas);
        btnColores = findViewById(R.id.btnColores);
        btnMain = findViewById(R.id.btnMain);
        lsvDatos = (ListView) findViewById(R.id.lsvDatos);

        btnPaises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paises();
            }
        });

        btnPlanetas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Planetas();
            }
        });

        btnColores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Colores();
            }
        });

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(Listas2Activity.this, MainActivity.class);
                startActivity(siguiente);
            }
        });
    }

    private void Colores() {
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(Listas2Activity.this,R.array.colores, android.R.layout.simple_list_item_1);
        lsvDatos.setAdapter(adapter);
    }

    private void Planetas() {
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(Listas2Activity.this,R.array.planetas, android.R.layout.simple_list_item_1);
        lsvDatos.setAdapter(adapter);
    }


    private void Paises() {
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(Listas2Activity.this,R.array.paises, android.R.layout.simple_list_item_1);
        lsvDatos.setAdapter(adapter);
    }
}