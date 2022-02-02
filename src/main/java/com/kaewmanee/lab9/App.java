package com.kaewmanee.lab9;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map map = new Map();
        Unit robot = new Unit(map,'A',15,15,false);
        Unit tree1 = new Unit(map,'T',5,5,true);
        Unit tree2 = new Unit(map,'T',5,6,true);
        Unit tree3 = new Unit(map,'T',6,5,true);
        Unit tree4 = new Unit(map,'T',7,5,true);
        Unit tree5 = new Unit(map,'T',5,7,true);
        Unit tree6 = new Unit(map,'T',6,7,true);
        Unit tree7 = new Unit(map,'T',11,9,true);
        Unit tree8 = new Unit(map,'T',11,10,true);
        Unit tree9 = new Unit(map,'T',11,12,true);
        Unit tree10 = new Unit(map,'T',12,10,true);
        map.add(tree1);
        map.add(tree2);
        map.add(robot);
        map.print();
        map.printUnit();
        
    }
}
