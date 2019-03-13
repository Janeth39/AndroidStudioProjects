package com.example.xml_practice01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("info", "Hi Mom!");
        int a = 10;
        String b = "Alan Turing";
        boolean c = true;

        Log.i("info","a = " + a);
        Log.i("info", "b = " + b);
        Log.i("info", "c = " + c);

        a++;
        a = a + 10;
        Log.i("info", "a = " + a);
        //concatenation in Java using + sign
        b = b + " was smarter than the average bear.";
        Log.i("info", "b = " + b);

        double d = 3.14159;
        Log.i("info", "d = " + d);
        float f = 3.14159265358979323846264338f;
        Log.i("info", "f = " + f);

        sayHello();

        Log.i("alrighty then", "my result from f1 " + f1());

        TextView mom = findViewById(R.id.tv_hello3);
        mom.setText("I changed this programmatically");
        mom.setTextSize(50f);
    }//end of onCreate
    public void sayHello(){
        Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT).show();
    }
    public String f1(){
        return  "hello from f1";
    }
}//end of class
