package com.zipcodewilmington.assessment1.part1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        str = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(" The camelCase string  is -->" + str);
        return str;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {


        System.out.println("Enter string to reverse:");
        String strNew = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strNew = strNew + str.charAt(i);
        }
        System.out.println(" The reversed string  is -->" + strNew);
        return strNew;


    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        System.out.println("Enter string to reverse:");
        String strNew1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strNew1 = strNew1 + str.charAt(i);


        }
        strNew1 = strNew1.substring(0, 1).toUpperCase() + strNew1.substring(1);

        System.out.println(" The reversed string  is -->" + strNew1);


        return strNew1;
    }

    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str)
    {
        String str1 = str.substring(1,str.length()-1);
        System.out.println("In the function str is -->"+str1);
        return str1;
    }


    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {


        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.isUpperCase(chars[i])
                    ? Character.toLowerCase(chars[i])
                    : Character.toUpperCase(chars[i]);
        }
        return new String(chars);


    }
}
