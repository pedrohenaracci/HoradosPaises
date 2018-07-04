package com.example.aula_01.horadospases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelecionarActivity extends AppCompatActivity {

    TextView text_hora ;
    TextView text_minuto;

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
        if(Integer.parseInt(text_hora.getText().toString()) <= 9){
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


}
