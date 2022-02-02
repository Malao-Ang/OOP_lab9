package com.kaewmanee.lab9;

public class Robot extends Unit{

    public Robot(Map map, char symbol, int x, int y) {
        super(map, symbol, x, y, false);
        
    }
    public void up(){
        int y = this.getY();
        y--;
        this.setY(y);
    }
    public void down(){
        int y = this.getY();
        y++;
        this.setY(y);

    }
    public void left(){
        int  x = this.getX();
        x--;
        this.setX(x);

    }
    public void right(){
        int x = this.getX();
        x++;
        this.setX(x);

    }
    
}
