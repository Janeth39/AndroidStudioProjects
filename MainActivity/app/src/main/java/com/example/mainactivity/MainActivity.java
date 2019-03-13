package com.example.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton stopSignButton = findViewById(R.id.ib_stopSign);
        ImageButton roseButton = findViewById(R.id.ib_rose);
        ImageButton androidButton = findViewById(R.id.ib_android);
        stopSignButton.setOnClickListener(this);
        roseButton.setOnClickListener(this);
        androidButton.setOnClickListener(this);
    }//end of onCreate
    public void onClick (View view){
        if(view.getId() == R.id.ib_stopSign){
        Toast.makeText(this, "You clicked on a stop sign", Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.ib_rose){
            Toast.makeText(this, "You clicked on a rose", Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.ib_android){
            Toast.makeText(this, "You clicked on android", Toast.LENGTH_SHORT).show();
        }
    }
}//end of class
