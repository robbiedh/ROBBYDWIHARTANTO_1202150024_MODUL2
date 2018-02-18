package com.example.bangijan69.robbydwihartanto_1202150024_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class detail_menu extends AppCompatActivity {

    ImageView imageView;
    TextView textView1,textView2, textView3;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        toolbar =(Toolbar)findViewById(R.id.toolbar_menuutama);
        toolbar.setTitle("EAD Resto");
        setSupportActionBar(toolbar);
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);




        imageView =(ImageView)findViewById(R.id.img_detail);
        textView1 =(TextView)findViewById(R.id.item_detail);
        textView2 =(TextView)findViewById(R.id.harga_detail);
        textView3 =(TextView)findViewById(R.id.komposisi_detail);

        Intent intent = getIntent();
        String item = intent.getStringExtra("select_item");
        int img = intent.getIntExtra("select_img",0);
        String harga =intent.getStringExtra("select_harag");
        String komposisi =intent.getStringExtra("select_komposisi");

        Log.d("ini adalah", item+img+harga);

        imageView.setImageResource(img);
        textView1.setText(item);
        textView2.setText("Harga : "+harga);
        textView3.setText(komposisi);
        }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
