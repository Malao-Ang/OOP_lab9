package com.kaewmanee.lab9;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map map = new Map(15,15);
        Unit robot = new Unit(map,'A',10,10,false);
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
        map.add(tree3);
        map.add(tree4);
        map.add(tree5);
        map.add(tree6);
        map.add(tree7);
        map.add(tree8);
        map.add(tree9);
        map.add(tree10);
        map.add(robot);
        map.print();
        map.printUnit();
        
    }
}
