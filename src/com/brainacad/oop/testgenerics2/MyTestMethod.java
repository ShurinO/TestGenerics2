package com.brainacad.oop.testgenerics2;

public class MyTestMethod {
    public static <T extends Number> int calcNum(T[] array, T maxElem){
        int res = 0;
        for (T t : array) {
            if (t.doubleValue()>maxElem.doubleValue()){
                res++;
            }
        }
        return res;
    }
}
