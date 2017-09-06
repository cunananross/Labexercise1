package com.example.ross.firstactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.ross.firstactivity.MainActivity;
import com.example.ross.firstactivity.R;


public class Second_Activity extends AppCompatActivity {

    TextView tRA;
    TextView tFG;
    Button bret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second__activty);
        tRA = (TextView) findViewById(R.id.RA);
        tFG = (TextView) findViewById(R.id.FG);
        bret = (Button) findViewById(R.id.ret);
        String SRA = getIntent().getStringExtra("RA");
        String SFG = getIntent().getStringExtra("FG");

        tRA.setText("Your RA is "+SRA);
        tFG.setText("Your FG is "+SFG);
    }
    public void returnActivity (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }
}
