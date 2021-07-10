package com.example.demoretrofit;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/*public class MyAdapter extends RecyclerView.Adapter<MyAdapter.UserViewHolder> {
    Context context;
    List<model> arr;

    public MyAdapter(Context context, List<model> arr) {
        this.context = context;
        this.arr = arr;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.row, parent, false);
        return new UserViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.tv_Cname.setText(arr.get(position).getCountryname());
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        TextView tv_Cname, tv_lang, tv_cap, tv_code, tv_curnm;
        ImageView iv_flag;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_Cname=itemView.findViewById(R.id.tv_Cname);
        }
    }
}*/

public class MyAdapter extends BaseAdapter{

    Context context;
    List<model> arr;
    TextView tv_Cname, tv_lang, tv_cap, tv_code, tv_curnm;
    ImageView iv_flag;
    public MyAdapter(Context context, List<model> arr) {
        this.context = context;
        this.arr = arr;
    }

    @Override
    public int getCount() {
        return arr.size();
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
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.row, parent, false);
        tv_Cname=v.findViewById(R.id.tv_Cname);
        //tv_Cname.setText(arr.get(position).getCountryname());
        return v;
    }
}
