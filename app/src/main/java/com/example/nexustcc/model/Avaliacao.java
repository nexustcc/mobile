package com.example.nexustcc.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Avaliacao {

    //declarando os atributos

    @SerializedName("idAvaliacao")
    //mapeando dentro do gson o "idAvaliacao"
    @Expose
    //ficar visivel para a biblioteca
    private int idAvaliacao;

    @SerializedName("tblAvaliacaoIdAvaliacao")
    @Expose
    private int tblAvaliacaoIdAvaliacao;

    @SerializedName("objetividade")
    @Expose
    private String objetividade;

    @SerializedName("dominioConteudo")
    @Expose
    private String dominioConteudo;

    @SerializedName("organizacao")
    @Expose
    private String organizacao;

    @SerializedName("clareza")
    @Expose
    private String clareza;

    @SerializedName("aproveitamentoRecursos")
    @Expose
    private String aproveitamentoRecursos;

    @SerializedName("posturaIntegrantes")
    @Expose
    private String posturaIntegrantes;

    @SerializedName("fluenciaExposicaoIdeias")
    @Expose
    private String fluenciaExposicaoIdeias;

    @SerializedName("argumentacao")
    @Expose
    private String argumentacao;

    @SerializedName("usoTempo")
    @Expose
    private String usoTempo;

    @SerializedName("capacidadeComunicacao")
    @Expose
    private String capacidadeComunicacao;

    @SerializedName("observacoes")
    @Expose
    private String observacoes;


    //construtor vazio e um que carrega os dados


    public Avaliacao() {
    }

    public int getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public int getTblAvaliacaoIdAvaliacao() {
        return tblAvaliacaoIdAvaliacao;
    }

    public void setTblAvaliacaoIdAvaliacao(int tblAvaliacaoIdAvaliacao) {
        this.tblAvaliacaoIdAvaliacao = tblAvaliacaoIdAvaliacao;
    }

    public String getObjetividade() {
        return objetividade;
    }

    public void setObjetividade(String objetividade) {
        this.objetividade = objetividade;
    }

    public String getDominioConteudo() {
        return dominioConteudo;
    }

    public void setDominioConteudo(String dominioConteudo) {
        this.dominioConteudo = dominioConteudo;
    }

    public String getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(String organizacao) {
        this.organizacao = organizacao;
    }

    public String getClareza() {
        return clareza;
    }

    public void setClareza(String clareza) {
        this.clareza = clareza;
    }

    public String getAproveitamentoRecursos() {
        return aproveitamentoRecursos;
    }

    public void setAproveitamentoRecursos(String aproveitamentoRecursos) {
        this.aproveitamentoRecursos = aproveitamentoRecursos;
    }

    public String getPosturaIntegrantes() {
        return posturaIntegrantes;
    }

    public void setPosturaIntegrantes(String posturaIntegrantes) {
        this.posturaIntegrantes = posturaIntegrantes;
    }

    public String getFluenciaExposicaoIdeias() {
        return fluenciaExposicaoIdeias;
    }

    public void setFluenciaExposicaoIdeias(String fluenciaExposicaoIdeias) {
        this.fluenciaExposicaoIdeias = fluenciaExposicaoIdeias;
    }

    public String getArgumentacao() {
        return argumentacao;
    }

    public void setArgumentacao(String argumentacao) {
        this.argumentacao = argumentacao;
    }

    public String getUsoTempo() {
        return usoTempo;
    }

    public void setUsoTempo(String usoTempo) {
        this.usoTempo = usoTempo;
    }

    public String getCapacidadeComunicacao() {
        return capacidadeComunicacao;
    }

    public void setCapacidadeComunicacao(String capacidadeComunicacao) {
        this.capacidadeComunicacao = capacidadeComunicacao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Avaliacao(int idAvaliacao, int tblAvaliacaoIdAvaliacao, String objetividade, String dominioConteudo,
                     String organizacao, String clareza, String aproveitamentoRecursos, String posturaIntegrantes,
                     String fluenciaExposicaoIdeias, String argumentacao, String usoTempo, String capacidadeComunicacao,
                     String observacoes) {


        this.idAvaliacao = idAvaliacao;
        this.tblAvaliacaoIdAvaliacao = tblAvaliacaoIdAvaliacao;
        this.objetividade = objetividade;
        this.dominioConteudo = dominioConteudo;
        this.organizacao = organizacao;
        this.clareza = clareza;
        this.aproveitamentoRecursos = aproveitamentoRecursos;
        this.posturaIntegrantes = posturaIntegrantes;
        this.fluenciaExposicaoIdeias = fluenciaExposicaoIdeias;
        this.argumentacao = argumentacao;
        this.usoTempo = usoTempo;
        this.capacidadeComunicacao = capacidadeComunicacao;
        this.observacoes = observacoes;

    }



}


