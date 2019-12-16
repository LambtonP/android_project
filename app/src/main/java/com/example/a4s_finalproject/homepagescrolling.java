package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class homepagescrolling extends AppCompatActivity {

    LinearLayout lyt_Pizza, lyt_calzones, lyt_pasta, lyt_wings, lyt_frechfries, lyt_soda;
    TextView txt_frenchfry;
    // SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepagescrolling);
    }
}
