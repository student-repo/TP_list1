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
        d1.displayAllCards();
        System.out.println();
        System.out.println("first card: "+d1.getFirstCard());
        System.out.println();
        d1.shuffleCards();
        System.out.println();
        d1.displayAllCards();
        System.out.println();
        System.out.println("first card: "+d1.getFirstCard());System.out.println();

    }
}
