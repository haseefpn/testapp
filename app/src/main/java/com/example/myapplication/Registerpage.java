package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Registerpage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpage);

    }

    public void regstr(View view) {
        Intent reg = new Intent(getApplicationContext(),LoginPage.class);
        startActivity(reg);

    }

    public void show(View view) {

        boolean checkedcheckbox = ((CheckBox)view).isChecked();

        String lang ="";


    }

}