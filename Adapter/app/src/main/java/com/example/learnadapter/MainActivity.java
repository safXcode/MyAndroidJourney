package com.example.learnadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
  ListView listView;
  String[] arr = {"Ani", "Sam", "Joe","Ani", "Sam", "Joe","Ani", "Sam", "Joe","Ani", "Sam", "Joe","Ani", "Sam", "Joe","Ani", "Sam", "Joe","Ani", "Sam", "Joe","Ani", "Sam", "Joe","Ani", "Sam", "Joe","Ani", "Sam", "Joe","Ani", "Sam", "Joe","Ani", "Sam", "Joe", "Mohammad Safwan", "Shakeel", "Boss", "mr.Ahnaf", "tHis is the test View", "Learning the android development"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

//        ArrayAdapter saf = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
//        listView.setAdapter(saf);

        SafwanAdapter safwan = new SafwanAdapter(this, R.layout.my_safwan_layout, arr);
        listView.setAdapter(safwan);
    }
}