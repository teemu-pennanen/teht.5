package com.example.teht5;

import android.widget.TextView;

public class Counter extends MainActivity {

    private int min;
    private int max;
    private int start;
    private int step;
    private int total;

    public Counter(int min, int max, int start, int step, int total){
        this.min = min;
        this.max = max;
        this.start = start;
        this.step = step;
        this.total = total;
    }

    public Counter() {
        this.min = -100;
        this.max = 100;
        this.start = 0;
        this.step = 1;
        this.total = 0;
    }

    public void plus(){
        total =+ step;
    }

    public void minus() {
        total =- step;
    }

    public void reset() {
        total = start;

    }

    public int getArvo() {

        return total;

    }

}
