package com.example.demoretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RetroAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<model> dataModelArrayList;
    TextView tvname, tvcountry, tvcity;
    ImageView iv;

    public RetroAdapter(Context context, ArrayList<model> dataModelArrayList) {
        this.context = context;
        this.dataModelArrayList = dataModelArrayList;
    }

    @Override
    public int getCount() {
        return dataModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.retro_lv, null, true);

        iv = (ImageView) convertView.findViewById(R.id.iv);
        tvname = (TextView) convertView.findViewById(R.id.name);
        tvcountry = (TextView) convertView.findViewById(R.id.country);
        tvcity = (TextView) convertView.findViewById(R.id.city);

        /*Picasso.get().load(dataModelArrayList.get(position).getImgURL()).into(iv);
        tvname.setText("Name: " + dataModelArrayList.get(position).getName());
        tvcountry.setText("Country: " + dataModelArrayList.get(position).getCountry());
        tvcity.setText("City: " + dataModelArrayList.get(position).getCity());*/


        return convertView;
    }
}
