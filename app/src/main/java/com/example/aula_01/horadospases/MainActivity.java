package com.example.aula_01.horadospases;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pressionarBotao(View view){
        Intent selecionarActivity = new Intent(this,SelecionarActivity.class);
        startActivity(selecionarActivity);

    }
}
