package com.example.rahadithiaprayudha.cobaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.view.ViewGroup;

public class tajwid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajwid);
    }

    public void idghom(View view) {
        Intent intentbaca = new Intent(tajwid.this, idghom.class);
        startActivity(intentbaca);
    }
    public void pendahuluan(View view) {
        Intent intentbaca = new Intent(tajwid.this, pendahuluan.class);
        startActivity(intentbaca);
    }

    public void ikhfa(View view) {
        Intent intentbaca = new Intent(tajwid.this, ikhfa.class);
        startActivity(intentbaca);
    }

    public void iqlab(View view) {
        Intent intentbaca = new Intent(tajwid.this, iqlab.class);
        startActivity(intentbaca);

    }

    public void izhar(View view) {
        Intent intentbaca = new Intent(tajwid.this, izhar.class);
        startActivity(intentbaca);
    }
}
