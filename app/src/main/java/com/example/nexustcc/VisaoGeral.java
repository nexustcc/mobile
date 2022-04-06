package com.example.nexustcc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;


import com.google.android.material.navigation.NavigationView;

public class VisaoGeral extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visao_geral);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, null, R.string.abrir_drawer, R.string.fechar_drawer);
        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.navView);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {

                case R.id.item_menu_visao_geral: {
                    Log.d("TESTE-MENU", String.valueOf(item.getItemId()));
                    startActivity(new Intent(this, VisaoGeral.class));
                    break;
                }
                case R.id.item_menu_integrantes: {
                    Log.d("TESTE-MENU", String.valueOf(item.getItemId()));
                    startActivity(new Intent(this, Integrantes.class));
                    break;
                }
                case R.id.item_menu_formulário: {
                    Log.d("TESTE-MENU", String.valueOf(item.getItemId()));
                    startActivity(new Intent(this, Formulario.class));
                    break;
                }
                case R.id.menu_sair: {
                    Log.d("TESTE-MENU", String.valueOf(item.getItemId()));
                    startActivity(new Intent(this, Login.class));
                    break;
                }
                default: {
                    Log.d("TESTE-MENU", String.valueOf(item.getItemId()));
                    Toast.makeText(this, "Menu Default", Toast.LENGTH_SHORT).show();
                    break;
                }
            }

            drawerLayout.closeDrawer(GravityCompat.START);

            return true;
        }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }
    }




