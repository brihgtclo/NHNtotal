package com.nhnacademy.java.poker;

import java.util.ArrayList;
import java.util.List;

public class User implements Comparable<User>{
    private final String name;
    private final int playerNum;

    private int score;
    List<Card> hand = new ArrayList<>();

    public User(int playerNum, String name){
        this.playerNum = playerNum;
        this.name = name;
    }
    public void addHand(Card card){
        hand.add(card);
    }

    public String getName() {
        return name;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(User o) {
        return o.score - this.score;
    }
}
