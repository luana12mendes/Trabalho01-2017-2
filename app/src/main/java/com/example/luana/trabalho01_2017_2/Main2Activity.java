package com.example.luana.trabalho01_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Float nome = (Float) intent.getSerializableExtra("nome");
        TextView texto = (TextView) findViewById(R.id.Salario);
        texto.setText("Salario Liquido é "+ nome);
    }
}
