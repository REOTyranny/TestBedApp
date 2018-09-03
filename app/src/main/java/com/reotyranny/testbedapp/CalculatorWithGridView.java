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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_with_grid_view);
        text = (TextView) findViewById(R.id.calValue);
        current = BigInteger.ZERO;
    }

    public void add(View view){
        text.append(""+view.getTag().toString());
        current = current.multiply(BigInteger.TEN).add(new BigInteger(view.getTag().toString()));
    }
}
