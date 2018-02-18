package com.example.bangijan69.robbydwihartanto_1202150024_modul1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by bangijan69 on 2/17/2018.
 */

public class listadaptor extends ArrayAdapter<String> {


    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    private final String[] harga;

    public listadaptor(Activity context, String[] itemname, Integer[] imgid ,String[] harga) {
        super(context, R.layout.list, itemname);
        // TODO Auto-generated constructor stub
        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
        this.harga=harga;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.text_list);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img_list);
        TextView extratxt = (TextView) rowView.findViewById(R.id.harga_list);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText("Harga: Rp "+harga[position]);
        return rowView;

    };


}
