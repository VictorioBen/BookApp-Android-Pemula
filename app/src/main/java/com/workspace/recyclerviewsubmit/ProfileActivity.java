package com.workspace.recyclerviewsubmit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        //menggant titlee
        String title = "Owner Buku Jalanan";
        setActionBar(title);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    private void setActionBar(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
