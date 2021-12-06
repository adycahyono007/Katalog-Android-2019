package com.example.topandroid2019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAndroids;
    private ArrayList<Android> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAndroids = findViewById(R.id.rv_android);
        rvAndroids.setHasFixedSize(true);

        list.addAll(AndroidData.getListData());
        showRecyclerList();
    }
    private void showSelectedAndroid(Android android) {
        Toast.makeText(this, "Kamu memilih " + android.getName(), Toast.LENGTH_SHORT).show();
    }

    private void showRecyclerList() {
        rvAndroids.setLayoutManager(new LinearLayoutManager(this));
        ListAndroidAdapter listHeroAdapter = new ListAndroidAdapter(list,this);
        rvAndroids.setAdapter(listHeroAdapter);

        listHeroAdapter.setOnItemClickCallback( new ListAndroidAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Android android) {
                showSelectedAndroid(android);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.android_list:
                Intent androidintent=new Intent(MainActivity.this,AboutActivity.class);
                startActivity(androidintent);
                break;
        }
    }


}
