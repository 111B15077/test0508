package com.example.test0508;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class Activity_add_data extends AppCompatActivity {

    private EditText addName;
    private EditText addhieght;
    private EditText addURL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);

        addName = findViewById(R.id.addName);
        addhieght = findViewById(R.id.addhieght);
        addURL = findViewById(R.id.addURL);

    }

    public void goback(View view){
        Intent intent = new Intent();
        String name = addName.getText().toString();
        String hieght = addhieght.getText().toString();
        String URL = addURL.getText().toString();
    }

}