package com.zipcodewilmington.assessment1.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtilsTest {
    @Test
    public void getFirstElementTest() {
        // Given
        String[] inputArray = {"The", "quick", "brown"};
        String expected = "The";
        
        // When

        String actual = BasicArrayUtils.getFirstElement(inputArray);
        System.out.println("The final value  in getFirstElementTest is -->"+actual);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSecondTest() {
        // Given
        String[] inputArray = {"The", "quick", "brown"};
        String expected = "quick";

        // When
        String actual = BasicArrayUtils.getSecondElement(inputArray);
        System.out.println("The final value  in getSecondTest is -->"+actual);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastElementTest() {
        // Given
        String[] inputArray = {"The", "quick", "brown"};
        String expected = "brown";

        // When
        String actual = BasicArrayUtils.getLastElement(inputArray);
        System.out.println("The final value  in getLastElementTest is -->"+actual);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSecondToLastElementTest() {
        // Given
        String[] inputArray = {"The", "quick", "brown", "fox"};
        String expected = "brown";

        // When
        String actual = BasicArrayUtils.getSecondToLastElement(inputArray);
        System.out.println("The final value  in getSecondToLastElementTest is -->"+actual);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
