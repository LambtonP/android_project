package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class homepagescrolling extends AppCompatActivity {

    LinearLayout lyt_Pizza, lyt_calzones, lyt_pasta, lyt_wings, lyt_frechfries, lyt_soda;
    TextView txt_frenchfry;
    // SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepagescrolling);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepagescrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        lyt_Pizza =  findViewById(R.id.pizza);
        // searchView = findViewById(R.id.search);
        lyt_calzones =  findViewById(R.id.calzone);
        lyt_pasta = findViewById(R.id.pasta);
        lyt_wings =  findViewById(R.id.chickenwings);
        lyt_frechfries =  findViewById(R.id.frechfries);
        txt_frenchfry =  findViewById(R.id.frenchfry);
        lyt_soda =  findViewById(R.id.soda);

    }
}
