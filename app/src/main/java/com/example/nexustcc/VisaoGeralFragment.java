package com.example.nexustcc;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nexustcc.model.Grupos;
import com.example.nexustcc.remote.APIUtil;
import com.example.nexustcc.remote.RouterInterface;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VisaoGeralFragment extends Fragment {

    private Context mContext;

    public void FirstFragment() {
        // Required empty public constructor
    }

    /*DECLARAÇÃO DOS ATRIBUTOS*/
    RouterInterface routerInterface;
    RecyclerView recyclerView = null;
    List<Grupos> list = new ArrayList<Grupos>();


    private Button btnAvaliarGrupo;

    int idGrupo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_visao_geral, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);

        return v;

    }

    public VisaoGeralFragment(Context context) {
        this.mContext = context;
    }

    // TODO: Rename and change types and number of parameters
    public static VisaoGeralFragment newInstance(String param1, String param2, Context context) {
        VisaoGeralFragment fragment = new VisaoGeralFragment(context);
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//       // para pegarmos os dados da outra tela pelo id
        idGrupo = getActivity()
                .getIntent()
                .getExtras()
                .getInt("idGrupo");

        Log.d("ID", String.valueOf(idGrupo));

        //**  CONECTA O APLICATIVO COM A API**//
        routerInterface = APIUtil.getGruposInterface();

        //**  EXECUTA A CHAMADA PARA A ROTA DE LISTAGEM DAS INFORMAÇÕES DOS GRUPOS**//

        Call<List<Grupos>> call = routerInterface.getInformacoesGrupos(idGrupo);
        Log.d("CALL", String.valueOf(call));

        call.enqueue(new Callback<List<Grupos>>() {
            @Override
            public void onResponse(Call<List<Grupos>> call, Response<List<Grupos>> response) {

                if(response.isSuccessful()){
                    //Log.d("OK-CALL", String.valueOf(response.body().size()));
                    Grupos grupos = response.body().get(0);
                    Log.d("OK-CALL", String.valueOf(grupos.getNomeGrupo()));
                    recyclerView.setAdapter(new GrupoAdapter(response.body()));
                }

            }

            @Override
            public void onFailure(Call<List<Grupos>> call, Throwable t) {
                Log.d("ERRO-CALL", t.getMessage());
            }
        });


    } //FIM DO MÉTODO ONCREATE



    /*CLASSE DE ADAPTER DA RECYCLERVIEW*/
    class GrupoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        List<Grupos> grupos;

        public GrupoAdapter(List<Grupos> grupos) {

            this.grupos = grupos;
            Log.d("ADAPTER", String.valueOf(grupos.size()));
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

            Grupos grupo = grupos.get(position);

            Log.d("TESTE-", String.valueOf(grupo.getNomeProjeto()));
            ((VisaoGeralFragment.GrupoAdapter.GrupoViewHolder) holder).setGrupoData(grupo);

        }

        //retornando a quantidade de itens
        @Override
        public int getItemCount() {
            return grupos.size();
        }

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


                itemView.setOnClickListener(view -> {

                    //o parâmetro é aonde o alertDialog será executado
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity())
                            .setMessage("ESCOLHA A AÇÃO QUE DESEJA EXECUTAR:")
                            .setPositiveButton("AVALIAR GRUPO", (dialog1, witch)->{
                                //redireciona para tela de formulario
                                Intent intent = new Intent(getContext(), MainActivity.class);
                                intent.putExtra("idGrupo", idGrupo);
                                //Log.d("ID0GRUPO", String.valueOf(idGrupo));
                                startActivity(intent);
                            })
                            .setNegativeButton("CANCELAR", (dialog1, witch)->{});
                    alertDialog.show();
                });

                    Log.d("GRUPOS", String.valueOf(grupo.getNomeGrupo()));
                    Log.d("GRUPOS", String.valueOf(grupo.getTemaProjeto()));
                    Log.d("GRUPOS", String.valueOf(grupo.getDescricao()));
                    Log.d("GRUPOS", String.valueOf(grupo.getIdGrupo()));
                txtNomeGrupo.setText(grupo.getNomeGrupo());
                txtTemaProjetovs.setText(grupo.getTemaProjeto());
                txtDescricaoProjetovs.setText(grupo.getDescricao());
                idGrupo = grupo.getIdGrupo();

            }

        }

    }
}