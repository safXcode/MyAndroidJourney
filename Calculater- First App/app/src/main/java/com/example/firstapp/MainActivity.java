package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText etFirst , etSecond ;
    TextView tvAnswer;
    Button btnAdd, btnSub , btnMul , btnDiv ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etSecond);

        tvAnswer = findViewById(R.id.tvAnswer);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue , secondValue , ans;

                firstValue = Integer.parseInt(etFirst.getText().toString());
                secondValue = Integer.parseInt(etSecond.getText().toString());

                ans = firstValue + secondValue;

                tvAnswer.setText(String.valueOf(ans));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue , secondValue , ans;

                firstValue = Integer.parseInt(etFirst.getText().toString());
                secondValue = Integer.parseInt(etSecond.getText().toString());

                ans = firstValue - secondValue;

                tvAnswer.setText(String.valueOf(ans));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue , secondValue , ans;

                firstValue = Integer.parseInt(etFirst.getText().toString());
                secondValue = Integer.parseInt(etSecond.getText().toString());

                ans = firstValue * secondValue;

                tvAnswer.setText(String.valueOf(ans));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue , secondValue , ans;

                firstValue = Integer.parseInt(etFirst.getText().toString());
                secondValue = Integer.parseInt(etSecond.getText().toString());

                ans = firstValue / secondValue;

                tvAnswer.setText(String.valueOf(ans));
            }
        });


    }
}