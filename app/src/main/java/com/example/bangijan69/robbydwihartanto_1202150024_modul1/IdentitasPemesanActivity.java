package com.example.bangijan69.robbydwihartanto_1202150024_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

public class IdentitasPemesanActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identitas_pemesan);

        toolbar =(Toolbar)findViewById(R.id.toolbar_menuutama);
        toolbar.setTitle("EAD Resto");
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void pili_pesanan(View view) {
        Intent myIntent = new Intent(IdentitasPemesanActivity.this,
                MenuMakanActivity.class);
        startActivity(myIntent);
    }
}
