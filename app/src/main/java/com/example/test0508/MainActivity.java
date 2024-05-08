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

        List<stuData> listData = new ArrayList<>();
        listData.add(new stuData("1", "John", "180"));
        listData.add(new stuData("2", "Tom", "175"));
        listData.add(new stuData("3", "Jerry", "170"));
        listData.add(new stuData("4", "Mike", "165"));
        listData.add(new stuData("5", "Jack", "160"));
        listData.add(new stuData("6", "Rose", "155"));
        listData.add(new stuData("7", "Lily", "150"));
        listData.add(new stuData("8", "Lucy", "145"));
        listData.add(new stuData("9", "Linda", "140"));
        listData.add(new stuData("10", "Marry", "135"));

        recyclerView.setAdapter(new stuDataact(listData));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}