package com.example.midtermchristopherospina;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//Declaring widgets
    EditText editText;
    TextView textview,textview2,textview4, valueinmm;
    Button button;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiate widgets
        textview = findViewById(R.id.TextView);
        textview2 = findViewById(R.id.TextView2);
        textview4 = findViewById(R.id.TextView4);
        valueinmm = findViewById(R.id.Valueinmm);

        editText = findViewById(R.id.EditText);

        button = findViewById(R.id.Button);

        //adding a click event for button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MeterstoMM(editText.getText().toString());
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void MeterstoMM(String value_in_m) {
//taking in the meters variable
        //value_in_m =editText.getText().toString();
        try{
            double m =Double.parseDouble(value_in_m);

            double mm = m*1000;

            valueinmm.setText(""+ mm);
        }
        catch(NumberFormatException e) {
            System.err.println("Invalid input. Please enter a numerical value");

                }
            }
        }
