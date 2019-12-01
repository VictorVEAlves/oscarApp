package com.example.oscarapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListCell extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] filme;
    private final Integer[] imgId;

    public ListCell(Activity context, String[] filme, Integer[] imgId){
        super(context, R.layout.activity_list_cell, filme);
        this.context = context;
        this.filme = filme;
        this.imgId = imgId;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_list_cell, null, true);
        TextView nomeFilme = (TextView)rowView.findViewById(R.id.filmeNome);
        TextView generoFilme = (TextView)rowView.findViewById(R.id.filmeGenero);
        ImageView imgView = (ImageView)rowView.findViewById(R.id.filmeImg);
        nomeFilme.setText(filme[position]);
        generoFilme.setText(filme[position]);
        imgView.setImageResource(imgId[position]);

        return rowView;
    }
}
