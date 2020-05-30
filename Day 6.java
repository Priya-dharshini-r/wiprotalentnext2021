//Dam Design

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'maxHeight' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY wallPositions
     *  2. INTEGER_ARRAY wallHeights
     */

    public static int maxHeight(List<Integer> wallPositions, List<Integer> wallHeights) {
    int n=wallPosition.length;
    int m=wallHeight.length;
    int max=0;
    for(int i=0;i<n-1;i++)
    {
        if(wallPosition[i]<wallPosition[i+1]-1)
        {
            int heightDiff=Math.abs(wallHeight[i+1]-wallPosition[i]);
            int gaplen=wallPosition[i+1]-wallPosition[i]-1;
            int localmax=0;
            if(gaplen>heightdiff)
            {
                int low=Math.max(wallHeight[i+1],StickHeights[i]+1);
                int remaingap=gaplen-heightdiff-1;
                localmax=low+remaingap/2;
            }
            else{
                localmax=Math.min(wallHeight[i+1],wallHeight[i]+gaplen);

            }
            max=Math.max(max,localmax);

        }
    }
    return max;

    }

    

}

public class Solution {

    
    //substring coin
    
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'fewestCoins' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING coins as parameter.
     */

    public static int fewestCoins(String coins) {
    // Write your code here
    int count[]=new int[limit];
    for(int i=0;i<n;i++)
    {

        count[str.charAt(i)]++;
    }
    int max_distinct=0;
    for(int i=0;i<limit;i++)
    {
        if(count[i]!=0)
        {
            max_distinct++;
        }
    }
    return max_distinct;

    }

}

public class Solution {

    
    //alphabetically sorting an array
    
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'smallestString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY substrings as parameter.
     */

    public static String smallestString(List<String> substrings) {
    // Write your code here
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]+a[j])compareTo(a[j]+a[i]>0);
            {
                String s= a[i];
                a[i]=a[j];
                a[j]=s;
            }
        }
    }

    }
    static string lexSmallest(Strin a[],int n)
    {
        sort(a,n);
        String answer=" ";
        for(int i=0;i<n;i++)
        answer+=a[i];
        return answer;
    }

}
public class Solution {
