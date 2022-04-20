package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Page3 extends AppCompatActivity {

    TextView user;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        user = (TextView) findViewById(R.id.username);
        i = getIntent();
        String username= i.getStringExtra("user");
        user.setText("Welcome"+username);

    }
}