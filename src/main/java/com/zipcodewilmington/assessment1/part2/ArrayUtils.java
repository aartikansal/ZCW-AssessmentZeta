package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return
     */
    public static int getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int counter = 0;
        for (int i = 0; i < objectArray.length; i++) {

            if (objectArray[i] == objectToCount) {
                counter = counter + 1;
            }
        }
        return counter;


    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        int counter = 0;
        for (int i = 0; i < objectArray.length ; i++) {
            if (objectArray[i] != objectToRemove){
                objectArray[counter++] = objectArray[i];
            }
        }
        return Arrays.copyOf(objectArray, counter);


    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int count = 0;
        int bigCount = 0;
        int finalcount = 0;

        for (int i = 0; i < objectArray.length; i++) {
            count = 0;
            for (int j = 0; j < objectArray.length - 1; j++) {
                if (objectArray[j] == objectArray[i]) {
                    count++;
                    System.out.println("count is --> " + count);
                }
            }
            if (count > bigCount) {
                bigCount = count;
                finalcount = (Integer) objectArray[i];
            }
        }
        //System.out.println("bigCount is --> " + finalcount);

        return finalcount;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        Integer expected = 2;
        Integer[] inputArray = {1, 1, 2, 3, 3, 3, 4, 4, 4, 4};

        int count = 0;
        int bigCount = 1;
        int finalcount = 0;

        for (int i = 0; i < objectArray.length; i++) {
            count = 0;
            for (int j = 0; j < objectArray.length - 1; j++) {
                if (objectArray[j] == objectArray[i]) {
                    count++;
                    System.out.println("count is --> " + count);
                }
            }
            if (count <= bigCount) {
                bigCount = count;
                finalcount = (Integer) objectArray[i];
            }
        }
        System.out.println("bigCount is --> " + finalcount);
        return finalcount;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        int aLen = objectArray.length;
        int bLen = objectArrayToAdd.length;
        Integer[] result = new Integer[aLen + bLen];

        System.arraycopy(objectArray, 0, result, 0, aLen);
        System.arraycopy(objectArrayToAdd, 0, result, aLen, bLen);

        System.out.println(Arrays.toString(result));

        return result;
    }
}
