package com.example.oscarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cadastrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);
    }

    public void register(View view){

    }

    public void goToLogin(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
