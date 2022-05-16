package com.example.nexustcc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nexustcc.model.Grupos;
import com.example.nexustcc.model.Item;
import com.example.nexustcc.remote.APIUtil;
import com.example.nexustcc.remote.RouterInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ListagemGrupo extends AppCompatActivity {


    /*DECLARAÇÃO DOS ATRIBUTOS*/

    RouterInterface routerInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_grupo);

        //**  CONECTA O APLICATIVO COM A API**//
        routerInterface = APIUtil.getGruposInterface();

        //**  EXECUTA A CHAMADA PARA A ROTA DE LISTAGEM DE GRUPOS**//

        Call<List<Grupos>> call = routerInterface.getGrupos(2);


        //PEGAR OS DADOS
        call.enqueue(new Callback<List<Grupos>>() {
            @Override
            //RECEBER OS DADOS
            public void onResponse(Call<List<Grupos>> call, Response<List<Grupos>> response) {

                Log.d("TESTE1", "ONRESPONSE");
                Log.d("TESTE1", String.valueOf(response.isSuccessful()));

                if (response.isSuccessful()){

                    Log.d("TESTE1", "ISSUCCESSFUL");

                    //List<Item> itens = new ArrayList<>();

                    //RECEBE OS DADOS DA API

                    List<Grupos> grupos = new ArrayList<Grupos>();
                    grupos = response.body();

                    //Log.d("TESTE-", String.valueOf(grupos.get(1).getNomeProjeto()));
                    //Log.d("TESTE1", String.valueOf(grupos.size()));

//                    for (int i = 0; i < list.size(); i++){
//                        itens.add(new Item(0, list.get(i)));
//
//                        RecyclerView recyclerView = findViewById(R.id.recyclerView);
//                        recyclerView.setAdapter(new GrupoAdapter(list));
//                    }

                    RecyclerView recyclerView = findViewById(R.id.recyclerView);
                   recyclerView.setAdapter(new GrupoAdapter(grupos));
                }
            }

            @Override
            public void onFailure(Call<List<Grupos>> call, Throwable t) {

                Log.d("TESTE1", "FAILURE");
                Log.d("TESTE1", t.getMessage());

            }
        });
    } //FIM DO MÉTODO ONCREATE

    /*CLASSE DE ADAPTER DA RECYCLERVIEW*/

    private class GrupoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

        List<Grupos> grupos;

        public GrupoAdapter(List<Grupos> grupos){
            this.grupos = grupos;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new GrupoAdapter.GrupoViewHolder(
                    LayoutInflater.from(
                            parent.getContext()).inflate(
                            R.layout.item_container_grupos,
                            parent,
                            false
                    ));
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

            //DADOS DOS GRUPOS
           // if (getItemViewType(position)== 0){

                Grupos grupo = grupos.get(position);

                Log.d("TESTE-", String.valueOf(grupo.getNomeProjeto()));
                ((GrupoAdapter.GrupoViewHolder) holder).setGrupoData(grupo);
            //}

        }

        //retornando a quantidade de itens
        @Override
        public int getItemCount() {
            return grupos.size();
        }

//        public int getItemViewType(int position){
//            return grupos.get(position);
//        }

        /*CLASSE DE VIEWHOLDER DA RECYCLERVIEW*/

        class GrupoViewHolder extends RecyclerView.ViewHolder {

            /*ATRIBUTOS DA CLASS GRUPOVIEWHOLDER*/

            private TextView txtNomeDoProjeto, txtTemaDoProjeto;
            private int idGrupo;

            public GrupoViewHolder(@NonNull View itemView) {
                super(itemView);

                txtNomeDoProjeto = itemView.findViewById(R.id.txtNomeDoProjeto);
                txtTemaDoProjeto = itemView.findViewById(R.id.txtTemaDoProjeto);
            }

              /*MÉTODO QUE CARREGA OS VALORES NOS ELEMENTOS DE TEXTVIEW
                -txtNomeDoProjeto
                -txtTemaDoProjeto */

            public void setGrupoData(Grupos grupo){
                txtNomeDoProjeto.setText(grupo.getNomeProjeto().toString());
                txtTemaDoProjeto.setText(grupo.getTemaProjeto().toString());
                idGrupo = grupo.getIdGrupo();

                //* AÇÃO DE CLICK PARA EXIBIR INFORMAÇÕES DO GRUPO*//

                itemView.setOnClickListener(view -> {

                    //o parâmetro é aonde o alertDialog será executado
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(ListagemGrupo.this)
                            .setMessage("ESCOLHA A AÇÃO QUE DESEJA EXECUTAR:")
                            .setPositiveButton("VISUALIZAR INFORMAÇÕES DO GRUPO", (dialog1, witch)->{
                                //redireciona para tela de informações dos grupos e leva os dados
                                Intent intent = new Intent(ListagemGrupo.this, VisaoGeralFragment.class);
                                intent.putExtra("idGrupo", idGrupo);
                                Toast.makeText(ListagemGrupo.this, "ID clicado: " + grupo.getIdGrupo(), Toast.LENGTH_SHORT).show();
                                startActivity(intent);
                            })
                            .setNegativeButton("CANCELAR", (dialog1, witch)->{});

                    alertDialog.show();
                });

            }

        }
    }
}
