package com.example.multiscreaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView tvAns;
    EditText etUrl;
    Button btnUrl, btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvAns = findViewById(R.id.tvAns);
        etUrl = findViewById(R.id.etUrl);
        btnUrl = findViewById(R.id.btnUrl);
        btnEmail = findViewById(R.id.btnEmail);
        Intent intent = getIntent();
        String value = intent.getStringExtra(MainActivity.MIZAR);
        tvAns.setText("your Name Is " + " " + value);

        btnUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Url = etUrl.getText().toString();
//                Toast.makeText(MainActivity2.this, Url, Toast.LENGTH_SHORT).show();


                    Uri webpage = Uri.parse(Url);
                    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                    }

            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String add = "safwanmohd52@gmail.com";
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_EMAIL, add);
                intent.putExtra(Intent.EXTRA_SUBJECT, "my name is mohammad Safwan");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });


    }
}