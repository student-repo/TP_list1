package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Deck {
    private static final int FIGURES_AMOUNT = 13;
    private static final int SUITS_AMOUNT = 4;
    private static final int JOKERS_SUIT = 4;
    private List<Card> cards;

    Deck(boolean withJokers) {
        cards = withJokers ? generateCards(2) : generateCards(0);
    }

    public Deck(int jokersAmount) {
        cards = generateCards(jokersAmount);
    }

    Card getFirstCard(){
        return cards.get(0);
    }

    void shuffleCards(){
        Collections.shuffle(cards);
    }

    void displayAllCards(){
        cards.forEach(System.out::println);
    }

    private List generateCards(int jokersAmount){
        List cards = generateFigures();
        cards.addAll(generateJokers(jokersAmount));
        return cards;
    }

    private List<Card> generateSuits(int figureNumber){
        List cards = new ArrayList<Card>();
        for(int j=0; j < SUITS_AMOUNT; j++){
            cards.add(new Card(figureNumber, j));
        }
        return cards;
    }

    private List<Card> generateFigures(){
        List cards = new ArrayList<Card>();
        for( int i = 2; i < FIGURES_AMOUNT + 1; i++){
            cards.addAll(generateSuits(i));
        }
        return cards;
    }
    private List<Card> generateJokers(int jokersAmount){
        List cards = new ArrayList<Card>();
        for(int i = 0; i < jokersAmount; i++){
            cards.add(new Card(15, i + JOKERS_SUIT));
        }
        return cards;
    }
}
