package com.example.csonal.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity {
    public final static String USERNAME = "";
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText enterPassword = (EditText) findViewById(R.id.text_password);
        final EditText enterEmail = (EditText) findViewById(R.id.text_email);
        Button loginButton = (Button) findViewById(R.id.button_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enterEmail.getText().toString().matches("")&& enterPassword.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(),"enter the fields",Toast.LENGTH_SHORT).show();
                }
              else  if (enterEmail.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(),"enter the mail",Toast.LENGTH_SHORT).show();
                }
              else  if (enterPassword.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(),"enter the password",Toast.LENGTH_SHORT).show();
                }
                else {
                    login(v);
                }
            }

        });
        }


    public void login(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.text_email);
        String message = editText.getText().toString();
        intent.putExtra(USERNAME, message);

        startActivity(intent);
    }

}
