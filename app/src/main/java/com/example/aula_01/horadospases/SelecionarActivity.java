package com.example.aula_01.horadospases;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelecionarActivity extends AppCompatActivity {

    TextView text_hora ;
    TextView text_minuto;
    Button botao_ampm;

    int auxh;
    int auxm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecionar);
        text_hora = findViewById(R.id.textView_hora);
        text_minuto = findViewById(R.id.textView_minuto);


    }
    public void maisHora(View view){
        if(Integer.parseInt(text_hora.getText().toString()) <= 8){
            auxh = Integer.parseInt(text_hora.getText().toString());
            auxh += 1;
            String hora_final = Integer.toString(auxh);
            text_hora.setText("0"+hora_final);

        }else if(text_hora.getText().toString().equalsIgnoreCase("12")){
            int aux = 01;
            String hora_final = Integer.toString(aux);
            text_hora.setText("0"+hora_final);
        }else{
            auxh += 1;
            String hora_final = Integer.toString(auxh);
            text_hora.setText(hora_final);
        }
    }

    public void menosHora(View view){
        if(text_hora.getText().toString().equalsIgnoreCase("01")){
            auxh = 12;
            String hora_final = Integer.toString(auxh);
            text_hora.setText(hora_final);
        }else if(Integer.parseInt(text_hora.getText().toString()) <= 10){
            auxh = Integer.parseInt(text_hora.getText().toString());
            auxh += -1;
            String hora_final = Integer.toString(auxh);
            text_hora.setText("0"+hora_final);
        }else {
            auxh += -1;
            String hora_final = Integer.toString(auxh);
            text_hora.setText(hora_final);
        }
    }

    public void maisMinuto(View view){
        if(Integer.parseInt(text_minuto.getText().toString()) <= 8){
            auxm = Integer.parseInt(text_minuto.getText().toString());
            auxm += 1;
            String minuto_final = Integer.toString(auxm);
            text_minuto.setText("0"+minuto_final);

        }else if(text_minuto.getText().toString().equalsIgnoreCase("59")){
            auxm = 00;
            String hora_minuto = Integer.toString(auxm);
            text_minuto.setText("0"+hora_minuto);
        }else{
            auxm += 1;
            String hora_minuto = Integer.toString(auxm);
            text_minuto.setText(hora_minuto);
        }
    }

    public void menosMinuto(View view){
        if(text_minuto.getText().toString().equalsIgnoreCase("00")){
            auxm = 59;
            String minuto_final = Integer.toString(auxm);
            text_minuto.setText(minuto_final);
        }else if(Integer.parseInt(text_minuto.getText().toString()) <= 10){
            auxm = Integer.parseInt(text_minuto.getText().toString());
            auxm += -1;
            String minuto_final = Integer.toString(auxm);
            text_minuto.setText("0"+minuto_final);
        }else {
            auxm += -1;
            String minuto_final = Integer.toString(auxm);
            text_minuto.setText(minuto_final);
        }
    }

    public void amPm(View view){
        botao_ampm = (Button) findViewById(R.id.botao_ampm);
        if(botao_ampm.getText().equals("AM")){
            botao_ampm.setText("PM");
        }else{
            botao_ampm.setText("AM");
        }
    }

    public void calcular(View view ){
        Intent ultimaTela = new Intent(this,UltimaTelaActivity.class);
        Bundle minhaBundle = new Bundle();
        minhaBundle.putString("hora",text_hora.getText().toString());
        minhaBundle.putString("minuto",text_minuto.getText().toString());
        minhaBundle.putString("ampm",botao_ampm.getText().toString());

        ultimaTela.putExtras(minhaBundle);
        startActivity(ultimaTela);
    }


}
