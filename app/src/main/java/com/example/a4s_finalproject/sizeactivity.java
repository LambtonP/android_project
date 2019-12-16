package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class sizeactivity extends AppCompatActivity {

    TextView txt_pizzas;
    EditText editText_name,editText_mobile,editText_price,editText_address;
    Spinner spinner_size;
    ArrayAdapter adapter_size;
    Button btn_Ok;
    String TAG = "Android";
    int priceofpizza = 0;
    int totalvalue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sizeactivity);
    }
}
