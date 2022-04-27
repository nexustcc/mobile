package com.example.nexustcc.remote;
import android.telecom.Call;

import com.example.nexustcc.model.Grupos;

import java.util.List;

public interface RouterInterface {

        /** ROTA DE LISTAGEM DO GRUPOS **/
        @POST("/listarGrupo/:idGrupo")
        Call<Grupos>(@Body Grupos grupo);

         //requisição de leitura
        @GET("/listarGrupo/:idGrupo")
        Call<List<Grupos>>getGrupos();




    }
