package com.example.luana.trabalho01_2017_2;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText idNome;
    private EditText idSalario;
    private EditText idHoras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button = (Button) findViewById(R.id.button);
        this.idSalario = (EditText) findViewById(R.id.idSalario);
        this.idHoras = (EditText) findViewById(R.id.idHoras);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float c = 0;
                float d = 0;
                float a = Float.parseFloat(idSalario.getText().toString());
                float b = Float.parseFloat(idHoras.getText().toString());

                d =  (a * b);
                c  = (float)  (d - (d * 0.11) - (d * 0.08) - (d * 0.05));

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("nome", c);
                startActivity(intent);

            }
        });

    }
}
