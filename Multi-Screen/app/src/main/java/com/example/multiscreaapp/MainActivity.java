package com.example.multiscreaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String MIZAR = "This one should  be different Always";

    EditText etValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValue = findViewById(R.id.etValue);

    }
    public void nextPage(View V){
//        Toast.makeText(this, "my name is Mohammad Safwan", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        String name = etValue.getText().toString();

        intent.putExtra(MIZAR, name);


        startActivity(intent);
    }
}