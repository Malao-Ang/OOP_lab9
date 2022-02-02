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
        Robot robot = new Robot(map,'A',10,10);
        Tree tree1 = new Tree(map,5,5);
        Tree tree2 = new Tree(map,5,6);
        Tree tree3 = new Tree(map,6,5);
        Tree tree4 = new Tree(map,7,5);
        Tree tree5 = new Tree(map,5,7);
        Tree tree6 = new Tree(map,6,7);
        Tree tree7 = new Tree(map,11,9);
        Tree tree8 = new Tree(map,11,10);
        Tree tree9 = new Tree(map,11,12);
        Tree tree10 = new Tree(map,12,10);
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
        robot.setXY(7,5);
        robot.setXY(15,15);
        map.print();
        map.printUnit();
        
    }
}
