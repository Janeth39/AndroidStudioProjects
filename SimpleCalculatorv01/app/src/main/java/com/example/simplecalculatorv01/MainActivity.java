package com.example.simplecalculatorv01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView topOutput;
    TextView midOutput;
    TextView answerOutput;
    TextView sum;
    int firstAddend;
    int secondAddend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topOutput = findViewById(R.id.tv_top_num_output);
        midOutput = findViewById(R.id.tv_middle_num_output);
        answerOutput = findViewById(R.id.tv_final_output);

        ImageButton num1 = findViewById(R.id.ib_num1);
        ImageButton num2 = findViewById(R.id.ib_num2);
        ImageButton num3 = findViewById(R.id.ib_num3);
        ImageButton num4 = findViewById(R.id.ib_num4);
        ImageButton num5 = findViewById(R.id.ib_num5);
        ImageButton num6 = findViewById(R.id.ib_num6);

        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.ib_num1) {
            firstAddend = 1;
            Log.i("num1", "you clicked button 1");
            topOutput.setText("1");

        } else if (v.getId() == R.id.ib_num2) {
            firstAddend = 2;
            Log.i("num2", "button2");
            topOutput.setText("2");
        } else if (v.getId() == R.id.ib_num3) {
            firstAddend = 3;
            Log.i("num3", "button3");
            topOutput.setText("3");
        } else if (v.getId() == R.id.ib_num4) {
            secondAddend = 4;
            Log.i("num4", "button4");
            midOutput.setText("4");
        } else if (v.getId() == R.id.ib_num5) {
            secondAddend = 5;
            Log.i("num5", "button5");
            midOutput.setText("5");
        } else if (v.getId() == R.id.ib_num6) {
            secondAddend = 6;
            Log.i("num6", "button6");
            midOutput.setText("6");
        }
        int sum = secondAddend + firstAddend;
        answerOutput.setText("" + sum);

    }
}
