package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

        txt_pizzas=(TextView)findViewById(R.id.pizzaname);
        editText_name=(EditText)findViewById(R.id.bkname);
        editText_mobile=(EditText)findViewById(R.id.bkcontact);
        editText_price=(EditText) findViewById(R.id.price);
        editText_address=(EditText)findViewById(R.id.bkaddress);
        spinner_size=(Spinner)findViewById(R.id.bksize);
        btn_Ok=(Button)findViewById(R.id.ukbook);
        Log.i(TAG, "spinner");

        Intent intent = getIntent();

        final String  text = intent.getExtras().getString("price");
        String  text1 = intent.getExtras().getString("PIZZANAME");

        txt_pizzas.setText(text1);
        editText_price.setText(text);

    }
}
