// Count palindrom

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'countPalindromes' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int countPalindromes(String s) {
    // Write your code here
        String a;
        int countSubs=s.length();
        for(int i=0;i<s.length();i++)
        {
          for(int j=i+2;j<=s.length();j++)
          {
            a=s.substring(i,j);
            countSubs+=count(a);
          }
        }
        return countSubs;
    }
    public static int count(String a)
    {
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=a.charAt(a.length()-1-i))
                return 0;
        }

    return 1;

    }

}

public class Solution {
    
    2.//Vowel permutation
        
        if(n == 1) return 5;
        int mod = (int)(1e9+7);
        int[][] trans = new int[][]{{0, 1, 0, 0, 0}, {1, 0, 1, 0, 0}, {1, 1, 0, 1, 1}, {0, 0, 1, 0, 1}, {1, 0, 0, 0, 0}};
        int[][] dp = new int[n][5];
        int res = 0;
        for(int i = 0; i < 5; i++) dp[0][i] = 1;
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < 5; j++) {
                for(int k = 0; k < 5; k++) {
                    if(trans[j][k] == 1) {
                        dp[i][j] = (dp[i][j] + dp[i-1][k]) % mod;
                    }
                }
                if(i == n-1) res = (res + dp[i][j]) % mod;
            }
        }
        return res;
