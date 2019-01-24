package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;


import java.util.ArrayList;
import java.util.Random;

public class DisplayMessageActivity extends AppCompatActivity {
    //private ArrayList<Card> cardList;
    Deck deck = new Deck();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_diplay_main);
        //setContentView(R.layout.activity_diplay_main);

        Intent intent = getIntent();
        String name = intent.getStringExtra(TrumpGame.EXTRA_NAME);
        TextView textView =(TextView)findViewById(R.id.edit_name);
        
        textView.setText(name+"のカード");
        textView.setTextSize(20);



        Random rnd = new Random();
        int num=rnd.nextInt(14);

        String PCard=deck.drowCard(num).print();



        TextView textCard=(TextView)findViewById(R.id.textCard);

        textCard.setText(PCard);
        textCard.setTextSize(10);


        String PCard2=deck.drowCard(num).print();
        TextView textCard2=(TextView)findViewById(R.id.textCard2);
        textCard2.setText(PCard2);
        textCard2.setTextSize(10);

        TextView Enemy=(TextView)findViewById(R.id.Enemy) ;
        Enemy.setText("相手のカード");
        Enemy.setTextSize(20);


        String ECard=deck.drowCard(num).print();
        TextView tECard=(TextView)findViewById(R.id.tECard);
        tECard.setText(ECard);
        tECard.setTextSize(10);

        String ECard2=deck.drowCard(num).print();
        TextView tECard2=(TextView)findViewById(R.id.tECard2);
        tECard2.setText(ECard2);
        tECard2.setTextSize(10);

    }
}