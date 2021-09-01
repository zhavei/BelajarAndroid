package com.example.belajarandroid;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class belajar1 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belajar_1);
        createWeatherMessage(77, " san Fransisco");


    }

    private void createWeatherMessage(int temperature, String name) {

        String message = "welcome to " + name + " where the temperatur is " + temperature + "F";
        TextView displayON = (TextView) findViewById(R.id.text_view_belajar1);
        displayON.setText(message);
    }

}
