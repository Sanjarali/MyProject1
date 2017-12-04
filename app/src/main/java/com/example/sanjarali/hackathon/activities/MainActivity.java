package com.example.sanjarali.hackathon.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.sanjarali.hackathon.R;
import com.example.sanjarali.hackathon.adapters.NogironAdapter;
import com.example.sanjarali.hackathon.adapters.RegionAdapter;
import com.example.sanjarali.hackathon.models.Nogiron;
import com.example.sanjarali.hackathon.models.Region;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, AdapterView.OnItemClickListener {
    ArrayList<Region>regions;
    ListView listView;
    Button button;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button=findViewById(R.id.buttonOk);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        listView=findViewById(R.id.regionList);
        loadRegion();
        RegionAdapter adapter=new RegionAdapter(regions);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void loadRegion(){
        regions=new ArrayList<>();
        regions.add(new Region("Sirdaryo viloyati",165));
        regions.add(new Region("Toshkent viloyati",200));
        regions.add(new Region("Samarqand viloyati",247));
        regions.add(new Region("Navoiy viloyati",158));
        regions.add(new Region("Buxoro viloyati",142));
        regions.add(new Region("Xorazm viloyati",92));
        regions.add(new Region("Qashqadaryo viloyati",84));
        regions.add(new Region("Surxondaryo viloyati",137));
        regions.add(new Region("Jizzax viloyati",123));
        regions.add(new Region("Namangan viloyati",171));
        regions.add(new Region("Andijon viloyati",57));
        regions.add(new Region("Farg'ona viloyati",63));
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Region region=regions.get(i);
        if (region.getRegion().toString()=="Sirdaryo viloyati"){
            startActivity(new Intent(this,RegionOpenActivity.class));
        }
    }
}
