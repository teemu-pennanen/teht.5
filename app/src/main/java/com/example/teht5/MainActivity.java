package com.example.teht5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    TextView tv2;
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tv = findViewById(R.id.textView);
        this.tv2 = findViewById(R.id.textView2);
        this.tv3 = findViewById(R.id.textView2);

        updateUI();

    }

    Counter onCreate = new Counter();

    public void onCreate(View v){
        onCreate.plus();
        updateUI();
    }


    Counter onStart = new Counter();

    public void onStart(View v){
        onStart.plus();
        updateUI();
    }

    Counter hitMe = new Counter();

    public void plusButtonPressed(View v)
    {
        hitMe.plus();
        updateUI();
    }

    public void resetButtonPressed(View v)
    {
        hitMe.reset();
        onCreate.reset();
        onStart.reset();
        updateUI();
    }
    public void updateUI()
    {
        tv.setText(Integer.toString(hitMe.getArvo()));
        tv2.setText(Integer.toString(onCreate.getArvo()));
        tv3.setText(Integer.toString(onStart.getArvo()));
    }


}
