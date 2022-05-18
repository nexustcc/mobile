package com.example.nexustcc;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nexustcc.model.Grupos;
import com.example.nexustcc.remote.APIUtil;
import com.example.nexustcc.remote.RouterInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VisaoGeralFragment extends Fragment {


    /*DECLARAÇÃO DOS ATRIBUTOS*/

    RouterInterface routerInterface;
    RecyclerView recyclerView = null;
    List<Grupos> list = new ArrayList<Grupos>();

    EditText txtNomeGrupo;
    EditText txtTemaProjetovs;
    EditText txtDescricaoProjetovs;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_visao_geral, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);

        return v;

    }

    public VisaoGeralFragment() {
        // Required empty public constructor

    }

    // TODO: Rename and change types and number of parameters
    public static VisaoGeralFragment newInstance(String param1, String param2) {
        VisaoGeralFragment fragment = new VisaoGeralFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//       // para pegarmos os dados da outra tela pelo id
//        int idGrupo = getActivity()
//                .getIntent()
//                .getExtras()
//                .getInt("idGrupo");


        //**  CONECTA O APLICATIVO COM A API**//
        routerInterface = APIUtil.getGruposInterface();

        //**  EXECUTA A CHAMADA PARA A ROTA DE LISTAGEM DAS INFORMAÇÕES DOS GRUPOS**//

        Call<List<Grupos>> call = routerInterface.getInformacoesGrupos(5);

//        Call<List<Grupos>> callGetGrupoID = routerInterface.getGrupoId(idGrupo);
//
//        callGetGrupoID.enqueue(new Callback<List<Grupos>>() {
//            @Override
//            public void onResponse(Call<List<Grupos>> call, Response<List<Grupos>> response) {
//
//                if (response.isSuccessful()) {
//
//                    list = response.body();
//
//                    txtNomeGrupo.setText(list.get(0).getNomeGrupo());
//                    txtTemaProjetovs.setText(list.get(0).getTemaProjeto());
//                    txtDescricaoProjetovs.setText(list.get(0).getTemaProjeto());
//
//                    recyclerView.setOnClickListener(view -> {
//
//                        Grupos grupo = new Grupos();
//
//                        grupo.setNomeGrupo(txtNomeGrupo.getText().toString());
//                        grupo.setDescricao(txtTemaProjetovs.getText().toString());
//                        grupo.setDescricao(txtDescricaoProjetovs.getText().toString());
//                        grupo.setIdGrupo(idGrupo);
//                        //pegar um grupo que esteja cadastrado no BCD
//                        grupo.setTblGrupoIdGrupo(3);
//
//                    });
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Grupos>> call, Throwable t) {
//
//            }
//        });

        //PEGAR OS DADOS
        call.enqueue(new Callback<List<Grupos>>() {
            @Override
            //RECEBER OS DADOS
            public void onResponse(Call<List<Grupos>> call, Response<List<Grupos>> response) {

                Log.d("TESTE1", "ONRESPONSE");
                Log.d("TESTE1", String.valueOf(response.isSuccessful()));

                if (response.isSuccessful()) {

                    Log.d("TESTE1", "ISSUCCESSFUL");

                    //List<Item> itens = new ArrayList<>();

                    //RECEBE OS DADOS DA API

                    List<Grupos> grupos = new ArrayList<Grupos>();
                    grupos = response.body();
//                    Log.d("GRUPOS", String.valueOf(grupos.get(0).getTemaProjeto()));
//                    Log.d("GRUPOS", String.valueOf(grupos.get(0).getDescricao()));
//                    Log.d("GRUPOS", String.valueOf(grupos.get(0).getIdGrupo()));
//

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

    private class GrupoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        List<Grupos> grupos;

        public GrupoAdapter(List<Grupos> grupos) {
            this.grupos = grupos;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new VisaoGeralFragment.GrupoAdapter.GrupoViewHolder(
                    LayoutInflater.from(
                            parent.getContext()).inflate(
                            R.layout.item_container_visao_geral,
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
            ((VisaoGeralFragment.GrupoAdapter.GrupoViewHolder) holder).setGrupoData(grupo);
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

            private TextView txtNomeGrupo, txtTemaProjetovs, txtDescricaoProjetovs;
            private int idGrupo;

            public GrupoViewHolder(@NonNull View itemView) {
                super(itemView);

                txtNomeGrupo = itemView.findViewById(R.id.txtNomeGrupo);
                txtTemaProjetovs = itemView.findViewById(R.id.txtTemaProjetovs);
                txtDescricaoProjetovs = itemView.findViewById(R.id.txtDescricaoProjetovs);
            }

              /*MÉTODO QUE CARREGA OS VALORES NOS ELEMENTOS DE TEXTVIEW
                -txtTemaDoProjeto
                -txtDescricaoProjeto */

            public void setGrupoData(Grupos grupo) {

                    Log.d("GRUPOS", String.valueOf(grupo.getNomeGrupo()));
                    Log.d("GRUPOS", String.valueOf(grupo.getTemaProjeto()));
                    Log.d("GRUPOS", String.valueOf(grupo.getDescricao()));
                    Log.d("GRUPOS", String.valueOf(grupo.getIdGrupo()));
                txtNomeGrupo.setText(grupo.getNomeGrupo());
                txtTemaProjetovs.setText(grupo.getTemaProjeto());
                txtDescricaoProjetovs.setText(grupo.getDescricao());
                idGrupo = grupo.getIdGrupo();
//                grupo.setIdGrupo(idGrupo);



            }


        }



    }
}







