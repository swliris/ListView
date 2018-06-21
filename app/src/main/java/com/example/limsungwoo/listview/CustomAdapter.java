package com.example.limsungwoo.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    ArrayList<Data> items = new ArrayList<>();
    Context mContext;

    public CustomAdapter(ArrayList<Data> items, Context mContext) {
        this.items = items;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.list_main, null);

        TextView bigTitle = v.findViewById(R.id.bigTitle);
        TextView smallTitle = v.findViewById(R.id.smallTitle);

        Data data = items.get(position);

        bigTitle.setText(data.getBigTitle());
        smallTitle.setText(data.getSmallTitle());

        return v;
    }

}