package com.nhnacademy.starcraft.unit;

public interface Unit {
    void takeDamage (UnitForm unit);

    String getName();
    boolean isFlyable();
    int getGroundDmg();
    int getAirDmg();
    int getArmor();
}
