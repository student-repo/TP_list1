package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private static final int FIGURES_AMOUNT = 13;
    private static final int SUITS_AMOUNT = 4;
    private static final int JOKERS_SUIT = 4;
    private List<Card> cards;

    public Deck(boolean withJokers) {
        cards = withJokers ? generateCards(2) : generateCards(0);
    }

    public Deck(int jokersAmount) {
        cards = generateCards(jokersAmount);
    }

    public Card getFirstCard(){
        return cards.get(0);
    }

    public void shuffleCards(){
        Collections.shuffle(cards);
    }

    public List<Card> getAllCards(){
        return cards;
    }

    public void sortCards(){
        Collections.sort(cards, (a, b) -> a.getSuitNumber()< b.getSuitNumber()? -1  : 1);
        Collections.sort(cards, (a, b) -> a.getCardNumber() < b.getCardNumber() ? -1 : a.getCardNumber() == b.getCardNumber() ? 0 : 1);
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
