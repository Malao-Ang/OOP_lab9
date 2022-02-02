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
        for(int y = 0; y <this.width; y++){
            for(int x = 0; x <this.height; x++){
                printBlock(x,y);
            }
            System.out.println();
        }
    }

    private void printBlock(int x,int y){
        for(int i = 0; i <unitCount;i++) {
            Unit unit = this.units[i];
            if(unit.isOn(x,y)){
                System.out.print(unit.getSymbol());
                return ;
            }
        }
        System.out.print("-");
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
    public boolean isOn(int x,int y){
        return isInWidth(x) && isInHeight(y);
    }
    public boolean isInWidth(int x){
        return x>=0 && x <width;
    }
    public boolean isInHeight(int y){
        return y >=0 && y <height;
    }
    public boolean hasDominate(int x,int y){
        for(int i=0;i<unitCount;i++){
            Unit unit = this.units[i];
            if(unit.isDominated() && unit.isOn(x,y)){
                return true;
            }
        }
        return false;
    }
}
