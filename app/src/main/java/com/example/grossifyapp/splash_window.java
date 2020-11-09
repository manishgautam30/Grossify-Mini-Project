package com.example.grossifyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.*;

public class splash_window extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splashwindow);
            Timer time = new Timer();
            time.schedule(new TimerTask() {
                @Override
                public void run() {
                    Intent in = new Intent(splash_window.this, MainActivity.class);
                    startActivity(in);
                    finish();
                }
            }, 2000);       // Splash window's time is taken of 2 seconds
        }
}
