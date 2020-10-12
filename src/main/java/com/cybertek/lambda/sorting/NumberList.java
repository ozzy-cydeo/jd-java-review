package com.cybertek.lambda.sorting;

import com.cybertek.collections.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class NumberList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);list.add(0);
        list.add(15);list.add(5);
        list.add(20);list.add(30);

        System.out.println(list);

        Collections.sort(list); //ascending

        System.out.println(list);

        Collections.sort(list,new MyComparator()); //descending

        System.out.println(list);

        //With Lambda

        //ascending order
        Collections.sort(list);
        System.out.println(list);

        //descending order
        Collections.sort(list,(o1,o2) ->(o1>o2)?-1 : (o2>o1)?1 : 0);
        System.out.println(list);

        //ascending order
        list.sort((o1,o2) -> o1.compareTo(o2));
        System.out.println(list);

        //descending order
        list.sort((o2,o1) -> o1.compareTo(o2));
        System.out.println(list);



    }


}
