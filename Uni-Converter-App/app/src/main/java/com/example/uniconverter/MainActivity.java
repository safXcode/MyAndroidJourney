package com.example.uniconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAns;
    EditText evValue;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAns = findViewById(R.id.tvAns);
        evValue = findViewById(R.id.evValue);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value = Integer.parseInt(String.valueOf(evValue.getText()));
                double finalValue = value * 2.205;
                tvAns.setText("the corresponding result in pound is" + " " +  finalValue);
            }
        });

    }
}