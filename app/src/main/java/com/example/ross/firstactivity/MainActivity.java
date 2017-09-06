package com.example.ross.firstactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import com.example.ross.firstactivity.R;


public class MainActivity extends AppCompatActivity {


    EditText EEQ1;
    EditText EEQ2;
    EditText ESeatwork;
    EditText EELab;
    EditText EEMExam;
    Button Ecompute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EEQ1 = (EditText) findViewById(R.id.EQ1);
        EEQ2 = (EditText) findViewById(R.id.EQ2);
        ESeatwork = (EditText) findViewById(R.id.Seatwork);
        EELab = (EditText) findViewById(R.id.ELab);
        EEMExam = (EditText) findViewById(R.id.EMExam);
        Ecompute = (Button) findViewById(R.id.compute);
    }

    public void Calculate(View view) {
        Intent intent = new Intent(this, Second_Activity.class);
        double Q1 =.10*(Integer.parseInt(EEQ1.getText().toString()));
        double Q2 =.10*(Integer.parseInt(EEQ2.getText().toString()));
        double SW =.10*(Integer.parseInt(ESeatwork.getText().toString()));
        double LE =.40*(Integer.parseInt(EELab.getText().toString()));
        double ME =.30*(Integer.parseInt(EEMExam.getText().toString()));
        double ra = Q1+Q2+SW+LE+ME;
        intent.putExtra("ra",Double.toString(ra));
        String fg = new String();

        if(ra < 60 ) {
            fg = "Failed";
         } else if (ra <= 65 ) {
            fg = "3.00";
        }
         else if ( ra <= 70 ) {
            fg = "2.75";
        }
        else if ( ra <= 75 ) {
            fg="2.50";
        }
        else if ( ra <= 80 ) {
            fg = "2.25";
        }
         else if ( ra <= 85 ) {
            fg = "2.00";
        }
        else if ( ra <= 90 ) {
            fg = "1.75";
        }else if ( ra <= 92 ) {
            fg = "1.5";
        }
        else if ( ra <= 94 ) {
            fg = "1.25";
        }
        else if ( ra <= 100 ) {
            fg = "1.00";
        }
        intent.putExtra("fg",fg);
        startActivity(intent);
    }

    }








