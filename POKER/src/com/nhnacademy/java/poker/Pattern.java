package com.nhnacademy.java.poker;

public enum Pattern {
    S("♠", 3),
    D("♦",2),
    H("♥",1),
    C("♣",0);
    private final String patternShape;
    private final int value;

    Pattern(String patternShape,int value){
        this.patternShape = patternShape;
        this.value = value;
    }

    public String getPatternShape() {
        return patternShape;
    }

    public int getValue() {
        return value;
    }
}
