package com.example.nexustcc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;


import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    NavigationView nav;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nav=(NavigationView)findViewById(R.id.navigationView);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawerLayout);

        findViewById(R.id.imagemMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        nav.setItemIconTintList(null);

//        int id = item.getItemId();
//
//        switch (id) {
//            case R.id.visaoGeral:
//                Toast.makeText(this, "Visão Geral Clicada", Toast.LENGTH_SHORT).show();break;
//        }

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.visaoGeral:
                        Toast.makeText(getApplicationContext(),"VISAO GERAL CLICADO",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }

                return true;
            }
        });
    }

}