package com.example.teht5;

public class Counter {
    private int arvo;

    public Counter(){
        this.arvo = 0;
    }

    public void plus(){
        if(this.arvo <= 93){
            this.arvo = this.arvo + 1;
        }
    }
    public void minus(){
        if(this.arvo >= -93){
            this.arvo = this.arvo - 7;
        }
    }
    public void reset(){
        this.arvo = 0;
    }

    public int getArvo(){
        return this.arvo;
    }

}
