package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity
{

    private static final int SPLASH_DURATION = 2000;

    private Handler myHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /**
         * Removes Title Bar
         */
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        /**
         * Removes Notification Bar
         */
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        myHandler = new Handler();

        myHandler.postDelayed(new Runnable() {
            @Override
            public void run()
            {
                SplashScreenActivity.this.startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
            }
        }, SPLASH_DURATION);
    }
}
