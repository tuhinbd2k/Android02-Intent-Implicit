package com.example.tuhin.android02_intentimplicit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// Variable declaration for EditText and Button
// Initialization of variables of EditText and Button
// Click event for buttons specially Intent

public class MainActivity extends AppCompatActivity {

    // Variable Declaration
    EditText etName, etHeight, etWeight;
    Button btnClear, btnSend, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialization of variables
        etName   = (EditText) findViewById(R.id.txtName);
        etHeight = (EditText) findViewById(R.id.txtHeight);
        etWeight = (EditText) findViewById(R.id.txtWeight);
        btnClear = (Button) findViewById(R.id.buttonClear);
        btnSend  = (Button) findViewById(R.id.buttonSend);
        btnExit  = (Button) findViewById(R.id.buttonExit);

        // Clear Button event to clear all text field
        btnClear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        etName.setText("");
                        etHeight.setText("");
                        etWeight.setText("");
                        etName.requestFocus();
                    }
                }
        );

        // Send Button event to open new activity and send data
        btnSend.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // String variable declaration, initialization and keeping data in variables
                        String sName, sHeight, sWeight;
                        sName   = etName.getText().toString();      // sent name
                        sHeight = etHeight.getText().toString();    // sent height
                        sWeight = etWeight.getText().toString();    // sent weight

                        // Creating intent and send data of variables to another activity
                        Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                        intent.putExtra("nameKey", sName);
                        intent.putExtra("heightKey", sHeight);
                        intent.putExtra("weightKey", sWeight);
                        startActivity(intent);
                    }
                }
        );

        // Exit Button event to exit away from application
        btnExit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.exit(1);
                    }
                }
        );
    }
}
