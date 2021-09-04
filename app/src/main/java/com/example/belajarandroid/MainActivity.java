package com.example.belajarandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("hh : mm : ss");
        String time = "waktu sekarang " + "\n" + format.format(calendar.getTime());
        displayTime(time);

        int weekday = 5;
        int weekend = 9;
        int optimalHours = 7 * 8;
        int actualHours = weekday;
        actualHours = weekday + weekend * 2;
        int solution = optimalHours - actualHours;
        display(solution);

        Button buttonToIntent = (Button) findViewById(R.id.intent_to_basket_app);
        buttonToIntent.setOnClickListener(view -> clikButtonIntent());

        Button buttonToBelajar = (Button) findViewById(R.id.intent_to_belajar1);
        buttonToBelajar.setOnClickListener(view -> clikBelajarIntent());

        Button buttonBelajar2 = (Button) findViewById(R.id.intent_to_belajar2);
        buttonBelajar2.setOnClickListener(view -> clikBelajarIntent2());

        Button buttonBelajar3 = (Button) findViewById(R.id.intent_to_belajar3);
        buttonBelajar3.setOnClickListener(view -> clikBelajarIntet3());

        Button buttonToJustJava = (Button) findViewById(R.id.intent_to_just_java);
        buttonToJustJava.setOnClickListener(view -> clikJustJava());


    }

    private void displayTime(String time) {
        TextView displayTime = (TextView) findViewById(R.id.curent_time);
        displayTime.setText("" + time);
    }


    private void display(int solution) {
        TextView displayText = (TextView) findViewById(R.id.solution);
        displayText.setText("" + solution);
    }

    private void clikButtonIntent() {
        Intent intent = new Intent(this, BasketCourtActivity.class);
        startActivity(intent);
    }

    private void clikBelajarIntent() {
        Intent intent = new Intent(this, belajar1.class);
        startActivity(intent);
    }

    private void clikBelajarIntent2() {
        Intent intent = new Intent(this, belajar2.class);
        startActivity(intent);
    }

    private void clikBelajarIntet3() {
        Intent intent = new Intent(this, belajar3.class);
        startActivity(intent);
    }

    private void clikJustJava() {
        Intent intent = new Intent(this, JustJava.class);
        startActivity(intent);
    }


}