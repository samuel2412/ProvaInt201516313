package com.example.arqdsis.provaint201516313;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends Activity {
    //Samuel Alves de Almeida RA 201516313
    public static final String CHAVE = "chave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Samuel Alves de Almeida RA 201516313
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
        //Samuel Alves de Almeida RA 201516313
            Intent intent = new Intent(this, TabuadaActivity.class);
            EditText a = findViewById(R.id.primeiro);
            String aux =  a.getText().toString();
            int x = Integer.parseInt(aux);
            EditText b = findViewById(R.id.segundo);
            aux =  b.getText().toString();
            int y = Integer.parseInt(aux);
        ArrayList<String> resultado;
        resultado = new ArrayList<>();

        for(int i=0;i<=y;i++){
            resultado.add(""+x+" x "+i +"=" +(x*i));
        }
        intent.putExtra(CHAVE, resultado);
            startActivity(intent);
    }






}
