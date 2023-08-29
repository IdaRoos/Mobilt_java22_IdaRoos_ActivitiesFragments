package com.example.activitiesfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView im = findViewById(R.id.imageView3);
        im.setRotation(20);
        // im.setRotationX(95);
        // im.setRotationY(95);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Ida", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Ida", "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Ida", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Ida", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Ida", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Ida", "onResume");
    }
}