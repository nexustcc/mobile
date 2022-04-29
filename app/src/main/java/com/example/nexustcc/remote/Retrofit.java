package com.example.nexustcc.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Retrofit {

    /** MÉTODO DE ACESSO **/
    public static Retrofit getClient(String url){

        private static Retrofit retrofit = null;
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }

        return retrofit;

    }



}
© 2022 GitHub, Inc.
        Terms
