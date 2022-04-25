package com.example.nexustcc.remote;

public class APIUtil {

    //devolve uma instância do retrofit válida
    //IP e não o localhost
    private static final String API_URL = "http://10.107.144.9:3000";

    public  static ApiInterface getUsuarioInterface(){

        return RetrofitClient.getClient(API_URL)
                .create(ApiInterface.class);

    }
}
