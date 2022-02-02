package com.kaewmanee.lab9;

public class Map {
    private int width;
    private int height;
    //Create Array unit
    private Unit units[];
    private int unitCount;

    public Map(int width,int height) {
        this.width = width;
        this.height = height;
        this.units = new Unit[width *height];
        this.unitCount =0;
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
    public void add(Unit unit){
        if(unitCount==(width*height)) return;
        this.units[unitCount] = unit;
        unitCount++;
    }
    public void printUnit(){
        for(int i=0;i<unitCount;i++){
            System.out.println(this.units[i]);
        }
    }
}
