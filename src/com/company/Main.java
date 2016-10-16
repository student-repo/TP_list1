package com.company;

public class Main {

    public static void main(String[] args) {
//        Deck d1 = new Deck(true);
//        d1.displayAllCards();
//        System.out.println();
//        System.out.println("first card: "+d1.getFirstCard());
//        System.out.println();
//        d1.shuffleCards();
//        System.out.println();
//        d1.displayAllCards();
//        System.out.println();
//        System.out.println("first card: "+d1.getFirstCard());System.out.println();

        Deck d1 = new Deck(3);
        System.out.println(d1.getAllCards().toString());
        System.out.println();
        System.out.println("first card: "+d1.getFirstCard());
        System.out.println();
        d1.shuffleCards();
        System.out.println();
        System.out.println(d1.getAllCards());
        System.out.println();
        System.out.println("first card: "+d1.getFirstCard());System.out.println();
        System.out.println();
        d1.sortCards();
        System.out.println(d1.getAllCards());
        System.out.println(d1.getFirstCard());
        System.out.println(new Card(2,0));
        System.out.println(d1.getFirstCard().equals(new Card(2,0)));
    }
}
