package com.example.android.inclassassignment04_yanyingl;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView getInput;
    TextView displayResult;
    float a=12;
    String double_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getInput =(TextView) findViewById(R.id.input_text_view);
        displayResult=(TextView) findViewById(R.id.result_view);
        Toast.makeText(MainActivity.this, "Welcome!!", Toast.LENGTH_SHORT).show();

    }

    public void Copy(View view){
        String Copy_output=getInput.getText().toString();
        displayResult.setText(Copy_output);
    }

    public void Double(View view){
        String Double_output=getInput.getText().toString();
        double_result=double_result+Double_output;
        displayResult.setText(double_result);
    }

    public void Up(View view){
        a=a+1;
        displayResult.setTextSize(a);
    }

    public void Down(View view){
        a=a-1;
        displayResult.setTextSize(a);
    }
}
