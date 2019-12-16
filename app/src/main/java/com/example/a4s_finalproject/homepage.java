package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class homepage extends AppCompatActivity {
    CardView listoffood;
    LinearLayout lyt_Pizza, lyt_calzones, lyt_pasta, lyt_wings, lyt_frechfries, lyt_soda;
    TextView txt_frenchfry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        lyt_Pizza = findViewById(R.id.pizza);
        lyt_calzones = findViewById(R.id.calzone);
        lyt_pasta = findViewById(R.id.pasta);
        lyt_wings = findViewById(R.id.chickenwings);
        lyt_frechfries = findViewById(R.id.frechfries);
        txt_frenchfry = findViewById(R.id.frenchfry);
        lyt_soda = findViewById(R.id.soda);
        lyt_Pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pizzalist.class);
                startActivity(intent);
            }
        });
        lyt_calzones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), calzoneactivity.class);
                startActivity(intent);
            }
        });
        lyt_pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pastaactivity.class);
                startActivity(intent);
            }
        });
        lyt_wings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WingsList.class);
                startActivity(intent);
            }
        });
        lyt_frechfries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = txt_frenchfry.getText().toString();
                Intent intent = new Intent(getApplicationContext(), sizeactivity.class);
                Bundle extras = new Bundle();
                extras.putString("PIZZANAME", str);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });
        lyt_soda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), sodapopactivity.class);
                startActivity(intent);
            }
        });
    }
}

