package com.example.nexustcc.remote;

public class APIUtil {

    //devolve uma instância do retrofit válida
    //IP e não o localhost
    private static final String API_URL = "http://10.107.144.4:3000";

    public  static RouterInterface getGruposInterface(){

        return Retrofit.getClient(API_URL)
                .create(RouterInterface.class);

    }
}