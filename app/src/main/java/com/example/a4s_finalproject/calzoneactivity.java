package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class calzoneactivity extends AppCompatActivity {
    GridView gridView;

    int[] imageIcons = {R.drawable.pepperonicalzone, R.drawable.beconcalzone, R.drawable.greencalzone, R.drawable.mashrromcalzone,
            R.drawable.pineapplecalzone, R.drawable.onioncalone, R.drawable.tomatocalzone};
    String[] numbers = {
            "Pepperoni", "Bacon", "Green pepper",
            "Mashroom", "Pineapple", "Onion",
            "Tomato & Hot Pepper"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calzoneactivity);
    }
}
