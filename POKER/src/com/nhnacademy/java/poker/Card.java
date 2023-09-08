package com.nhnacademy.java.poker;

public class Card {
    private Numbering cardNum;
    private int realNumber;
    private Pattern cardPattern;
    

    public Card(Numbering cardNum, Pattern cardPattern) {
        this.cardNum = cardNum;
        this.cardPattern = cardPattern;
        this.realNumber = cardNum.getNum();
    }


    @Override
    public String toString() {
        return "Card [cardNum=" + cardNum + ", cardPattern=" + cardPattern + "]";
    }


    public Numbering getCardNum() {
        return cardNum;
    }


    public int getRealNumber() {
        return realNumber;
    }


    public Pattern getCardPattern() {
        return cardPattern;
    }
    

}
