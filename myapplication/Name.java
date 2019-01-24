package com.example.myapplication;

import java.util.Scanner;

public class Name {
    Print print=new Print();
    private String str;
    public Name() {
        System.out.println("名前を入力してください");
        Scanner input = new Scanner(System.in);
        this.str =input.next();



    }

    public void playName(){
        print.Ｐprint(str);

    }


}
