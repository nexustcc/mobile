 package com.example.nexustcc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;


import java.util.ArrayList;
import java.util.List;

 public class FormularioFragment extends Fragment {

     private final List<String> idSelecionados = new ArrayList<>();


     //DECLARAÇÃO DO CHECKBOX
     private CheckBox
             cb01, cb02, cb03,
             cb04, cb05, cb06,
             cb07, cb08, cb09,
             cb10, cb11, cb12,
             cb13, cb14, cb15,
             cb16, cb17, cb18,
             cb19, cb20, cb21,
             cb22, cb23, cb24,
             cb25, cb26, cb27,
             cb28, cb29, cb30;


     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {

         // Inflate the layout for this fragment

         /** RECEBENDO OS OBJETOS DE INTERFACE **/
         View v = inflater.inflate(R.layout.fragment_formulario, container, false);
         cb01 = (CheckBox) v.findViewById(R.id.cb_clareza_1);
         cb02 = (CheckBox) v.findViewById(R.id.cb_clareza_2);
         cb03 = (CheckBox) v.findViewById(R.id.cb_clareza_3);
         cb04 = (CheckBox) v.findViewById(R.id.cb_objetividade_1);
         cb05 = (CheckBox) v.findViewById(R.id.cb_objetividade_2);
         cb06 = (CheckBox) v.findViewById(R.id.cb_objetividade_3);
         cb07 = (CheckBox) v.findViewById(R.id.cb_exposicao_ideias_1);
         cb08 = (CheckBox) v.findViewById(R.id.cb_exposicao_ideias_2);
         cb09 = (CheckBox) v.findViewById(R.id.cb_exposicao_ideias_3);
         cb10 = (CheckBox) v.findViewById(R.id.cb_dominio_conteudo_1);
         cb11 = (CheckBox) v.findViewById(R.id.cb_dominio_conteudo_2);
         cb12 = (CheckBox) v.findViewById(R.id.cb_dominio_conteudo_3);
         cb13 = (CheckBox) v.findViewById(R.id.cb_capacidade_comunicacao_1);
         cb14 = (CheckBox) v.findViewById(R.id.cb_capacidade_comunicacao_2);
         cb15 = (CheckBox) v.findViewById(R.id.cb_capacidade_comunicacao_3);
         cb16 = (CheckBox) v.findViewById(R.id.cb_argumentacao_1);
         cb17 = (CheckBox) v.findViewById(R.id.cb_argumentacao_2);
         cb18 = (CheckBox) v.findViewById(R.id.cb_argumentacao_3);
         cb19 = (CheckBox) v.findViewById(R.id.cb_organizacao_apresentacao_1);
         cb20 = (CheckBox) v.findViewById(R.id.cb_organizacao_apresentacao_2);
         cb21 = (CheckBox) v.findViewById(R.id.cb_organizacao_apresentacao_3);
         cb22 = (CheckBox) v.findViewById(R.id.cb_aproveitamento_recursos_1);
         cb23 = (CheckBox) v.findViewById(R.id.cb_aproveitamento_recursos_2);
         cb24 = (CheckBox) v.findViewById(R.id.cb_aproveitamento_recursos_3);
         cb25 = (CheckBox) v.findViewById(R.id.cb_postura_integrantes_1);
         cb26 = (CheckBox) v.findViewById(R.id.cb_postura_integrantes_2);
         cb27 = (CheckBox) v.findViewById(R.id.cb_postura_integrantes_3);
         cb28 = (CheckBox) v.findViewById(R.id.cb_uso_do_tempo_1);
         cb29 = (CheckBox) v.findViewById(R.id.cb_uso_do_tempo_2);
         cb30 = (CheckBox) v.findViewById(R.id.cb_uso_do_tempo_3);

         addCheckBoxChecked();
          return v;
          

     }

     //VALIDAÇÃO DO CHECKBOX
     public void addCheckBoxChecked() {

         /**CLAREZA**/

         cb01.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb01.isChecked())
                     cb02.setChecked(false);
                 cb03.setChecked(false);
             }
         });

         cb02.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb02.isChecked())
                     cb01.setChecked(false);
                 cb03.setChecked(false);
             }
         });

         cb03.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb03.isChecked())
                     cb01.setChecked(false);
                 cb02.setChecked(false);
             }
         });//FIM

         /**OBJETIVIDADE**/

         cb04.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb04.isChecked())
                     cb05.setChecked(false);
                 cb06.setChecked(false);
             }
         });

         cb05.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb05.isChecked())
                     cb04.setChecked(false);
                 cb06.setChecked(false);
             }
         });

         cb06.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb06.isChecked())
                     cb04.setChecked(false);
                 cb05.setChecked(false);
             }
         });//FIM


         /**FLUÊNCIA NA EXPOSIÇÃO DE IDEIAS**/

         cb07.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb07.isChecked())
                     cb08.setChecked(false);
                 cb09.setChecked(false);
             }
         });

         cb08.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb08.isChecked())
                     cb07.setChecked(false);
                 cb09.setChecked(false);
             }
         });

         cb09.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb09.isChecked())
                     cb07.setChecked(false);
                 cb08.setChecked(false);
             }
         }); //FIM

         /**DOMÍNIO DE CONTEÚDO**/
         cb10.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb10.isChecked())
                     cb11.setChecked(false);
                 cb12.setChecked(false);
             }
         });

         cb11.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb11.isChecked())
                     cb10.setChecked(false);
                 cb12.setChecked(false);
             }
         });

         cb12.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb12.isChecked())
                     cb10.setChecked(false);
                 cb11.setChecked(false);
             }
         }); //FIM

         /**CAPACIDADE DE COMUNICAÇÃO**/
         cb13.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb13.isChecked())
                     cb14.setChecked(false);
                 cb15.setChecked(false);
             }
         });

         cb14.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb14.isChecked())
                     cb13.setChecked(false);
                 cb15.setChecked(false);
             }
         });

         cb15.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb15.isChecked())
                     cb13.setChecked(false);
                 cb14.setChecked(false);
             }
         });//FIM

         /**ARGUMENTAÇÃO**/
         cb16.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb16.isChecked())
                     cb17.setChecked(false);
                 cb18.setChecked(false);
             }
         });

         cb17.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb17.isChecked())
                     cb16.setChecked(false);
                 cb18.setChecked(false);
             }
         });

         cb18.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb18.isChecked())
                     cb16.setChecked(false);
                 cb17.setChecked(false);
             }
         });//FIM

         /**ORGANIZAÇÃO DA APRESENTAÇÃO**/
         cb19.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb19.isChecked())
                     cb20.setChecked(false);
                 cb21.setChecked(false);
             }
         });

         cb20.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb20.isChecked())
                     cb19.setChecked(false);
                 cb21.setChecked(false);
             }
         });

         cb21.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb21.isChecked())
                     cb19.setChecked(false);
                 cb20.setChecked(false);
             }
         });//FIM

         /**UTILIZAÇÃO DOS RECURSOS**/
         cb22.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb22.isChecked())
                     cb23.setChecked(false);
                 cb24.setChecked(false);
             }
         });

         cb23.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb23.isChecked())
                     cb22.setChecked(false);
                 cb24.setChecked(false);
             }
         });

         cb24.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb24.isChecked())
                     cb22.setChecked(false);
                 cb23.setChecked(false);
             }
         });//FIM

         /**POSTURA DOS INTEGRANTES**/
         cb25.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb25.isChecked())
                     cb26.setChecked(false);
                 cb27.setChecked(false);
             }
         });

         cb26.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb26.isChecked())
                     cb25.setChecked(false);
                 cb27.setChecked(false);
             }
         });

         cb27.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb27.isChecked())
                     cb25.setChecked(false);
                 cb26.setChecked(false);
             }
         });//FIM

         /**USO DO TEMPO**/
         cb28.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb28.isChecked())
                     cb29.setChecked(false);
                 cb30.setChecked(false);
             }
         });

         cb29.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb29.isChecked())
                     cb28.setChecked(false);
                 cb30.setChecked(false);
             }
         });

         cb30.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (cb30.isChecked())
                     cb28.setChecked(false);
                 cb29.setChecked(false);
             }

             });//FIM

//    public FormularioFragment() {
//             // Required empty public constructor
//         }
//
//

//
//         // TODO: Rename and change types and number of parameters
//         public static FormularioFragment newInstance() {
//             FormularioFragment fragment = new FormularioFragment();
//             Bundle args = new Bundle();
//             fragment.setArguments(args);
//             return fragment;
//         }
//
//         @Override
//         public void onCreate (Bundle savedInstanceState){
//             super.onCreate(savedInstanceState);
//             if (getArguments() != null) {
//
//
//             }

//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_formulario, container, false);
//    }
     }

 }


