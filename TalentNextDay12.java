import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'doesCircleExist' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY commands as parameter.
     */

    public static List<String> doesCircleExist(List<String> commands) {
    // Write your code here
    int x = 0, y = 0;
 
        // assume initial direction is North
        char dir = 'N';
 
        // read each instruction from input String
        for (char ch: str.toCharArray())
        {
            switch (ch)
            {
                // move one unit in same direction
                case 'M':
                    if (dir == 'N') {
                        y++;
                    } else if (dir == 'S') {
                        y--;
                    } else if (dir == 'E') {
                        x++;
                    } else if (dir == 'W') {
                        x--;
                    } break;
 
                // change direction to left of current direction
                case 'L':
                    if (dir == 'N') {
                        dir = 'W';
                    } else if (dir == 'W') {
                        dir = 'S';
                    } else if (dir == 'S') {
                        dir = 'E';
                    } else if (dir == 'E') {
                        dir = 'N';
                    } break;
 
                // change direction to right of current direction
                case 'R':
                    if (dir == 'N') {
                        dir = 'E';
                    } else if (dir == 'E') {
                        dir = 'S';
                    } else if (dir == 'S') {
                        dir = 'W';
                    } else if (dir == 'W') {
                        dir = 'N';
                    }
            }
        }
 
        // if we're back to starting coordinates (0, 0),
        // the move is circular
        return (x == 0 && y == 0);
    }
 

    

}

public class Solution {
    
    2.//
        
        import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'isPangram' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY pangram as parameter.
     */

    public static String isPangram(List<String> pangram) {
    // Write your code here
    boolean[] mark = new boolean[26]; 
  
        // For indexing in mark[] 
        int index = 0; 
  
        // Traverse all characters 
        for (int i = 0; i < str.length(); i++) { 
            // If uppercase character, subtract 'A' 
            // to find index. 
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') 
                index = str.charAt(i) - 'A'; 
  
            // If lowercase character, subtract 'a' 
            // to find index. 
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') 
  
                index = str.charAt(i) - 'a'; 
  
            // If this character is other than english 
            // lowercase and uppercase characters. 
            else
                continue; 
            mark[index] = true; 
        } 
  
        // Return false if any character is unmarked 
        for (int i = 0; i <= 25; i++) 
            if (mark[i] == false) 
                return (false); 
  
        // If all characters were present 
        return (true); 
    } 
  

    

}

public class Solution {
