package com.example.myapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class DrawCard {


    //int[] nums;
    //int[]count;

    private ArrayList<Card>cardList;
    Deck deck = new Deck();

    //private int num1;
    //private int num2;

    public DrawCard(){
        ArrayList<Card> cardList=new ArrayList<Card>();
        this.cardList=cardList;
    }




   /* public void playerCard(){
        Card pcard1=cardList.get(num1);
        Card pcard2=cardList.get(num2);



    }
*/
    public void Pdraw() {
        Random rnd = new Random();
        int num=rnd.nextInt(14);


        deck.drowCard(num).print();
        deck.drowCard(num).print();


    }

    public void Edraw(){
        Random rnd = new Random();
        int num=rnd.nextInt(14);

        deck.drowCard(num).print();
        deck.drowCard(num).print();

    }




}
