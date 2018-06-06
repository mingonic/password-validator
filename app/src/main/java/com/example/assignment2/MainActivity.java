package com.example.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Validator v = new Validator();

        TextView textView = (TextView) findViewById(R.id.Display);
        textView.setText("Not Strong");

        EditText editText = (EditText) findViewById(R.id.editText);

        String value = editText.getText().toString();

        int i = v.validate(value);

        if (i == 1){
            textView.setText("Weak");
        }
        else if (i == 2){
            textView.setText("Fair");
        }
        else if (i == 3){
            textView.setText("Good");
        }
        else if (i == 4){
            textView.setText("Strong");
        }
        else if (i >= 5){
            textView.setText("Excellent");
        }
        else {
            textView.setText("Not Strong");
        }

    }
}
