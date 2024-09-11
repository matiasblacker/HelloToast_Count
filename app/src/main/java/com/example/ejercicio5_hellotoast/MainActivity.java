package com.example.ejercicio5_hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView tvCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.tvCount);
        Button btnContador = findViewById(R.id.btnContador);
        Button btnToast = findViewById(R.id.btnToast);

        // Botón para mostrar Toast
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello toast!", Toast.LENGTH_SHORT).show();
            }
        });

        // Botón para incrementar el contador
        btnContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCount++;
                tvCount.setText(String.valueOf(mCount));
            }
        });
    }
}