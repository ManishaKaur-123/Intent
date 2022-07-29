package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView receiver_msg2 = (TextView)findViewById(R.id.textView3);
        // create the get Intent object
        Intent intent = getIntent();
        String str3 = intent.getStringExtra("user Name");

        // display the string into textView
        receiver_msg2.setText("Welcome " + str3);

    }
}