package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText email, password;
    Button loginbutton, registartionbutton;
    TextView invisible;

    // getSupportActionBar().setTitle("Login")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String text, text1;
        email = findViewById(R.id.emailtext);
        password = findViewById(R.id.passtext);
        loginbutton = findViewById(R.id.login_button1);
        registartionbutton = findViewById(R.id.register);
        //invisible = findViewById(R.id.textView);
        Intent i = getIntent();
        registartionbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, registration.class);
                startActivity(intent);
            }
        });
    }
}
