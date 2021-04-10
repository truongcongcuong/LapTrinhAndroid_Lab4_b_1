package com.example.ltdd_lab4_b_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frameContent,FrgRecyclerView.newInstance()).commit();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.framTop,FragTop.newInstance("Chat")).commit();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.framBot, Frag_Bot.newInstance()).commit();
    }
}