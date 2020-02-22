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

        int counter=0;
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
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove)
    {
        //Object[] result = new Object[objectArray.length];
        //System.out.println("Value to remove is -->"+objectToRemove);
       // int j=0;
        //int count =0;
        for (int i = 0; i <objectArray.length; i++)
        {
            if (objectArray[i].equals(objectToRemove))
            {
                System.out.println("in i  is -->"+i);
                System.out.println("in IF the value  of objectArray  is -->"+objectArray[i]);
                System.out.println("in IF the value  to remove is -->"+objectToRemove);
                for(int j=i; j<objectArray.length-1; j++)
                {
                    objectArray[j] = objectArray[j+1];
                }
                //count++;
                System.out.println("objectArray  in IF  is -->"+ Arrays.toString(objectArray));

                //break;
            }
           // System.out.println("Result is -->"+objectArray.toString());
        }
        System.out.println("objectArray   is -->"+ Arrays.toString(objectArray));
        return objectArray;

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
            int count = 0;
            int bigCount = 0;

            for (int i=0; i < objectArray.length; i++) {
                for (int j=0; j < objectArray.length; j++) {
                    if(objectArray[j] == objectArray[i]) {
                        count++;
                    }
                }
                if(count > bigCount) {
                    bigCount = count;
                    objectArray[i] = bigCount;
                }
            }
            return objectArray;



        }







    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        return null;
    }
}
