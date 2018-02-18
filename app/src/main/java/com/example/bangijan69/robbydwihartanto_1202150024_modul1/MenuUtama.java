package com.example.bangijan69.robbydwihartanto_1202150024_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {

    Toolbar toolbar;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        toolbar =(Toolbar)findViewById(R.id.toolbar_menuutama);
        toolbar.setTitle("EAD Resto");
        setSupportActionBar(toolbar);
        Toast.makeText(MenuUtama.this," ROBBYDWIHARTANTO_1202150024  ",Toast.LENGTH_SHORT).show();


    }
    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void one(View view) {
        count=1;
    }

    public void two(View view) {
        count=2;

    }

    public void pilih_sekarang(View view) {
        if(count==1){
            Intent myIntent = new Intent(MenuUtama.this,
                    DetailCostumerActivity.class);
            startActivity(myIntent);
        }if (count==2){
            Intent myIntent = new Intent(MenuUtama.this,
                    IdentitasPemesanActivity.class);
            startActivity(myIntent);
        }else{
        }

    }
}
