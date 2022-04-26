package com.example.nexustcc.remote;
import android.telecom.Call;

import com.example.nexustcc.model.Grupos;

public interface ApiInterface {

        /** ROTA DE INSERÇÃO DO GRUPOS **/
        @POST("/cadastrarGrupo/:idTurma")
        Call<Grupos> addUsuario(@Body Grupos grupo);








    }
