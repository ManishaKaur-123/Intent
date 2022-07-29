package com.example.intent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Object v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button send_button = (Button) findViewById(R.id.button2);
        EditText send_text = (EditText) findViewById(R.id.editText);
        EditText send_text1 = (EditText) findViewById(R.id.editTextTextPassword);
        send_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // get the value which input by user in
                        // EditText and convert it to string
                        String str = send_text.getText().toString();
                        String str2 = send_text1.getText().toString();


                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        intent.putExtra("user Name", str);
                        intent.putExtra("Password", str2);

                        // start the Intent
                        startActivity(intent);
                    }
                });
    }
}