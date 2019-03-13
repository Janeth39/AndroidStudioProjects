package com.example.palmdigital.layouts01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonToClick = findViewById(R.id.button);
        buttonToClick.setOnClickListener(this);
    }
    public void onClick(View v){
        Toast.makeText(this, "You clicked a button!", Toast.LENGTH_SHORT).show();
        Log.i("info", "you clicked a button");
    }
}
