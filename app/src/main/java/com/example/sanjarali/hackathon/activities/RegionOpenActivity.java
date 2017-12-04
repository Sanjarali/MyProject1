package com.example.sanjarali.hackathon.activities;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.sanjarali.hackathon.R;
import com.example.sanjarali.hackathon.adapters.NogironAdapter;
import com.example.sanjarali.hackathon.models.Nogiron;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class RegionOpenActivity extends AppCompatActivity {
    ArrayList<Nogiron>nogirons;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region);

        try {
            loadGrades(null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        listView=findViewById(R.id.regionOpen);
        listView.setDividerHeight(0);
        NogironAdapter adapter=new NogironAdapter(nogirons);
        listView.setAdapter(adapter);
    }
    public void loadGrades(View view) throws JSONException {
        Resources res=getResources();
        InputStream is=res.openRawResource(R.raw.json_file);
        Scanner scanner=new Scanner(is);
        StringBuilder builder=new StringBuilder();
        while(scanner.hasNextLine()){
            builder.append(scanner.nextLine());
        }
        parseJson(builder.toString());
    }
    private void parseJson(String s) throws JSONException {
        JSONArray jsonArray=new JSONArray(s);
        nogirons=new ArrayList<>();
        for (int i = 0; i <jsonArray.length(); i++) {
            JSONObject jsonObject=jsonArray.getJSONObject(i);
            Integer id=jsonObject.getInt("id");
            String g1=jsonObject.getString("G1");
            String g2=jsonObject.getString("G2");
            String g3=jsonObject.getString("G3");
            String g4=jsonObject.getString("G4");
            String g5=jsonObject.getString("G5");
            String g6=jsonObject.getString("G6");
            String g7=jsonObject.getString("G7");
            nogirons.add( new Nogiron(id, g1, g2,g3,g4,g5,g6,g7,".11.2017"));
        }
    }
}
