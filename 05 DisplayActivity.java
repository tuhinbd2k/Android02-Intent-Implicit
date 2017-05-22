package com.example.tuhin.android02_newactivitysenddata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// Variable declaration for EditText and Button
// Initialization of variables
// Intent data receiving
// Received data display at EditText
// Display received data

public class DisplayActivity extends AppCompatActivity {

    // Variable declaration
    TextView tvName, tvHeight, tvWeight;
    Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        // Initialization of variables
        tvName   = (TextView) findViewById(R.id.lblName);
        tvHeight = (TextView) findViewById(R.id.lblHeader);
        tvWeight = (TextView) findViewById(R.id.lblWeight);
        btnClose = (Button) findViewById(R.id.buttonClose);

        // Recieved intent data
        String rName, rHeight, rWeight;
        rName   = "Name: " + getIntent().getStringExtra("nameKey");
        rHeight = "Height: " + getIntent().getStringExtra("heightKey");
        rWeight = "Weight: " + getIntent().getStringExtra("weightKey");

        // Display received data
        tvName.setText(rName);
        tvHeight.setText(rHeight);
        tvWeight.setText(rWeight);

        // Close Button event to close this activity
        btnClose.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                }
        );
    }
}
