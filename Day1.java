import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import java.util.HashSet;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Set<Character> set = new HashSet<Character>();/*Using hash charter is matched with vowel*/
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(isVowel(c))
            {
                set.add(c);
            }
        }
        /*using for each loop print vowel in string*/
        for(Character c:set){
            System.out.println(c);
        }
        sc.close();
    }
    /*isVowel function is to pass the character*/
    public static boolean isVowel(char character)
    {

        /*if any vowel is found using or print that vowel*/
        if(character=='a'|| character=='e'||character=='i'||character=='i'||character=='o'||character=='u'){
            return true;
        }
        else
        {
            return false;
        }
    }
}
