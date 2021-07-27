package com.workspace.recyclerviewsubmit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.workspace.recyclerviewsubmit.model.bukuAdapter;
import com.workspace.recyclerviewsubmit.resources.Buku;
import com.workspace.recyclerviewsubmit.resources.BukuData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMenu;
    private ArrayList<Buku> list;
    Toolbar toolBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMenu = findViewById(R.id.rvMenu);
        rvMenu.setHasFixedSize(true);

        list = new ArrayList<Buku>();

        list.addAll(BukuData.getListData());
        showRecyclerViewBook();

        String title = "Buku Jalanan Online";
        setActionBar(title);





    }



    private void showRecyclerViewBook(){
        rvMenu.setLayoutManager(new LinearLayoutManager(this));
        bukuAdapter BukuAdapter = new bukuAdapter(MainActivity.this,list);
        rvMenu.setAdapter(BukuAdapter);
    }

    //membuat icon menu diatas kanan
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
            case R.id.profile:
                Intent userProfile = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(userProfile);
                break;
        }
    }

    //mengganti title actionbar
    private void setActionBar(String title){
        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle(title);
        }
    }
}
