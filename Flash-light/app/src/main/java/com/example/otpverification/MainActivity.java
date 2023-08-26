package com.example.otpverification;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.otpverification.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CameraManager camManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        final String[] cameraId = {null};
        getSupportActionBar().hide();

        binding.buttonLaBava.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                if(binding.buttonLaBava.getText().toString().equals("Turn On")){

//                     change the image and text on the button
                    binding.imageLaBava.setImageResource(R.drawable.flashon);
                    binding.buttonLaBava.setText("Turn Off");

//                     to turn on the flash light
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                         camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);

                        try {
                            cameraId[0] = camManager.getCameraIdList()[0];
                            camManager.setTorchMode(cameraId[0], true);   //Turn ON
                        } catch (CameraAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }else{
                    binding.imageLaBava.setImageResource(R.drawable.flashoff);
                    binding.buttonLaBava.setText("Turn On");

                    try {
                        camManager.setTorchMode(cameraId[0], false);
                    } catch (CameraAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        });



            }

    @Override
    protected void onStart() {
        super.onStart();
        binding.buttonLaBava.setText("Turn On");
    }
}
