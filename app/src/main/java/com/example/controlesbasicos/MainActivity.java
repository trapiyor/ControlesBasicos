package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    //Declarar controles
    Button btnListas;
    ToggleButton tbApagado;
    Switch swApagado;
    Spinner spBasico;
    RadioButton rbMasculino, rbFemenino;
    FloatingActionButton fabBasico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // escucha de controles
        tbApagado = findViewById(R.id.tbApagado);
        swApagado = findViewById(R.id.swApagado);
        spBasico = findViewById(R.id.spBasico);
        // cargar datos al spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.paises, android.R.layout.simple_spinner_dropdown_item);
        spBasico.setAdapter(adapter);
        rbMasculino = findViewById(R.id.rbMasculiino);
        rbFemenino = findViewById(R.id.rbFemenino);
        fabBasico = findViewById(R.id.fabBasico);
        btnListas = findViewById(R.id.btnListas);


        tbApagado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tbApagado.isChecked())
                    Toast.makeText(MainActivity.this, "Presiono Prendido", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Presiono Apagado", Toast.LENGTH_SHORT).show();
            }
        });

        swApagado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(swApagado.isChecked())
                    Toast.makeText(MainActivity.this, "swicht presiono prendido", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Apagado", Toast.LENGTH_SHORT).show();
            }
        });

        rbMasculino.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Seleccion Masculino", Toast.LENGTH_SHORT).show();
            }
        });

        rbFemenino.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Seleccion Femenino", Toast.LENGTH_SHORT).show();

            }
        });

        // evento que maneja los items dentro de una lista
        spBasico.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(MainActivity.this, "Posicion"+String.valueOf(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, "No se selecciono nada", Toast.LENGTH_SHORT).show();
            }
        });

        //boton de intento hacia listas
        btnListas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(MainActivity.this, Listas2Activity.class);
                startActivity(siguiente);
            }
        });

    }


}