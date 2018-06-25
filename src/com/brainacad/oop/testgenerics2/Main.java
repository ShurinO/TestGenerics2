package com.brainacad.oop.testgenerics2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array values: " + Arrays.toString(integers));
        int number = 3;
        System.out.println("Number of elements that are greater than "+number+": "+MyTestMethod.calcNum(integers,number));
        System.out.println("Sum of elements that are greater than "+number+": "+MyTestMethod.calcSum(integers,number));

        Double[] doubles = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        System.out.println("Array values: " + Arrays.toString(doubles));
        double number2 = 3;
        System.out.println("Number of elements that are greater than "+number2+": "+MyTestMethod.calcNum(doubles,number2));
        System.out.println("Sum of elements that are greater than "+number2+": "+MyTestMethod.calcSum(doubles,number2));

    }
}
