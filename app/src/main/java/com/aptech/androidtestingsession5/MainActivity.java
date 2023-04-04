package com.aptech.androidtestingsession5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(addition_isCorrect(2,8));
        System.out.println(multiplication_isCorrect(2,8));
        //addition_isCorrect(2,2);
    }
    public int addition_isCorrect(int numberOne,  int numberTwo){
      return  numberOne + numberTwo;
    }
    public int multiplication_isCorrect(int numberOne, int numberTwo){
        return  numberOne * numberTwo;
    }
}