package com.example.nexustcc.remote;

import com.example.nexustcc.model.Grupos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RouterInterface {

        /** ROTA DE LISTAGEM DOS GRUPOS **/
        //requisição de leitura
        @GET("/avaliador/listarGruposAvaliador/{idAvaliador}")
        Call<List<Grupos>>getGrupos(@Path("idAvaliador") int idAvaliador);

//        /** ROTA DE LISTAGEM DAS INFORMAÇÕES DOS GRUPOS **/
//        //requisição de leitura
//        @GET("/avaliador/listarGrupo/{idGrupo}")
//        Call<List<Grupos>>getGrupos(@Path("idGrupo") int idGrupo);



}
