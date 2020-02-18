package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence)
    {
        //String sampleString = "Apple Banana Carrot";
        String[] animals = sentence.split(" ");
        int animalIndex = 1;
        for (String animal : animals) {
            //System.out.println(animalIndex + ". " + animal);
            animalIndex++;
        }
        System.out.println("The final value in getWords is -->"+ Arrays.toString(animals));
        return animals;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence)
    {
        int i = sentence.indexOf(' ');
        System.out.println(" The value of i is -->"+i);
        String word = sentence.substring(0, i);
        System.out.println(" The first word is -->"+word);
        return word;

    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence)
    {
        String firstWord="";
        firstWord= getFirstWord(sentence);
        System. out. println("The first word to reverse is -->"+firstWord);
        String strNew = "";
        for(int i = firstWord. length() - 1; i >= 0; i--)
        {
            strNew = strNew + firstWord. charAt(i);
        }
        System.out.println(" The reversed string  is -->"+strNew);
        return strNew;

    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence)
    {
        String revFirWord="";
        revFirWord=reverseFirstWord(sentence);

        revFirWord = revFirWord.substring(0, 1).toUpperCase() + revFirWord.substring(1);
        System.out.println(" The camelCase string  is -->" + revFirWord);
        return revFirWord;

    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index)
    {
        String firstPart = str.substring(0, index);
        System.out.println(" The firstPart string  is -->" + firstPart);
        String secondPart = str.substring(index+1);
        System.out.println(" The secondPart string  is -->" + secondPart);
        return firstPart+secondPart;

    }

}
