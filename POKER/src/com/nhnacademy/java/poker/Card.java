package com.nhnacademy.java.poker;

public class Card implements Comparable<Card>{
    private final String cardV;
    private final String patternShape;

    public int getPatternValue() {
        return patternValue;
    }

    private final int patternValue;
    private final Numbering cardNum;
    private final int realNumber;
    private final Pattern cardPattern;
    

    public Card(Numbering cardNum, Pattern cardPattern) {
        this.cardNum = cardNum;
        this.cardPattern = cardPattern;
        this.realNumber = cardNum.getNum();
        this.cardV = cardNum.getV();
        this.patternValue = cardPattern.getValue();
        this.patternShape = cardPattern.getPatternShape();
    }


    @Override
    public String toString() {
        return  cardV + patternShape + " ";
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


    @Override
    public int compareTo(Card o) {
        if(o.realNumber == this.realNumber)
            return o.patternValue - this.patternValue;
        return o.realNumber - this.realNumber;
    }
}
