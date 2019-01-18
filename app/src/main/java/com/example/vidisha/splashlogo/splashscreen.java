package com.example.vidisha.splashlogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class splashscreen extends AppCompatActivity {
    private int sleeptime = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        Launch launch = new Launch();
        launch.start();

    }

    private class Launch extends Thread{
        public void run() {
            try {
                sleep(1000*sleeptime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Intent intent = new Intent(splashscreen.this, MainActivity.class);
            startActivity(intent);
            splashscreen.this.finish();
        }
    }
}
