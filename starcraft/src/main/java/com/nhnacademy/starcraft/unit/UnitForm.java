package com.nhnacademy.starcraft.unit;

public class Unit {
    private final String name;
    private boolean flyable;
    private int groundDmg;
    private int airDmg;
    private int armor;

    public Unit(String name, boolean flyable, int groundDmg, int airDmg, int amor) {
        this.name = name;
        this.flyable = flyable;
        this.groundDmg = groundDmg;
        this.airDmg = airDmg;
        this.armor = amor;
    }
    public void takeDamage (Unit unit){
        if(this.flyable) this.armor -= unit.getAirDmg();
        else this.armor -= unit.getGroundDmg();
    }

    public String getName() {
        return name;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public int getGroundDmg() {
        return groundDmg;
    }

    public int getAirDmg() {
        return airDmg;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return this.name + " " + "(현재 방어력: " + this.armor + ")";
    }
}
