package com.cybertek.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args) {

        Integer[] numbersArray = {1,2,3,3,6,5,7,9};
        Stream<Integer> numberStream = Arrays.stream(numbersArray);

        Stream<String> strStream = Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").stream();

        System.out.println("*****************FILTER*****************");
        //Filter
        System.out.println(numberStream.filter(number -> number%2 !=0).count());
        System.out.println(strStream.filter(str -> str.length() == 5).count());
        // System.out.println(strStream.filter(str -> str.startsWith("A")).count()); //ERROR
        Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").stream().filter(str -> str.equals("Apple")).forEach(str -> System.out.println(str));

        System.out.println("*****************MAP*****************");
        Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").stream().map(str -> str.toUpperCase()).forEach(x -> System.out.println(x));
        Arrays.asList(1,2,3,3,6,5,7,9,14).stream().map(number -> number*2).forEach(number -> System.out.println(number));

        System.out.println("*****************DISTINCT*****************");
        Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").stream().distinct().forEach(str -> System.out.println(str));

        System.out.println("*****************SORTED-ORDER*****************");
        Arrays.asList(1,2,3,3,6,5,7,9,14).stream().sorted().forEach(number -> System.out.println(number));

        System.out.println("*****************SORTED-REVERSEORDER*****************");
        Arrays.asList(1,2,3,3,6,5,7,9,14).stream().sorted(Comparator.reverseOrder()).forEach(number -> System.out.println(number));

        //peek







    }
}
