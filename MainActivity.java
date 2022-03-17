package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText mEdit;
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton = (Button)findViewById(R.id.button);
        mButton.setOnClickListener(this);
    }
    public void onClick(View v) {
        mEdit   = (EditText)findViewById(R.id.edittext);
        tx  = (TextView) findViewById(R.id.text);
        String Str = mEdit.getText().toString();
        int Int = Integer.parseInt(Str); // convert String to Int10
        // calculate results
        int results = (Int *10) /100;
        tx.setText(Integer.toString(results));
    }
}