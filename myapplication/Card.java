package com.example.myapplication;

public class Card {
    private String mark;
    private int number;

    public Card(String mark, int number){
        this.mark=mark;
        this.number=number;
    }
    public String print(){
        System.out.println(this.mark+"の"+this.number);

        return (this.mark+"の"+this.number);
    }
}
