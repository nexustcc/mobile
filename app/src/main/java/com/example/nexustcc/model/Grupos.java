package com.example.nexustcc.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.sql.Time;
import java.util.Date;

public class Grupos {

    //declarando os atributos


    @SerializedName("idGrupo")
    //mapeando dentro do gson o "idGrupo"
    @Expose
    //ficar visivel para a biblioteca
    private int idGrupo;

    @SerializedName("nomeProjeto")
    @Expose
    private String nomeProjeto;

    @SerializedName("temaProjeto")
    @Expose
    private String temaProjeto;

    @SerializedName("numeracao")
    @Expose
    private int numeracao;

    @SerializedName("nomeGrupo")
    @Expose
    private String nomeGrupo;

    @SerializedName("descricaoProjeto")
    @Expose
    private String descricaoProjeto;

    @SerializedName("dataApresentacao")
    @Expose
    private Date dataApresentacao;

    @SerializedName("horaApresentacao")
    @Expose
    private Time horaApresentacao;

    //construtor vazio e um que carrega os dados


    public Grupos() {
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getTemaProjeto() {
        return temaProjeto;
    }

    public void setTemaProjeto(String temaProjeto) {
        this.temaProjeto = temaProjeto;
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public String getDescricao() {
        return descricaoProjeto;
    }

    public void setDescricao(String descricao) {
        this.descricaoProjeto = descricao;
    }

    public Date getDataApresentacao() {
        return dataApresentacao;
    }

    public void setDataApresentacao(Date dataApresentacao) {
        this.dataApresentacao = dataApresentacao;
    }

    public Time getHoraApresentacao() {
        return horaApresentacao;
    }

    public void setHoraApresentacao(Time horaApresentacao) {
        this.horaApresentacao = horaApresentacao;
    }

    public Grupos(String nomeProjeto, String temaProjeto, int numeracao, String nomeGrupo, String descricao, Date dataApresentacao, Time horaApresentacao) {

        this.nomeProjeto = nomeProjeto;
        this.temaProjeto = temaProjeto;
        this.numeracao = numeracao;
        this.nomeGrupo = nomeGrupo;
        this.descricaoProjeto = descricao;
        this.dataApresentacao = dataApresentacao;
        this.horaApresentacao = horaApresentacao;

    }

}
