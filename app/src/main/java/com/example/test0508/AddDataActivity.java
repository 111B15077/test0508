package com.example.test0508;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AddDataActivity extends AppCompatActivity {

    private TextView addName;
    private TextView addHeight;
    private TextView addUrl;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);

        addName = findViewById(R.id.edAddName);
        addHeight = findViewById(R.id.edAddHeight);
        addUrl = findViewById(R.id.edAddImgURL);

        intent = getIntent();
        String name = intent.getStringExtra("name");
        String height = intent.getStringExtra("height");
        String url = intent.getStringExtra("url");

        addName.setText(name);
        addHeight.setText(height);
        addUrl.setText(url);

    }

    public void goBack(View view) {
        Intent intent = getIntent();
        String name = addName.getText().toString();
        String height = addHeight.getText().toString();
        String url = addUrl.getText().toString();

        intent.putExtra("name", name);
        intent.putExtra("height", height);
        intent.putExtra("url", url);
        setResult(RESULT_OK, intent);
        finish();
    }
}