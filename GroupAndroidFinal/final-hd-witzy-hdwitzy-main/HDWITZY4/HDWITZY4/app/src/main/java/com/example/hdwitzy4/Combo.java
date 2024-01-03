package com.example.hdwitzy4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Combo extends AppCompatActivity {

    Double Combo1 = 5.50;
    Double Combo2 = 6.25;
    Double Combo3 = 6.0;
    Double Combo4 = 4.0;
    Double Combo5 = 6.50;
    Double Combo6 = 5.75;
    Double Combo7 = 5.25;
    Double Total = 0.0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button Combo1bttn = findViewById(R.id.Combo1);
        Button Combo2bttn = findViewById(R.id.Combo2);
        Button Combo3bttn = findViewById(R.id.Combo3);
        Button Combo4bttn = findViewById(R.id.Combo4);
        Button Combo5bttn = findViewById(R.id.Combo5);
        Button Combo6bttn = findViewById(R.id.Combo6);
        Button Combo7bttn = findViewById(R.id.Combo7);

//        ######### COMBO BUTTONS ##########

        Combo1bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Total += Combo1;
            }
        });

        Combo2bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Total += Combo2;
            }
        });

        Combo3bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Total += Combo3;
            }
        });

        Combo4bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Total += Combo4;
            }
        });

        Combo5bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Total += Combo5;
            }
        });

        Combo6bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Total += Combo6;
            }
        });

        Combo7bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Total += Combo7;
            }
        });



//          ######### NAVIGATION BUTTONS #########


//        MAKE THIS THE NAV BUTTONS
//        Combo7bttn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Total += Combo7;
//            }
//        });

        Toast.makeText(Combo.this, "Item Added", Toast.LENGTH_SHORT).show();

    }
}


