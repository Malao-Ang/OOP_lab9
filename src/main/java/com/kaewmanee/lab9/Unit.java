package com.kaewmanee.lab9;

public class Unit {
    private int x;
    private int y;
    private Map map;
    private boolean dominate;
    private char symbol;
    public Unit(Map map,char symbol,int x,int y,boolean dominate) {
        this.x = x;
        this.y = y;
        this.map = map;
        this.dominate = dominate;
        this.symbol = symbol;

    }
    public boolean isOn(int x,int y) { //อยู่ยน xyนี่ใช่ั้น:ใช่
        return this.x == x && this.y == y;
    }
    public boolean setX(int x) {
        this.x = x;
        return true;
    }
    public boolean setY(int y) {
        this.y = y;
        return true;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y ;
    }
    public boolean isDominated() {
        return  dominate;
    }
    public String toString() {
        return "Unit("+this.symbol+") [" +this.x+" ,"+this.y+"] is on"+ map;//map.toString();
    }
    
    
    
    
}
