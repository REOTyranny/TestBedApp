package com.reotyranny.testbedapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class calculator extends AppCompatActivity {

    TextView cal;
    long cur = 0;
    long prev = 0;
    enum operation{
        addition, subtraction
    }
    operation op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        cal = (TextView) findViewById(R.id.calculatorText);
        cal.setText("");
    }

    public void returnHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void add1(View view){
        cal.append("1");
        cur =  cur *10 +1;
    }
    public void add2(View view){
        cal.append("2");
        cur =  cur *10 +2;
    }
    public void add3(View view){
        cal.append("3");
        cur =  cur *10 +3;
    }
    public void add4(View view){
        cal.append("4");
        cur =  cur *10 +4;
    }
    public void add5(View view){
        cal.append("5");
        cur =  cur *10 +5;
    }
    public void add6(View view){
        cal.append("6");
        cur =  cur *10 +6;
    }
    public void add7(View view){
        cal.append("7");
        cur =  cur *10 +7;
    }
    public void add8(View view){
        cal.append("8");
        cur =  cur *10 +8;
    }
    public void add9(View view){
        cal.append("9");
        cur =  cur *10 +9;
    }
    public void add0(View view){
        cal.append("0");
        cur =  cur *10;
    }

    public void addition(View view){
        prev = cur;
        cur =0;
        cal.setText("");
        op = operation.addition;
    }
    public void subtraction(View view){
        prev = cur;
        cur =0;
        cal.setText("");
        op = operation.subtraction;
    }
    public void equals(View view){
        switch(op){
            case addition:
                cur = cur +prev;
                break;
            case subtraction:
                cur = prev-cur;
                break;
        }
        prev = 0;
        cal.setText(""+cur);
    }
}
