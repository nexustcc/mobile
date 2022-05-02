package com.example.nexustcc.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;


public class RetrofitGrupos {

    private static RetrofitGrupos retrofit = null;

    /** MÉTODO DE ACESSO  **/
    //aonde a API roda
    public static RetrofitGrupos getGrupos(String url){

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        if(retrofit == null){

            retrofit = new RetrofitGrupos.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

        }

        return retrofit;

    }


}

