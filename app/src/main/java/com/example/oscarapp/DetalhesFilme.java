package com.example.oscarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalhesFilme extends AppCompatActivity {

    ImageView imgView;
    TextView nomeFilmes;
    TextView generoFilme;

    Intent it = getIntent();
    Bundle params = it.getExtras();
    String filme = params.getString("filme");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_filme);

        imgView = (ImageView)findViewById(R.id.filmeImg);
        nomeFilmes = (TextView)findViewById(R.id.nomeFilme);
        generoFilme = (TextView)findViewById(R.id.generoFilme);

        switch (filme){
            case "Piratas do Caribe: A Vingança de Salazar":
                imgView.setImageResource(R.drawable.ic_launcher_background);
                nomeFilmes.setText("");
                generoFilme.setText("");
                break;
            case "Passageiros":
                imgView.setImageResource(R.drawable.ic_launcher_background);
                nomeFilmes.setText("");
                generoFilme.setText("");
                break;
            case "La La Land":
                imgView.setImageResource(R.drawable.ic_launcher_background);
                nomeFilmes.setText("");
                generoFilme.setText("");
                break;
        }
    }
}
