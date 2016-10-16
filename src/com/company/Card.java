package com.company;

import java.util.HashMap;
import java.util.Map;

class Card {
    private static final Map FIGURES = new HashMap<Integer, String>(){{
        put(2, "Two"); put(3, "Three"); put(4, "Four"); put(5, "Five");
        put(6, "Six"); put(7, "Seven"); put(8, "Eight"); put(9, "Nine");
        put(10, "Ten"); put(11, "Jack"); put(12, "Queen"); put(13, "King");
        put(14, "Ace"); put(15, "Joker");
    }};
    private static final Map SUITS = new HashMap<Integer, String>(){{
        put(0, "Spade"); put(1, "Heart"); put(2, "Diamond"); put(3, "Club"); put(4, "Black"); put(5, "Red"); put(6, "Blue");
    }};
    private int cardNumber;
    private int suitNumber;

    Card(int cardNumber, int suitNumber) {
        this.cardNumber = cardNumber;
        this.suitNumber = suitNumber;
    }

    public String toString() {
        return "Card{" +
                "cardFigure=" + FIGURES.get(cardNumber) +
                ", Suit=" + SUITS.get(suitNumber) +
                '}';
    }

}
