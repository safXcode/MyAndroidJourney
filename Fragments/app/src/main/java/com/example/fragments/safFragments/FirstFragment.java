package com.example.fragments.safFragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fragments.R;
import com.example.fragments.SecondActivity;

public class FirstFragment extends Fragment {

    Button btnAnotherActivity;



    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        btnAnotherActivity = view.findViewById(R.id.btnAnotherActivity);

        btnAnotherActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}