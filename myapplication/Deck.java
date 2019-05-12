package com.example.myapplication;


import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;


public class Deck {
    private ArrayList<Card>cardList;

    public Deck(){
        String[]marks=new String[]{"ダイヤ","スペード","ハート","クローバー"};
        ArrayList<Card> cardList=new ArrayList<Card>();
        for (int i=0;i<marks.length;i++){
            String mark=marks[i];

            for (int j=1;j<13;j++){
                Card card=new Card(mark,j);
                cardList.add(card);
            }
        }

        Collections.shuffle(cardList);
        this.cardList=cardList;
    }

    public Card drowCard(int c){
        Card rCard=cardList.get(c);
        cardList.remove(c);
        return rCard;
    }

    public void printCardList(){
        for (int i=0;i<cardList.size();i++){
            Card card=cardList.get(i);
            card.print();
        }
    }

}
