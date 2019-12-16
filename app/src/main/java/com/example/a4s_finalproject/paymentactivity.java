package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;

public class paymentactivity extends AppCompatActivity {
    EditText edt_cardname,edt_cardnumber,edt_expdate,edt_cvv;
    Button btn_submit;
    private int year,month, day;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentactivity);
    }
}
