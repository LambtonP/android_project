package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class pastaactivity extends AppCompatActivity {
    GridView gridView;
    int[] imageIcons = {R.drawable.pasta3, R.drawable.pasta1, R.drawable.pasta2, R.drawable.images};
    String[] numbers = {
            "Classic Tomato ", "Paprika Chicken", "White beans pasta", "Broccoli style pasta "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastaactivity);

        gridView = findViewById(R.id.gridView2);
        final iconadapter2 iconAdapter = new iconadapter2(this, imageIcons, numbers);
        gridView.setAdapter(iconAdapter);
    }
}
