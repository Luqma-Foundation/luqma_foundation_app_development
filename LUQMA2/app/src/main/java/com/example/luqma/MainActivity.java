package com.example.luqma;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbars;


   // @Override
    protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_1);

        drawerLayout = findViewById(R.id.layout);
        navigationView = findViewById(R.id.navigation_view);

       // Toolbar toolbars = findViewById(R.id.toolbars);
       // setSupportActionBar(toolbars);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbars,R.string.navigation_open,R.string.navigation_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

    }
}