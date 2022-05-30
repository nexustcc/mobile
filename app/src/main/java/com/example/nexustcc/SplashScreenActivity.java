package com.example.nexustcc;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {


    //Define tempo que a tela vai exibir. (tempo em milisegundos)
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                //Método que será executado uma vez.. Na abertura do app.
                Intent i = new Intent(SplashScreenActivity.this, FormularioFragment.class);
                startActivity(i);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}