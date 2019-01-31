package com.example.anggarisky.majournal;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ConThemeAct extends AppCompatActivity {

    String getThemeku;
    String themeku = "";
    String SHARED_PREFS = "codeTheme";

    TextView subtitlepage;
    Button btncontinue;
    ImageView icontheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con_theme);

        subtitlepage = findViewById(R.id.subtitlepage);
        btncontinue = findViewById(R.id.btncontinue);
        icontheme = findViewById(R.id.icontheme);

        changeOurTheme();

    }

    public void changeOurTheme(){

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        getThemeku = sharedPreferences.getString(themeku, "");

        if(getThemeku.equals("blue")) {
            icontheme.setImageResource(R.drawable.icmob);
            btncontinue.setBackgroundResource(R.drawable.bgblue);
            subtitlepage.setText("The water is beautiful of blue");
        }
        else if(getThemeku.equals("green")) {
            icontheme.setImageResource(R.drawable.icmog);
            btncontinue.setBackgroundResource(R.drawable.bggreen);
            subtitlepage.setText("Nature and Green are friends");
        }
        else if(getThemeku.equals("purple")) {
            icontheme.setImageResource(R.drawable.icmop);
            btncontinue.setBackgroundResource(R.drawable.bgpurple);
            subtitlepage.setText("Shiny even in the dark");
        }
        else if(getThemeku.equals("orange")) {
            icontheme.setImageResource(R.drawable.icmoc);
            btncontinue.setBackgroundResource(R.drawable.bgorange);
            subtitlepage.setText("Orange is like a yellow");
        }

    }

}
