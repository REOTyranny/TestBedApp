package com.reotyranny.testbedapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.math.BigInteger;

public class CalculatorWithGridView extends AppCompatActivity {

    TextView text;
    BigInteger current;
    BigInteger prev;
    enum Op{
        subtraction, addition, multiplication, division
    }
    Op operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_with_grid_view);
        text = (TextView) findViewById(R.id.calValue);
        current = BigInteger.ZERO;
    }

    public void add(View view){
        current = current.multiply(BigInteger.TEN).add(new BigInteger(view.getTag().toString()));
        text.setText(current.toString());
    }

    public void op(View view){
        String str = view.getTag().toString();
        switch(str){
            case "+":
                operation = Op.addition;
                prev = current;
                current = BigInteger.ZERO;
                break;
            case "-":
                operation = Op.subtraction;
                prev = current;
                current = BigInteger.ZERO;
                break;
            case "*":
                operation = Op.multiplication;
                prev = current;
                current = BigInteger.ZERO;
                break;
            case "div":
                operation = Op.division;
                prev = current;
                current = BigInteger.ZERO;
                break;
            case "=":
                switch(operation){
                    case subtraction:
                        current = prev.subtract(current);
                        break;
                    case addition:
                        current = current.add(prev);
                        break;
                    case division:
                        current = prev.divide(current);
                        break;
                    case multiplication:
                        current = current.multiply(prev);
                        break;
                }
                break;
            case "clear":
                current = BigInteger.ZERO;

                break;
            case "clear all":
                prev = BigInteger.ZERO;
                current = BigInteger.ZERO;
                break;
            default:
                break;
        }
        text.setText(current.toString());
    }
}
