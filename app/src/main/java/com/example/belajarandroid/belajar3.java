package com.example.belajarandroid;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class belajar3 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belajar_3);

    }


    public void printToLog(View view) {
        TextView textViewite1 = findViewById(R.id.menu_item_1);
        String menuItem1 = textViewite1.getText().toString();
        Log.v("belajar3", menuItem1);

        TextView textViewite2 = findViewById(R.id.menu_item_2);
        String menuItem2 = textViewite2.getText().toString();
        Log.v("belajar3", menuItem2);

        TextView textViewite3 = findViewById(R.id.menu_item_3);
        String menuItem3 = textViewite3.getText().toString();
        Log.v("belajar3", menuItem3);


    }


}
