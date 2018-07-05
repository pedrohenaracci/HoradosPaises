package com.example.aula_01.horadospases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UltimaTelaActivity extends AppCompatActivity {
    String hora;
    String minuto;
    String ampm;

    TextView textView_;
    TextView sobrenome2;
    TextView idade2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultima_tela);
    }
}
