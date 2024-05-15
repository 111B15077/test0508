package com.example.test0508;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvMyData);
//        String url = "https://img.599ku.com/element_min_new_pic/66/83/4/98/c1b8d90c007462f0737825d110aebceb.png";
        List<stuData> listData = new ArrayList<>();
        listData.add(new stuData("https://img.599ku.com/element_min_new_pic/66/83/4/98/c1b8d90c007462f0737825d110aebceb.png", "Alice", "180"));

        listData.add(new stuData("https://img.599ku.com/element_min_new_pic/66/83/4/98/c1b8d90c007462f0737825d110aebceb.png", "David", "150"));
        listData.add(new stuData("https://img.599ku.com/element_min_new_pic/66/83/4/98/c1b8d90c007462f0737825d110aebceb.png", "Eva", "140"));
        listData.add(new stuData("https://img.599ku.com/element_min_new_pic/66/83/4/98/c1b8d90c007462f0737825d110aebceb.png", "Frank", "130"));
        listData.add(new stuData("https://img.599ku.com/element_min_new_pic/66/83/4/98/c1b8d90c007462f0737825d110aebceb.png", "Grace", "120"));
        listData.add(new stuData("https://img.599ku.com/element_min_new_pic/66/83/4/98/c1b8d90c007462f0737825d110aebceb.png", "Helen", "110"));
        listData.add(new stuData("https://img.599ku.com/element_min_new_pic/66/83/4/98/c1b8d90c007462f0737825d110aebceb.png", "Ivy", "100"));
        listData.add(new stuData("https://img.599ku.com/element_min_new_pic/66/83/4/98/c1b8d90c007462f0737825d110aebceb.png", "Jack", "90"));



        recyclerView.setAdapter(new stuDataact(listData));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}