package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

public class Palindrome {

    public Integer countPalindromes(String input)
    {

     Integer count=0;
     for(int i = 0;i<input.length(); i++) {
         for (int j= i+1; j<input.length()+1;j++) {
             if(isPalindromic(input.substring(i,j))){
                 count++;
             }
         }
     }
      return count;

    }
    public static boolean isPalindromic(String str){
        return str.equals(BasicStringUtils.reverse(str));
    }
    public static String reverseStr(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
