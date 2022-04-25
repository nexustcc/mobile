package com.example.nexustcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ListagemGrupo extends AppCompatActivity {

    private String nomeDoProjeto;
    private String tituloProjeto;

    public ListagemGrupo(String nomeDoProjeto, String tituloProjeto) {
        this.nomeDoProjeto = nomeDoProjeto;
        this.tituloProjeto = tituloProjeto;
    }

    public void setNomeDoProjeto(String nomeDoProjeto) {
        this.nomeDoProjeto = nomeDoProjeto;
    }

    public void setTituloProjeto(String tituloProjeto) {
        this.tituloProjeto = tituloProjeto;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_grupo);
    }
}