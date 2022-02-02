package com.kaewmanee.lab9;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static Map map = new Map(15,15);
    static Robot robot = new Robot(map,'A',10,10);
    static Tree tree1 = new Tree(map,5,5);
    static Tree tree2 = new Tree(map,5,6);
    static Tree tree3 = new Tree(map,6,5);
    static Tree tree4 = new Tree(map,7,5);
    static Tree tree5 = new Tree(map,5,7);
    static Tree tree6 = new Tree(map,6,7);
    static Tree tree7 = new Tree(map,11,9);
    static Tree tree8 = new Tree(map,11,10);
    static Tree tree9 = new Tree(map,11,12);
    static Tree tree10 = new Tree(map,12,10);
    static Scanner sc = new Scanner(System.in);
    
    public static String input(){
        return sc.next();
    }
    public static void process(String command){
        switch (command) {
            case "w":
                robot.up();
                break;

            case "s":
                robot.down();
                break;

            case "a":
                robot.left();
                break;

            case "d":
                robot.right();
                break;
            case "q":
                System.exit(0);
                break;

            default:
                break;
        
        }
    }
    public static void main( String[] args )
    {
        
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
        

        while(true) {
            map.print();
            String command = input();
            process(command);
        }
        
    }
}
