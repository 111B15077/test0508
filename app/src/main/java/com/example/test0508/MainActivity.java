package com.example.test0508;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
//https://github.com/cflin-cjcu/Test0508
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<StuData> stuDataList;
    private StuDataAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.rvMyData);
        List<stuData> listData = new ArrayList<>();

        listData.add(new stuData("https://img.599ku.com/element_min_new_pic/66/83/4/98/c1b8d90c007462f0737825d110aebceb.png", "Alice", "180"));
        listData.add(new stuData("https://img.599ku.com/element_min_new_pic/66/83/4/98/c1b8d90c007462f0737825d110aebceb.png", "David", "150"));
        listData.add(new stuData("https://img.599ku.com/element_min_new_pic/66/83/4/98/c1b8d90c007462f0737825d110aebceb.png", "Eva", "140"));

        adapter = new stuDataact(listData);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void addData() {
        Intent intent = new Intent(this, Activity_add_data.class);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            String name = data.getStringExtra("name");
            String height = data.getStringExtra("height");
            String url = data.getStringExtra("url");
            stuDataList.add(new StuData(url, name, height));
            adapter.notifyDataSetChanged();
        }

    }




}

