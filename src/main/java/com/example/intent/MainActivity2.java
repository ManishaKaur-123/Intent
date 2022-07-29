package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.CollationElementIterator;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        TextView receiver_msg = (TextView)findViewById(R.id.textView2);
        // create the get Intent object
        Intent intent = getIntent();
        String str = intent.getStringExtra("user Name");
        String str2 = intent.getStringExtra("Password");

        // display the string into textView
        receiver_msg.setText("Hi " + str + "\n" + "Your account has been successfully created." +"\n"+ "To open it just sign In again" );

        Button send_button2 = (Button) findViewById(R.id.button);
        EditText send_text3 = (EditText) findViewById(R.id.userId);
        EditText send_text4 = (EditText) findViewById(R.id.editTextTextPassword5);
        send_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView msg = (TextView)findViewById(R.id.textView7);
                // get the value which input by user in
                // EditText and convert it to string
                String str3 = send_text3.getText().toString();
                String str4 = send_text4.getText().toString();
                if(send_text3.getText().toString().equals(str) && send_text4.getText().toString().equals(str2)) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("user Name", str3);
                    intent.putExtra("Password", str4);
                    startActivity(intent);
                }
                else if(send_text3.getText().toString().equals(str) && !send_text4.getText().toString().equals(str2)){
                    msg.setText("Incorrect Password");
                }
                else if(!send_text3.getText().toString().equals(str) && send_text4.getText().toString().equals(str2)){
                    msg.setText("incorrect user id");
                }
                else if(!send_text4.getText().toString().equals(str) && !send_text4.getText().toString().equals(str2) )
                {
                    msg.setText("Enter correct user id and password");
                }
                else
                {
                    msg.setText("Enter user id and password");
                }

            }
        });
    }
}