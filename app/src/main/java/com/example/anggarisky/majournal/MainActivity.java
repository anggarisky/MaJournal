package com.example.anggarisky.majournal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btngreen, btnblue, btnpurple, btnorange, btnsave;
    View holderbg, dynamicbg;

    String SHARED_PREFS = "codeTheme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the id
        btnsave = findViewById(R.id.btnsave);

        // give an event to next activity
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,ConThemeAct.class);
                startActivity(a);
            }
        });

        btngreen = findViewById(R.id.btngreen);
        btnblue = findViewById(R.id.btnblue);
        btnpurple = findViewById(R.id.btnpurple);
        btnorange = findViewById(R.id.btnorange);

        holderbg = findViewById(R.id.holderbg);
        dynamicbg = findViewById(R.id.dynamicbg);

        // set the first-time background
        holderbg.setBackgroundResource(R.drawable.bggreen);
        holderbg.setScaleY(3);
        holderbg.setScaleX(3);

            // set the scale of button clicked
            btngreen.setScaleY(1.5f);
            btngreen.setScaleX(1.5f);

            // save to local storage (default)
            String themeku = "";
            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(themeku, "green");
            editor.apply();

        // set function of changing theme
        btnblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // scale animation
                btnblue.animate().translationY(20).scaleX(1.5f).scaleY(1.5f).setDuration(350).start();

                // default the scale buttons
                btngreen.animate().translationY(0).scaleX(1).scaleY(1).setDuration(350).start();
                btnpurple.animate().translationY(0).scaleX(1).scaleY(1).setDuration(350).start();
                btnorange.animate().translationY(0).scaleX(1).scaleY(1).setDuration(350).start();

                // change the background
                dynamicbg.setBackgroundResource(R.drawable.bgblue);
                dynamicbg.animate().scaleX(3).scaleY(3).setDuration(800).start();

                // change color of button
                btnsave.setTextColor(Color.parseColor("#3498db"));

                // save to local storage
                String themeku = "";
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(themeku, "blue");
                editor.apply();

                // timer for change the holderbg
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        holderbg.setScaleX(3);
                        holderbg.setScaleY(3);
                        holderbg.setBackgroundResource(R.drawable.bgblue);
                        dynamicbg.setScaleX(0);
                        dynamicbg.setScaleY(0);
                    }
                }, 850);

            }
        });

        // set function of changing theme
        btngreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // scale animation
                btngreen.animate().scaleX(1.5f).scaleY(1.5f).setDuration(350).start();

                // default the scale buttons
                btnblue.animate().translationY(0).scaleX(1).scaleY(1).setDuration(350).start();
                btnpurple.animate().translationY(0).scaleX(1).scaleY(1).setDuration(350).start();
                btnorange.animate().translationY(0).scaleX(1).scaleY(1).setDuration(350).start();

                // change the background
                dynamicbg.setBackgroundResource(R.drawable.bggreen);
                dynamicbg.animate().scaleX(3).scaleY(3).setDuration(800).start();

                // change color of button
                btnsave.setTextColor(Color.parseColor("#1bac9c"));

                // save to local storage
                String themeku = "";
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(themeku, "green");
                editor.apply();

                // timer for change the holderbg
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        holderbg.setScaleX(3);
                        holderbg.setScaleY(3);
                        holderbg.setBackgroundResource(R.drawable.bggreen);
                        dynamicbg.setScaleX(0);
                        dynamicbg.setScaleY(0);
                    }
                }, 850);

            }
        });

        // set function of changing theme
        btnpurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // scale animation
                btnpurple.animate().translationY(20).scaleX(1.5f).scaleY(1.5f).setDuration(350).start();

                // default the scale buttons
                btnblue.animate().translationY(0).scaleX(1).scaleY(1).setDuration(350).start();
                btngreen.animate().translationY(0).scaleX(1).scaleY(1).setDuration(350).start();
                btnorange.animate().translationY(0).scaleX(1).scaleY(1).setDuration(350).start();

                // change the background
                dynamicbg.setBackgroundResource(R.drawable.bgpurple);
                dynamicbg.animate().scaleX(3).scaleY(3).setDuration(800).start();

                // change color of button
                btnsave.setTextColor(Color.parseColor("#E03FA2"));

                // save to local storage
                String themeku = "";
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(themeku, "purple");
                editor.apply();

                // timer for change the holderbg
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        holderbg.setScaleX(3);
                        holderbg.setScaleY(3);
                        holderbg.setBackgroundResource(R.drawable.bgpurple);
                        dynamicbg.setScaleX(0);
                        dynamicbg.setScaleY(0);
                    }
                }, 850);

            }
        });

        // set function of changing theme
        btnorange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // scale animation
                btnorange.animate().translationY(20).scaleX(1.5f).scaleY(1.5f).setDuration(350).start();

                // default the scale buttons
                btngreen.animate().translationY(0).scaleX(1).scaleY(1).setDuration(350).start();
                btnblue.animate().translationY(0).scaleX(1).scaleY(1).setDuration(350).start();
                btnpurple.animate().translationY(0).scaleX(1).scaleY(1).setDuration(350).start();

                // change the background
                dynamicbg.setBackgroundResource(R.drawable.bgorange);
                dynamicbg.animate().scaleX(3).scaleY(3).setDuration(800).start();

                // change color of button
                btnsave.setTextColor(Color.parseColor("#FF8D7E"));

                // save to local storage
                String themeku = "";
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(themeku, "orange");
                editor.apply();

                // timer for change the holderbg
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        holderbg.setScaleX(3);
                        holderbg.setScaleY(3);
                        holderbg.setBackgroundResource(R.drawable.bgorange);
                        dynamicbg.setScaleX(0);
                        dynamicbg.setScaleY(0);
                    }
                }, 850);

            }
        });
    }
}
