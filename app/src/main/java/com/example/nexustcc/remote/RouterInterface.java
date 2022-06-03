package com.example.nexustcc.remote;

import com.example.nexustcc.model.Avaliacao;
import com.example.nexustcc.model.Grupos;
import com.example.nexustcc.model.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
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

        @POST("mobile/avaliador/avaliarGrupo/{idAvaliador}/{idGrupo}")
        Call<Avaliacao> enviarFormulario(@Body Avaliacao avaliacao, @Path("idAvaliador") int idAvaliador, @Path ("idGrupo") int idGrupo);

        //requisição de leitura
        @GET("/mobile/login/{idUsuario}")
        Call<List<Usuario>>getUsuario();



}
