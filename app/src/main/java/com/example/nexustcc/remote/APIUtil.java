package com.example.nexustcc.remote;

public class APIUtil {

    //devolve uma instância do retrofit válida
                                            //IP e não o localhost
    private static final String API_URL = "http://10.107.144.7:3000";

    public  static RouterInterface getGruposInterface(){

        return RetrofitClient.getClient(API_URL).create(RouterInterface.class);

    }
}
