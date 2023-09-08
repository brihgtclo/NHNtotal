package com.nhnacademy.java.poker;

public enum Pattern {
    S("Spade", 3),
    D("Diamond",2),
    H("Heart",1),
    C("Clover",0);
    private final String patternName;
    private final int value;

    Pattern(String patternName,int value){
        this.patternName = patternName;
        this.value = value;
    }
}
