package com.cybertek.streams;


import com.cybertek.collections.ArrayLists;
import com.cybertek.oop.encapsulation.Role;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {

        System.out.println("*****************COUNT*****************");
        long count = Arrays.asList(1,2,3,3,6,5,7,9,14).stream().count();
        System.out.println(count);

        long appleCount = Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").stream().filter(str -> str.equals("Apple")).count();
        System.out.println(appleCount);

        System.out.println("*****************MIN-MAX*****************");
        int min = Arrays.asList(1,2,3,3,6,5,7,9,14).stream().min((i,j) -> i.compareTo(j)).get();
        int max = Arrays.asList(1,2,3,3,6,5,7,9,14).stream().max((i,j) -> i.compareTo(j)).get();

        System.out.println(min + " | " + max);

        System.out.println("*****************ALLMATCH - ANYMATCH- NONEMATCH*****************");
        List<Integer> list = Arrays.asList(3,4,6,12,20);

        boolean answer1 = list.stream().anyMatch(n -> (n * (n+1)) / 4 == 5);
        boolean answer2 = list.stream().allMatch(n -> (n * (n+1)) / 4 == 5);
        boolean answer3 = list.stream().noneMatch(n -> (n * (n+1)) / 4 == 5);

        System.out.println(answer1 + "|" + answer2 + "|" + answer3);

        System.out.println("*****************FOR EACH*****************");
        Arrays.asList(3,4,6,12,20).stream().forEach(n -> System.out.println(n*2));

        System.out.println("*****************REDUCE*****************");
        int result = Arrays.asList(3,4,6,12,20).stream().reduce(5,(x,y) -> x+y);
        System.out.println(result);

        String strResult = Stream.of("java", "c", "c#", "python").reduce("Languages:", (x, y)->x+" | "+y);
        System.out.println(strResult);

        System.out.println("*****************FIND FIRST - FIND ANY*****************");
        Role r = ArrayLists.createRoleList().stream().filter(role -> role.getDescription().matches("Employee")).findFirst().get();
        System.out.println(r.getId());

        Role r2 = ArrayLists.createRoleList().stream().filter(role -> role.getDescription().matches("Employee")).findAny().get();
        System.out.println(r2.getId());

        System.out.println("*****************COLLECT*****************");
        List<String> appleList = Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango")
                .stream()
                .filter(s -> s.matches("Apple"))
                .collect(Collectors.toList());

        System.out.println(appleList.stream().count());






    }
}
