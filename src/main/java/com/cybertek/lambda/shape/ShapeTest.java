package com.cybertek.lambda.shape;

public class ShapeTest {
    public static void main(String[] args) {

        Drawable drawable = () -> System.out.println("Drawing a Circle");
        drawable.draw();

        Drawable2 drawable2 = shape -> System.out.println("Drawing a "  + shape);
        drawable2.draw("Square");

        Drawable3 drawable3 = (shape,name) -> System.out.println(name + " is drawing a " + shape);
        drawable3.draw("Triangle","Ozzy");

        Drawable4 drawable4 = (shape,area) -> "Drawing a " + shape + " and it's area is " + area;
        drawable4.draw("Square",200);

        //Multiple lines
        Drawable3 drawable33 = (shape, name) -> {
            System.out.println("What kind of shape is this? :" + shape);
            System.out.println("Who is drawing this shape? :" + name);
        };
        drawable33.draw("Circle","Mike");
    }
}
