package com.example.applicationdemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidServiceDemo extends AppCompatActivity {

    Button startService, stopService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_service);
        Log.d("MyServiceMessage","Service is Created");

        startService = (Button)findViewById(R.id.button1);
        stopService = (Button)findViewById(R.id.button2);

        startService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(getCurrentFocus());
            }
        });

        stopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(getCurrentFocus());
            }
        });
    }

    public void startService(View view)
    {
        startService(new Intent(getBaseContext(), MyServiceDemo.class));
    }

    public void stopService(View view)
    {
        stopService(new Intent(getBaseContext(), MyServiceDemo.class));
    }

}