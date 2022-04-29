package com.example.healthibyte;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaterialToolbar toolbar = findViewById(R.id.toappbar);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawerLayout.openDrawer(GravityCompat.START);

            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @org.jetbrains.annotations.NotNull MenuItem item) {

                int id = item.getItemId();
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (id)
                {

                    case R.id.nav_home:
                        Toast.makeText(MainActivity.this, "Home is Clicked", Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_profile:
                        Toast.makeText(MainActivity.this, "Profile is Clicked",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_prescription:
                        Toast.makeText(MainActivity.this, "Medication is Clicked",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_caloriecounter:
                        Toast.makeText(MainActivity.this, "Calorie counter is Clicked",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_dietplanner:
                        Toast.makeText(MainActivity.this, "Diet Planner is Clicked",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_Exerciseroutines:
                        Toast.makeText(MainActivity.this, "Exercise Routines is Clicked",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_Alert:
                        Toast.makeText(MainActivity.this, "Set Reminder is clicked",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_appointadoc:
                        Toast.makeText(MainActivity.this, "Appoint a doctor is Clicked",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_epharmastore:
                        Toast.makeText(MainActivity.this, "e-pharmacy store is Clicked",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_rewards:
                        Toast.makeText(MainActivity.this, "Rewards is Clicked",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_settings:
                        Toast.makeText(MainActivity.this, "Settings is Clicked",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_aboutus:
                        Toast.makeText(MainActivity.this, "About us is Clicked",Toast.LENGTH_SHORT).show();break;

                    default:
                        return true;

                }
                return true;
            }
        });


    }
}