package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
       private int mCount = 0;
       private TextView mShowCount;
       private Button btnZero;
       boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.showcount);
        btnZero = findViewById(R.id.btnZero);
    }

   public void countUp(View view) {

        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            btnZero.setBackgroundColor(Color.RED);
        }
    }


    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT);
        toast.show();

    }


    public void onClick(View view) {
        check = true;
        if(check == true) {
            btnZero.setBackgroundColor(Color.RED);
        }





        /*if (mCount == 0) {
            btnZero.setBackgroundColor(Color.BLUE);
        }
        else {
            btnZero.setBackgroundColor(Color.BLUE);
            }*/
        }
    }


