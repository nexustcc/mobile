package com.example.nexustcc.remote;

import com.example.nexustcc.model.Grupos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RouterInterface {

        /** ROTA DE LISTAGEM DOS GRUPOS **/
        //requisição de leitura
        @GET("/listarGrupo/{idGrupo}")
        Call<List<Grupos>>getGrupos();

}
