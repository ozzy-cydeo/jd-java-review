package com.cybertek.core;

public class Loops {

    public static void demoForIterator(){
        for(int i=0;i<5;i++){
            System.out.print(i + " ");
        }
    }

    public static void demoForEach(){
        String[] cars = {"Honda","Nissan","BMW","Ford"};
        for(String car : cars){
            System.out.print(car + " ");
        }

    }
}
