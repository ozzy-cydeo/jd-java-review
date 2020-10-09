package com.cybertek.core;

public class Methods {

    public void methodA(){
        System.out.println("methodA() is called!");
    }
    public void methodA(String str){
        System.out.println("methodA(String str) is called!");
    }
    public String methodB(){
        return "methodB() is called!";
    }
    public void methodB (String str){
        System.out.println("methodB(String str) is called!");
    }

    public static void methodC(){
        System.out.println("methodC() is called!");
    }
}
