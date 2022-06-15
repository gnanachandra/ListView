package com.example.fruitsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] items = {"apple","banana","orange","apple","banana","orange","apple","banana","orange","apple","banana","orange","apple","banana","orange","apple","banana","orange","apple","banana","orange"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(ad);
    }
}