package com.kevappsgaming.esc_admin.ui.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.kevappsgaming.esc_admin.MainActivity;
import com.kevappsgaming.esc_admin.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        Thread myThread = new Thread(){
            @Override
            public void run(){
                try{
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}

