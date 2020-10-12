package com.cybertek.lambda.sorting;

import java.util.Comparator;
import java.util.function.Function;

public class MyComparator implements Comparator<Integer> {

    /*
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1>o2){
            return -1;
        }else if(o1<o2){
            return 1;
        }else{
            return 0;
        }
    }
    */

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>o2)?-1:(o1<o2)?1:0;
    }
}
