package com.example.belajarandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class belajar2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar2);


    }

    public void EatCookie(View view) {
        ImageView beforeEatCookie = (ImageView) findViewById(R.id.image_before_cookie);
        beforeEatCookie.setImageResource(R.drawable.after_cookie);

        TextView statusAfterEat = (TextView) findViewById(R.id.text_before_full);
        statusAfterEat.setText("Im fuul ABiess");
    }




}