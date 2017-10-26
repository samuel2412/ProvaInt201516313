package com.example.arqdsis.provaint201516313;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
public class TabuadaActivity extends Activity {
    //Samuel Alves de Almeida RA 201516313
    Activity atividade;
    ArrayList<String> resposta;
    public static final String CHAVE = "chave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Samuel Alves de Almeida RA 201516313
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada);

        Intent intent = getIntent();
        resposta = intent.getStringArrayListExtra(MainActivity.CHAVE);
        ListView listaFinal = (ListView) findViewById(R.id.lista);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, resposta);
        listaFinal.setAdapter(adapter);
    }
}

