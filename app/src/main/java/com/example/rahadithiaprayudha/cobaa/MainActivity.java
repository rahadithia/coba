package com.example.rahadithiaprayudha.cobaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AlQuran(View view) {
        Intent intentbaca = new Intent(MainActivity.this, alquran.class);
        startActivity(intentbaca);
    }

    public void tajwid(View view) {
        Intent intentbaca = new Intent(MainActivity.this, tajwid.class);
        startActivity(intentbaca);
    }

    public void tentang(View view) {
        Intent intentbaca = new Intent(MainActivity.this, tentang.class);
        startActivity(intentbaca);

    }
}
