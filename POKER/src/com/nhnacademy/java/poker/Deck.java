package com.nhnacademy.java.poker;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> deck = new ArrayList<>();

    public Deck(){
        for(Pattern pattern : Pattern.values()){
            for(Numbering number : Numbering.values()){
                Card card = new Card(number, pattern);
                deck.add(card);
            }
        }
    }
    public Deck(int count){
        for (int i = 0; i < count; i++) {
            for(Pattern pattern : Pattern.values()){
                for(Numbering number : Numbering.values()){
                    Card card = new Card(number, pattern);
                    deck.add(card);
                }
            }
        }
    }

    public List<Card> getDeck() {
        return deck;
    }
}
