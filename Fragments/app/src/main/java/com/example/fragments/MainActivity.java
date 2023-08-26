package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.fragments.safFragments.FirstFragment;
import com.example.fragments.safFragments.SecondFragment;

public class MainActivity extends AppCompatActivity {

    Button button, button2;
    LinearLayout targetLinear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        targetLinear = findViewById(R.id.targetLinear);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirstFragment firstFragment = new FirstFragment();
                FragmentTransaction safTransaction = getSupportFragmentManager().beginTransaction();
                safTransaction.replace(R.id.targetLinear,firstFragment);
                safTransaction.commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment secondFragment = new SecondFragment();
                FragmentTransaction safTransaction = getSupportFragmentManager().beginTransaction();
                safTransaction.replace(R.id.targetLinear,secondFragment);
                safTransaction.commit();
            }
        });
    }
}