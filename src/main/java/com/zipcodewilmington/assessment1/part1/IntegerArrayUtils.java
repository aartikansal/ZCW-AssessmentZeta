package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils<getAverage> {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int Sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            Sum += intArray[i];
        }
        return Sum;

    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int Product = 1;
        for (int i = 0; i < intArray.length; i++) {
            Product *= intArray[i];

        }

        return Product;

    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {


        return null;

    }
}
