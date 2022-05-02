package com.example.nexustcc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

        Call<List<Grupos>> call = routerInterface.getGrupos();


        //PEGAR OS DADOS
        call.enqueue(new Callback<List<Grupos>>() {
            @Override
            //RECEBER OS DADOS
            public void onResponse(Call<List<Grupos>> call, Response<List<Grupos>> response) {

                if (response.isSuccessful()){

                    List<Item> itens = new ArrayList<>();

                    //RECEBE OS DADOS DA API

                    List<Grupos> list = new ArrayList<Grupos>();
                    list = response.body();

                    for (int i = 0; i < list.size(); i++){
                        itens.add(new Item(0, list.get(i)));

                        RecyclerView recyclerView = findViewById(R.id.recyclerView);
                        recyclerView.setAdapter(new GrupoAdapter(itens));
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Grupos>> call, Throwable t) {

            }
        });
    } //FIM DO MÉTODO ONCREATE

    /*CLASSE DE ADAPTER DA RECYCLERVIEW*/

    private class GrupoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

        List<Item> itens;

        public GrupoAdapter(List<Item> itens){
            this.itens = itens;
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
            if (getItemViewType(position)== 0){

                Grupos grupo = (Grupos) itens.get(position).getObject();
                ((GrupoAdapter.GrupoViewHolder) holder).setGrupoData(grupo);
            }

        }

        //retornando a quantidade de itens
        @Override
        public int getItemCount() {
            return itens.size();
        }

        public int getItemViewType(int position){
            return itens.get(position).getType();
        }

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
                txtNomeDoProjeto.setText(grupo.getNomeProjeto());
                txtTemaDoProjeto.setText(grupo.getTemaProjeto());
                idGrupo = grupo.getIdGrupo();


            }
        };
    }
}
