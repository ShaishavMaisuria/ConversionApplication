package com.example.inclass2a;
/*
@Author Name :
Shaishav Maisuria
Jacob Smith
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editTextName = findViewById(R.id.editTextNumber);
        TextView textConversion = findViewById(R.id.textViewConversion);


        // For Button To Feet
        findViewById(R.id.buttonToFeet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Double convertedFeet = Double.parseDouble(editTextName.getText().toString()) * 0.083;
                    textConversion.setText(String.valueOf(convertedFeet) + new String(" Feet"));
                    Log.d("demo", "Issue with onclick ToFeet ");
                } catch (Exception e) {
                    textConversion.setText(new String(" Please Provide a Valid Number"));
                }
            }
        });

        // for Button To Meters
        findViewById(R.id.buttonToMeters).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Double convertedMeters = Double.parseDouble(editTextName.getText().toString()) * 0.0254;
                    textConversion.setText(String.valueOf(convertedMeters) + new String(" Meters"));
                    Log.d("demo", "Issue with onclick ToMeters");
                } catch (Exception e) {
                    textConversion.setText(new String(" Please Provide a Valid Number"));
                }
            }
        });


        // For Button To Miles
        findViewById(R.id.buttonToMiles).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Double convertedFeet = Double.parseDouble(editTextName.getText().toString()) * 0.00001578;
                    textConversion.setText(String.valueOf(convertedFeet) + new String(" Miles"));
                    Log.d("demo", "Issue with onclick To Miles ");
                } catch (Exception e) {
                    textConversion.setText(new String(" Please Provide a Valid Number"));
                }
            }
        });


        // For Button To ClearAll
        findViewById(R.id.buttonClearAll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    textConversion.setText(new String(""));
                    editTextName.setText(new String(""));
                    Log.d("demo", "Issue with onclick To Clear All ");
                } catch (Exception e) {
                    textConversion.setText(new String(" Issue in Catch"));
                }
            }
        });


    }
}