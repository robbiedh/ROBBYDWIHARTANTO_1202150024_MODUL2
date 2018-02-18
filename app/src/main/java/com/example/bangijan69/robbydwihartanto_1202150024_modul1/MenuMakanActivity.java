package com.example.bangijan69.robbydwihartanto_1202150024_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class MenuMakanActivity extends AppCompatActivity {
    String[] item_list={
            "Nasi Goreng","Mie Goreng Special","mie Kuah Spesial", "sate Madura","nasi wagyu",
            "mei Kuah Upnormal", "nasi goreg bawang"
    };
    Integer[] img_list={
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
           };

    String[] harga_list ={"15.000","10.000","10.000","10.000","25.000","30.000","15.000",
    };
    String[] komposisi ={"gandum, terigu,garam,tepung,cabai ","susu, keju, bawang, garam, mrica,dan lain lain","bawang , cabai, kunyit, laos, ketumbar, daun jeruk",
"gandum,terigu,gula,kemangi,gula jawa,kelapa,santan, laos","daun singkok, bawang,jamur tiram, ketumbar, kemiri, daun seledri,daun pisang","tauge, bawang,daun seledri","santan,kelapa, daun pisang, pepasya, nanas"    };
ListView listview;
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makan);

        toolbar =(Toolbar)findViewById(R.id.toolbar_menuutama);
        toolbar.setTitle("EAD Resto");
        setSupportActionBar(toolbar);

        listadaptor adapter=new listadaptor(this, item_list, img_list, harga_list);
        listview=(ListView)findViewById(R.id.ini_list);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String Slecteditem= item_list[+position];
                Integer Slectedimg =img_list[+position];
                String Slectedharga =harga_list[+position];
                String Selectkomposisi =komposisi[+position];

                Intent intent = new Intent(MenuMakanActivity.this, detail_menu.class);
                intent.putExtra("select_item", Slecteditem);
                intent.putExtra("select_img",Slectedimg);
                intent.putExtra("select_harag",Slectedharga);
                intent.putExtra("select_komposisi",Selectkomposisi);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
