package com.example.sanjarali.hackathon.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sanjarali.hackathon.R;
import com.example.sanjarali.hackathon.models.Nogiron;

import java.util.ArrayList;

/**
 * Created by Sanjarali on 02.12.2017.
 */

public class NogironAdapter extends BaseAdapter {
    private ArrayList<Nogiron> data;
    public NogironAdapter(ArrayList<Nogiron> data) {
        this.data = data;
    }
    int k=30;
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Nogiron getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list,viewGroup,false);
        TextView idText=view.findViewById(R.id.idText);
        TextView g2Text=view.findViewById(R.id.g2_Text);
        TextView g5Text=view.findViewById(R.id.g5_Text);
        TextView g6Text=view.findViewById(R.id.g6_Text);
        TextView date=view.findViewById(R.id.date);
        Nogiron n=getItem(i);
        idText.setText("Эълон: "+String.valueOf(n.getId()));
        g2Text.setText("Худуд номи:"+" "+n.getG2());
        g5Text.setText("Ташкилот номи:"+" "+n.getG5());
        g6Text.setText("Иш ўринлари сони:"+" "+n.getG6());
        date.setText(String.valueOf(dateFunc())+n.getDate());
        return view;
    }
    private int dateFunc() {

        if (k==0){
            k=30;
        }
        return k--;
    }

}
