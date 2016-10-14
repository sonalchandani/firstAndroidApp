package com.example.csonal.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        Intent intent = getIntent();
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("Register:");

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_register_page);
        layout.addView(textView);
    }
}
