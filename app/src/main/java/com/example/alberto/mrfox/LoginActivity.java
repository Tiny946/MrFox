package com.example.alberto.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button loguearse, registrarse;
    EditText email, contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loguearse = (Button) findViewById(R.id.buttonContinuar);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        loguearse.setTypeface(typeface);

        registrarse = (Button) findViewById(R.id.buttonRegis);
        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        registrarse.setTypeface(typeface2);

        email = (EditText) findViewById(R.id.editTextEmail);
        Typeface typeface3 = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        email.setTypeface(typeface);

        contra = (EditText)findViewById(R.id.editTextContra);
        Typeface typeface4 = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        contra.setTypeface(typeface);



    }

    public void entrar(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
