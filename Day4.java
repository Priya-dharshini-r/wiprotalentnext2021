Hackerank code

1.Find the factors

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
     * Complete the 'pthFactor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER n
     *  2. LONG_INTEGER p
     */

    public static long pthFactor(long n, long p) {
    // Write your code here
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            if(j%i==0)
            {
             System.out.println(j);
            }
        }
    }
    return n;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
    
    
2.//Fizz Buzz

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
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    // Write your code here
    for(int i=1;i<=n;i++)
    {
        if(i%3==0&&i%5==0)
        {
            System.out.println("FizzBuzz");
        }
        else if(i%3==0){
            System.out.println("Fizz");
        }
        else if(i%5==0)
        {
            System.out.println("Buzz");
        }
        else
        {

            System.out.println(i);
        }
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
