package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtResultado = (TextView) findViewById(R.id.txtResultado);
        String dato = getIntent().getStringExtra("dato");
        txtResultado.setText("" + dato);

        Button btnatras = (Button) findViewById(R.id.btnatras);
        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(pantalla);
            }
        });


    }
}