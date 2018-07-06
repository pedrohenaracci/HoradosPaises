package com.example.aula_01.horadospases;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UltimaTelaActivity extends AppCompatActivity {
    String hora;
    String minuto;
    String ampm;

    TextView textView_franca;
    TextView textView_china;
    TextView textView_africa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultima_tela);

        Intent intent = getIntent();
        Bundle meuBundle = intent.getExtras();

        hora = meuBundle.getString("hora");
        minuto = meuBundle.getString("minuto");
        ampm = meuBundle.getString("ampm");

        hora.toString();
        minuto.toString();
        ampm.toString();

        textView_franca = (TextView) findViewById(R.id.textView_franca);
        textView_china = (TextView) findViewById(R.id.textView_china);
        textView_africa = (TextView) findViewById(R.id.textView_africa);

        textView_franca.setText(franca(hora,minuto,ampm));
        textView_china.setText(china(hora,minuto,ampm));
        textView_africa.setText(africa(hora,minuto,ampm));


    }

    public String franca(String x,String y, String z){
        int auxx;
        auxx = Integer.parseInt(x);
        auxx += 4;
        if(auxx > 12){
            if(auxx <= 8) {
                auxx += -12;
                if(z.equalsIgnoreCase("AM")){
                    z = "PM";
                }else{z = "AM";}

                String hora_final = Integer.toString(auxx);
                return "0"+hora_final+" : "+y+" "+z;
            }else{
                auxx += -12;
                if(z.equalsIgnoreCase("AM")){
                    z = "PM";
                }else{z = "AM";}

                String hora_final = Integer.toString(auxx);
                return hora_final+" : "+y+" "+z;
            }
        }else{
            if(auxx <= 8) {
                if(z.equalsIgnoreCase("AM")){
                    z = "PM";
                }else{z = "AM";}

                String hora_final = Integer.toString(auxx);
                return "0"+hora_final+" : "+y+" "+z;
            }else{
                if(z.equalsIgnoreCase("AM")){
                    z = "PM";
                }else{z = "AM";}

                String hora_final = Integer.toString(auxx);
                return hora_final+" : "+y+" "+z;
            }


        }


    }

    public String china(String x,String y, String z){
        int auxx;
        auxx = Integer.parseInt(x);
        auxx += 11;
        if(auxx > 12){
            if(auxx <= 8) {
                auxx += -12;
                if(z.equalsIgnoreCase("AM")){
                    z = "PM";
                }else{z = "AM";}

                String hora_final = Integer.toString(auxx);
                return "0"+hora_final+" : "+y+" "+z;
            }else{
                auxx += -12;
                if(z.equalsIgnoreCase("AM")){
                    z = "PM";
                }else{z = "AM";}

                String hora_final = Integer.toString(auxx);
                return hora_final+" : "+y+" "+z;
            }
        }else{
            if(auxx <= 8) {
                if(z.equalsIgnoreCase("AM")){
                    z = "PM";
                }else{z = "AM";}

                String hora_final = Integer.toString(auxx);
                return "0"+hora_final+" : "+y+" "+z;
            }else{
                if(z.equalsIgnoreCase("AM")){
                    z = "PM";
                }else{z = "AM";}

                String hora_final = Integer.toString(auxx);
                return hora_final+" : "+y+" "+z;
            }


        }



    }

    public String africa(String x,String y, String z){
        int auxx;
        auxx = Integer.parseInt(x);
        auxx += 5;
        if(auxx > 12){
            if(auxx <= 8) {
                auxx += -12;
                if(z.equalsIgnoreCase("AM")){
                    z = "PM";
                }else{z = "AM";}

                String hora_final = Integer.toString(auxx);
                return "0"+hora_final+" : "+y+" "+z;
            }else{
                auxx += -12;
                if(z.equalsIgnoreCase("AM")){
                    z = "PM";
                }else{z = "AM";}

                String hora_final = Integer.toString(auxx);
                return hora_final+" : "+y+" "+z;
            }
        }else{
            if(auxx <= 8) {
                if(z.equalsIgnoreCase("AM")){
                    z = "PM";
                }else{z = "AM";}

                String hora_final = Integer.toString(auxx);
                return "0"+hora_final+" : "+y+" "+z;
            }else{
                if(z.equalsIgnoreCase("AM")){
                    z = "PM";
                }else{z = "AM";}

                String hora_final = Integer.toString(auxx);
                return hora_final+" : "+y+" "+z;
            }


        }



    }
}
