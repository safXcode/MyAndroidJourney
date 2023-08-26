package com.example.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvQus;
    Button btnYes, btnNo;

    private String[] qustions  = {"Does java allow overriding static methods ?",
            "Can constructors be synchronized in Java ?", " Can we overload constructors ?",
            "Can we use both \"this\" and \"super\" in a constructor ?", "Can we overload constructors ?", "Can we overload main method in Java ?", "Can we call constructor explicitly ?"};
    private boolean[] answers = {false, false, false, false, true, true, true};
    private int index = 0;
    private int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQus = findViewById(R.id.tvQus);
        btnNo = findViewById(R.id.btnNo);
        btnYes = findViewById(R.id.btnYes);
        tvQus.setText(qustions[index]);

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= qustions.length-1){
                    if (answers[index] == true){
                        score++;
                    }
                    index++;
                    if(index <= qustions.length-1){
                        tvQus.setText(qustions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "You score is " + score + "/"+ qustions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Please Restart The App To Play Again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= qustions.length-1){
                    if (answers[index] == false){
                        score++;
                    }
                    index++;
                    if(index <= qustions.length-1){
                        tvQus.setText(qustions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "You score is " + score + "/"+ qustions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Please Restart The App To Play Again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}