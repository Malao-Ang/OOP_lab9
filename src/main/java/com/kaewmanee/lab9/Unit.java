package com.kaewmanee.lab9;

public class Unit {
    private int x;
    private int y;
    private Map map;
    private boolean dominate;
    private char symbol;
    public Unit(Map map,int x,int y,boolean dominate) {
        this.x = x;
        this.y = y;
        this.map = map;
        this.dominate = dominate;
        this.symbol = symbol;

    }
    public boolean isOn(int x,int y) {
        return this.x == x && this.y == y;
    }
    
}
