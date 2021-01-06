package com.rober.mapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView myRViewLstNumeros;

    private static final int LISTA_NUMEROS = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //aca estoy llamando al layout de mi RecyclerView
        myRViewLstNumeros = findViewById(R.id.rvNumeros);
        //en esta linea vamos a agregar un divider
        myRViewLstNumeros.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        //LinearLayoutManager para ver los items en forma de lista
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        myRViewLstNumeros.setLayoutManager(linearLayoutManager);
        //a continuacion creamos el adaptador que es el medio por el cual voy a mandar los elementos al recycler
        //Es el encargado de poner los elementos a cada vista y de pasar las vistas al recycler
        RecyclerAdapter mAdapter = new RecyclerAdapter(LISTA_NUMEROS);
        myRViewLstNumeros.setAdapter(mAdapter);
    }
}