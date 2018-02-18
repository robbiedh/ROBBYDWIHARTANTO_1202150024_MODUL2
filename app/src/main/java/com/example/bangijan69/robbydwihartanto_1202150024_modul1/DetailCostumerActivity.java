package com.example.bangijan69.robbydwihartanto_1202150024_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class DetailCostumerActivity extends AppCompatActivity {
Toolbar toolbar;
Spinner spinner;
String[] isi_spinner ={
  "meja 1","Meja 2","Meja 3","Meja 4","Meja 5"
};
String temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_costumer);

        toolbar =(Toolbar)findViewById(R.id.toolbar_menuutama);
        toolbar.setTitle("EAD Resto");
        setSupportActionBar(toolbar);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, isi_spinner);

        spinner = (Spinner)findViewById(R.id.spinner_meja);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                setTemp(isi_spinner[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void Pilih_detailCS(View view) {
        Toast.makeText(DetailCostumerActivity.this,"anda memilih  "+getTemp(),Toast.LENGTH_SHORT).show();
    }
}
