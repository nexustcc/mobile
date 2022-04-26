package com.example.nexustcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.Call;
import com.example.nexustcc.model.Grupos;
import com.example.nexustcc.remote.APIUtil;
import com.example.nexustcc.remote.ApiInterface;

import java.util.List;

public class ListagemGrupo extends AppCompatActivity {


    /*DECLARAÇÃO DOS ATRIBUTOS*/

    ApiInterface routerInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_grupo);

        //**  CONECTA O APLICATIVO COM A API**//
        routerInterface = APIUtil.getUsuarioInterface();

//**  EXECUTA A CHAMADA PARA A ROTA DE LISTAGEM DE GRUPOS**//

        Call<List<Grupos>> call = routerInterface.getGrupos();

        call.enqueue(new Callback<List<Grupos>>() {
            @Override
            public void onResponse(Call<List<Grupos>> call, Response<List<Grupos>> response) {

            }

            @Override
            public void onFailure(Call<List<Grupos>> call, Throwable t) {

            }
        });
    }
}
