package com.example.nexustcc.remote;

import com.example.nexustcc.model.Grupos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RouterInterface {

        /** ROTA DE LISTAGEM DOS GRUPOS **/
        //requisição de leitura
        @GET("mobile/avaliador/listarGruposAvaliador/{idAvaliador}")
        Call<List<Grupos>>getGrupos(@Path("idAvaliador") int idAvaliador);

        /** ROTA DE LISTAGEM DAS INFORMAÇÕES DOS GRUPOS **/
        //requisição de leitura
        @GET("mobile/avaliador/listarGrupo/{idGrupo}")
        Call<List<Grupos>>getInformacoesGrupos(@Path("idGrupo") int idGrupo);

        //trazendo as informações do grupo pelo ID
        @GET("mobile/avaliador/listarGrupo/{idGrupo}")
        Call<List<Grupos>>getGrupoId(@Path("idGrupo") int idGrupo);

}
