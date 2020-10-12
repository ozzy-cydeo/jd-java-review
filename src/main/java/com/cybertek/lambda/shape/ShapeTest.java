package com.cybertek.lambda.shape;

public class ShapeTest {
    public static void main(String[] args) {

        Drawable drawable = () -> System.out.println("Drawing a Circle");
        drawable.draw();

        Drawable2 drawable2 = shape -> System.out.println("Drawing a "  + shape);
        drawable2.draw("Square");
    }
}
