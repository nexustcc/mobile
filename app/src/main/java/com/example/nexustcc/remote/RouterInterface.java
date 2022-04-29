package com.example.nexustcc.remote;
import android.telecom.Call;

import com.example.nexustcc.model.Grupos;

import java.util.List;

public interface RouterInterface {

        /** ROTA DE LISTAGEM DOS GRUPOS **/

        //requisição de leitura
        @GET("/listarGrupo/{idGrupo}")
        Call<List<Grupos>>getGrupos();


}
