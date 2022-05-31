package com.example.nexustcc;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.util.Log;

public class SplashScreenActivity extends AppCompatActivity {


    //DEFINE TEMPO QUE A TELA IRÁ EXIBIR  (tempo em milisegundos)
    private static int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                //MÉTODO UTILIZADO UMA VEZ NA ABERTURA DO APP
                Intent i = new Intent(SplashScreenActivity.this, Login.class);
                startActivity(i);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}