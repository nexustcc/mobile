package com.example.nexustcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.nexustcc.remote.APIUtil;
import com.example.nexustcc.remote.RouterInterface;

public class Login extends AppCompatActivity {

    RouterInterface routerInterface;
    private EditText txtEmail;
    private EditText txtSenha;
    private Button btnEntrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        txtEmail = findViewById(R.id.txtEmail);
//        txtSenha = findViewById(R.id.txtSenha);
//        btnEntrar = findViewById(R.id.btnEntrar);
//
//
//        //**  CONECTA O APLICATIVO COM A API**//
//        routerInterface = APIUtil.getGruposInterface();
//
//
//        btnEntrar.setOnClickListener(view-> {
//            //passar o contexto e a tela
//            Intent telaLogin = new Intent(
//                    Login.this,
//                    ListagemGrupo.class
//            );
//
//            //para executar
//            startActivity(telaLogin);
//        }); // FIM DO BOTAO CADASTRAR
//
//        btnEntrar.setOnClickListener(view -> {
//
//            String email = txtEmail.getText().toString();
//            String senha = txtSenha.getText().toString();
//
//            int idUsuario = APIUtil
//                    .getInstance(this)
//                    .login(email, senha);
//
//            if (idUsuario > 0) {
//
//                Login.setCod_usuario(idUsuario);
//
//                startActivity(
//                        new Intent(Login.this,
//                                ListagemGrupo.class)
//                );
//            } else {
//                Toast.makeText(this,
//                        "DADOS DE LOGIN INCORRETOS!",
//                        Toast.LENGTH_LONG).show();
//            }
//
//        });


        }
}