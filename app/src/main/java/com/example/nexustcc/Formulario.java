package com.example.nexustcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Formulario extends AppCompatActivity {

    private CheckBox cb01, cb02, cb03,
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);


    cb01=(CheckBox)findViewById(R.id.cb_clareza_1);
    cb02=(CheckBox)findViewById(R.id.cb_clareza_2);
    cb03=(CheckBox)findViewById(R.id.cb_clareza_3);
    cb04=(CheckBox)findViewById(R.id.cb_objetividade_1);
    cb05=(CheckBox)findViewById(R.id.cb_objetividade_2);
    cb06=(CheckBox)findViewById(R.id.cb_objetividade_3);
    cb07=(CheckBox)findViewById(R.id.cb_exposicao_ideias_1);
    cb08=(CheckBox)findViewById(R.id.cb_exposicao_ideias_2);
    cb09=(CheckBox)findViewById(R.id.cb_exposicao_ideias_3);
    cb10=(CheckBox)findViewById(R.id.cb_dominio_conteudo_1);
    cb11=(CheckBox)findViewById(R.id.cb_dominio_conteudo_2);
    cb12=(CheckBox)findViewById(R.id.cb_dominio_conteudo_3);
    cb13=(CheckBox)findViewById(R.id.cb_capacidade_comunicacao_1);
    cb14=(CheckBox)findViewById(R.id.cb_capacidade_comunicacao_2);
    cb15=(CheckBox)findViewById(R.id.cb_capacidade_comunicacao_3);
    cb16=(CheckBox)findViewById(R.id.cb_argumemtacao_1);
    cb17=(CheckBox)findViewById(R.id.cb_argumemtacao_2);
    cb18=(CheckBox)findViewById(R.id.cb_argumemtacao_3);
    cb19=(CheckBox)findViewById(R.id.cb_organizacao_apresentacao_1);
    cb20=(CheckBox)findViewById(R.id.cb_organizacao_apresentacao_2);
    cb21=(CheckBox)findViewById(R.id.cb_organizacao_apresentacao_3);
    cb22=(CheckBox)findViewById(R.id.cb_utilizacao_recursos_1);
    cb23=(CheckBox)findViewById(R.id.cb_utilizacao_recursos_2);
    cb24=(CheckBox)findViewById(R.id.cb_utilizacao_recursos_3);
    cb25=(CheckBox)findViewById(R.id.cb_postura_integrantes_1);
    cb26=(CheckBox)findViewById(R.id.cb_postura_integrantes_2);
    cb27=(CheckBox)findViewById(R.id.cb_postura_integrantes_3);
    cb28=(CheckBox)findViewById(R.id.cb_uso_do_tempo_1);
    cb29=(CheckBox)findViewById(R.id.cb_uso_do_tempo_2);
    cb30=(CheckBox)findViewById(R.id.cb_uso_do_tempo_3);

        addCheckBoxChecked();

    }

    public void addCheckBoxChecked(){


        /**TODOS ESTÃO COMEÇANDO MARCADOS**/

        //clareza

        cb01.setChecked(true);
        cb01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb01.isChecked())
                    cb02.setChecked(false);
                    cb03.setChecked(false);
            }
        });

        cb02.setChecked(true);
        cb02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb02.isChecked())
                    cb01.setChecked(false);
                cb03.setChecked(false);
            }
        });

        cb03.setChecked(true);
        cb03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb03.isChecked())
                    cb01.setChecked(false);
                cb02.setChecked(false);
            }
        });

        //objetividade

        cb04.setChecked(true);
        cb04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb04.isChecked())
                    cb05.setChecked(false);
                cb06.setChecked(false);
            }
        });

        cb05.setChecked(true);
        cb05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb05.isChecked())
                    cb04.setChecked(false);
                cb06.setChecked(false);
            }
        });

        cb06.setChecked(true);
        cb06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb06.isChecked())
                    cb04.setChecked(false);
                cb05.setChecked(false);
            }
        });

        //fluência na Exposição de Ideias

        cb07.setChecked(true);
        cb07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb07.isChecked())
                    cb08.setChecked(false);
                cb09.setChecked(false);
            }
        });

        cb08.setChecked(true);
        cb08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb08.isChecked())
                    cb07.setChecked(false);
                cb09.setChecked(false);
            }
        });

        cb09.setChecked(true);
        cb09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb09.isChecked())
                    cb07.setChecked(false);
                cb08.setChecked(false);
            }
        });





}
}