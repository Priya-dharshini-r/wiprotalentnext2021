import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'getLargestString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String getLargestString(String s, int k) {
    // Write your code here
    String largest=s.substring(0,k);
    for(int i=0;i<=s.length()-k;i++)
    {
        String curr=s.substring(i,i+k);
        if(curr.compareTo(largest)>0)
        largest=curr;
    }
    return largest;

    }

}
public class Solution {
