package com.example.simplecalculatorv02;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView topOutput;
    TextView midOutput;
    TextView answerOutput;
    TextView sum;
    int firstAddend;
    int secondAddend;
    ImageButton add;
    ImageButton minus;
    boolean select;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topOutput = findViewById(R.id.tv_top_num_output);
        midOutput = findViewById(R.id.tv_middle_num_output);
        answerOutput = findViewById(R.id.tv_final_output);

        ImageButton num1 = findViewById(R.id.ib_top_num1);
        ImageButton num2 = findViewById(R.id.ib_top_num2);
        ImageButton num3 = findViewById(R.id.ib_top_num3);
        ImageButton num4 = findViewById(R.id.ib_top_num4);
        ImageButton num5 = findViewById(R.id.ib_top_num5);
        ImageButton num6 = findViewById(R.id.ib_top_num6);
        ImageButton num7 = findViewById(R.id.ib_top_num7);
        ImageButton num8 = findViewById(R.id.ib_top_num8);
        ImageButton num9 = findViewById(R.id.ib_top_num9);
        ImageButton Bnum1 = findViewById(R.id.ib_bottom_num1);
        ImageButton Bnum2 = findViewById(R.id.ib_bottom_num2);
        ImageButton Bnum3 = findViewById(R.id.ib_bottom_num3);
        ImageButton Bnum4 = findViewById(R.id.ib_bottom_num4);
        ImageButton Bnum5 = findViewById(R.id.ib_bottom_num5);
        ImageButton Bnum6 = findViewById(R.id.ib_bottom_num6);
        ImageButton Bnum7 = findViewById(R.id.ib_bottom_num7);
        ImageButton Bnum8 = findViewById(R.id.ib_bottom_num8);
        ImageButton Bnum9 = findViewById(R.id.ib_bottom_num9);
         add = findViewById(R.id.ib_add);
         minus = findViewById(R.id.ib_minus);





        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        Bnum1.setOnClickListener(this);
        Bnum2.setOnClickListener(this);
        Bnum3.setOnClickListener(this);
        Bnum4.setOnClickListener(this);
        Bnum5.setOnClickListener(this);
        Bnum6.setOnClickListener(this);
        Bnum7.setOnClickListener(this);
        Bnum8.setOnClickListener(this);
        Bnum9.setOnClickListener(this);
        add.setOnClickListener(this);
        minus.setOnClickListener((this));
    }

   public void onClick(View v){
        if (v.getId() == R.id.ib_top_num1) {
            firstAddend = 1;
            topOutput.setText("1");

        } else if (v.getId() == R.id.ib_top_num2) {
            firstAddend = 2;
            topOutput.setText("2");
        } else if (v.getId() == R.id.ib_top_num3) {
            firstAddend = 3;
            topOutput.setText("3");
        } else if (v.getId() == R.id.ib_top_num4) {
            firstAddend = 4;
            topOutput.setText("4");
        } else if (v.getId() == R.id.ib_top_num5) {
            firstAddend = 5;
            topOutput.setText("5");
        } else if (v.getId() == R.id.ib_top_num6) {
            firstAddend = 6;
            topOutput.setText("6");
        } else if (v.getId() == R.id.ib_top_num7) {
            firstAddend = 7;
            topOutput.setText("7");
        } else if (v.getId() == R.id.ib_top_num8) {
            firstAddend = 8;
            topOutput.setText("8");
        } else if (v.getId() == R.id.ib_top_num9) {
            firstAddend = 9;
            topOutput.setText("9");
        }else if (v.getId() == R.id.ib_bottom_num1) {
           secondAddend = 1;
           midOutput.setText("1");

       } else if (v.getId() == R.id.ib_bottom_num2) {
            secondAddend = 2;
            midOutput.setText("2");
       } else if (v.getId() == R.id.ib_bottom_num3) {
            secondAddend = 3;
            midOutput.setText("3");
       } else if (v.getId() == R.id.ib_bottom_num4) {
            secondAddend = 4;
            midOutput.setText("4");
       } else if (v.getId() == R.id.ib_bottom_num5) {
            secondAddend = 5;
            midOutput.setText("5");
       } else if (v.getId() == R.id.ib_bottom_num6) {
            secondAddend = 6;
            midOutput.setText("6");
       } else if (v.getId() == R.id.ib_bottom_num7) {
            secondAddend = 7;
            midOutput.setText("7");
       } else if (v.getId() == R.id.ib_bottom_num8) {
            secondAddend = 8;
            midOutput.setText("8");
       } else if (v.getId() == R.id.ib_bottom_num9) {
            secondAddend = 9;
            midOutput.setText("9");
       }
       if(v.getId() == R.id.ib_add) {
           select = true;
           add.setBackgroundColor(Color.BLUE);
           minus.setBackgroundColor(Color.LTGRAY);
       }
       else if(v.getId() == R.id.ib_minus){
           select = false;
           add.setBackgroundColor(Color.LTGRAY);
           minus.setBackgroundColor(Color.BLUE);
       }

       if (select == true)
       {
           int sum = secondAddend + firstAddend;
           answerOutput.setText("" + sum);       }
       else
       {
           int sum = firstAddend - secondAddend;
           answerOutput.setText("" + sum);
       }
    }
}

