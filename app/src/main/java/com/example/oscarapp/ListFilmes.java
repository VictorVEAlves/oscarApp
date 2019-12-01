package com.example.oscarapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONException;
import org.json.JSONObject;

public class ListFilmes extends AppCompatActivity implements Response.Listener, Response.ErrorListener{

    public static final String REQUEST_TAG = "MainVolleyActivity";
    private ImageView imgFilme;
    private TextView nomeFilme;
    private TextView generoFilme;
    private RequestQueue mQueue;

    private Context ctx = this;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_filmes);

        imgFilme = (ImageView)findViewById(R.id.filmeImg);
        nomeFilme = (TextView)findViewById(R.id.filmeNome);
        generoFilme = (TextView)findViewById(R.id.filmeGenero);

        String[] filmes = new String[3];
        Integer[] img = new Integer[3];

        ListCell adapter = new ListCell(ListFilmes.this, filmes, img);
        list = (ListView)findViewById(R.id.listFilmes);
        list.setAdapter(adapter);
        final String[] finalFilmes = filmes;
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(ListFilmes.this, DetalhesFilme.class);
                Bundle params = new Bundle();
                params.putString("filme", finalFilmes[+position]);
                it.putExtras(params);
                startActivity(it);
            }
        });
    }

    @Override
    public void onErrorResponse(VolleyError error){
        System.out.println("zikou");
    }

    @Override
    public void onResponse(Object response){
        try{
            //imgFilme.setImageURI(((JSONObject)response).getString("foto"));
            nomeFilme.setText(String.valueOf(((JSONObject)response).getInt("nome")));
            generoFilme.setText(((JSONObject)response).getString("genero"));
        }catch(JSONException e){
            e.printStackTrace();
        }
    }
}
