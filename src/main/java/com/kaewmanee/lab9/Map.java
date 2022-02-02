package com.kaewmanee.lab9;

public class Map {
    private int width;
    private int height;
    public Map(int width,int height) {
        this.width = width;
        this.height = height;
    }
    public Map(){
        this(10,10);
    }
    public void print(){
        for(int i = 0; i <this.width; i++){
            for(int j = 0; j <this.height; j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
    public String toString(){
        return "Map ("+this.width+","+this.height+")";
    }
}
