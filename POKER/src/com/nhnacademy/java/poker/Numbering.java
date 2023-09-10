package com.nhnacademy.java.poker;

public enum Numbering {
    A(14," A"),
    two(2," 2"),
    three(3," 3"),
    fore(4," 4"),
    five(5," 5"),
    six(6," 6"),
    seven(7," 7"),
    eight(8," 8"),
    nine(9," 9"),
    ten(10,"10"),
    J(11," J"),
    Q(12," Q"),
    K(13," K");

    private final int cardNum;
    private final String carV;

    Numbering(int number, String cardV){
        this.cardNum = number;
        this.carV = cardV;
    }

    public int getNum() {
        return this.cardNum;
    }
    public String getV(){
        return this.carV;
    }
}
