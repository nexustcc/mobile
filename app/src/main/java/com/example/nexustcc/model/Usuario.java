package com.example.nexustcc.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Usuario {

        //declarando os atributos

        @SerializedName("idUsuario")
        //mapeando dentro do gson o "idUsuario"
        @Expose
        //ficar visivel para a biblioteca
        private int idUsuario;

        @SerializedName("tblUsuario")
        @Expose
        private int tblUsuario;

        @SerializedName("nome")
        @Expose
        private String nome;

        @SerializedName("email")
        @Expose
        private String email;

        @SerializedName("senha")
        @Expose
        private String senha;


        //construtor vazio e um que carrega os dados

        public Usuario() {
        }

        public int getIdUsuario() {
            return idUsuario;
        }

        public void setIdUsuario(int idUsuario) {
            this.idUsuario = idUsuario;
        }

        public int getTblUsuario() {
            return tblUsuario;
        }

        public void setTblUsuario(int tblUsuario) {
            this.tblUsuario = tblUsuario;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }



        public Usuario(int idUsuario, int tblUsuario, String nome, String email,  String senha) {

            this.idUsuario = idUsuario;
            this.tblUsuario = tblUsuario;
            this.nome = nome;
            this.email = email;
            this.senha = senha;


    }
}
