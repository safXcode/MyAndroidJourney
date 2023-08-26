package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rc;
    String[] arr = {"andriod is fun", "testing", "lol","andriod is fun", "testing", "lol","andriod is fun", "testing", "lol","andriod is fun", "testing", "lol","andriod is fun", "testing", "lol"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rc = findViewById(R.id.rc);

//        you have to use layout manger  here

        rc.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter saf =  new CustomAdapter(arr);
        rc.setAdapter(saf);

    }
}