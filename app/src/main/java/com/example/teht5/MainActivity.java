package com.example.teht5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView creationsView;
    TextView hitsView;
    TextView visiblesView;

    public int creations;
    public int visibles;
    public int hits;
    private Counter creationsCounter;
    private Counter visiblesCounter;
    private Counter hitsCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefGet = getSharedPreferences("CounterPref", Context.MODE_PRIVATE);

        visiblesCounter = new Counter(100, 0, prefGet.getInt("CreationsPref", 0), 1,0);
        hitsCounter = new Counter(1000, 0, prefGet.getInt("CreationsPref", 0),1,0);
        creationsCounter = new Counter(1000, 0, prefGet.getInt("CreationsPref", 0),1,0);

        hits = hitsCounter.getArvo();
        creations = creationsCounter.getArvo();
        creationsCounter.plus();
        visibles = visiblesCounter.getArvo();

        updateUI();
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    public void onPlusButtonPressed(){
        hitsCounter.plus();
    }


    public void updateUI() {
        creationsView.setText(creations);
        hitsView.setText(hits);
        visiblesView.setText(visibles);

    }


}
