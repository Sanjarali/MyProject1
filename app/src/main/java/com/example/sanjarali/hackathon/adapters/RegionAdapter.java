package com.example.sanjarali.hackathon.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.sanjarali.hackathon.R;
import com.example.sanjarali.hackathon.models.Nogiron;
import com.example.sanjarali.hackathon.models.Region;

import java.util.ArrayList;

/**
 * Created by Sanjarali on 02.12.2017.
 */

public class RegionAdapter extends BaseAdapter {
    private ArrayList<Region> informations;

    public RegionAdapter(ArrayList<Region> informations) {
        this.informations = informations;
    }

    @Override
    public int getCount() {
        return informations.size();
    }

    @Override
    public Region getItem(int i) {
        return informations.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_region,viewGroup,false);
        TextView textView=view.findViewById(R.id.regionText);
        TextView textView1=view.findViewById(R.id.gorod);
        Region region=getItem(i);

        textView.setText(region.getRegion());
        textView1.setText("+"+region.getWorksNumber());
        return view;
    }
}
