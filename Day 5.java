//Language basics 1

class Cmdlinearg
{
  public static void main(String []args)
  {
    System.out.println(args[0]+"technologies"+args[1]);
  }
}

//Hackerank Sum of elements in array

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import jdk.nashorn.internal.objects.ArrayBufferView;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'arraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static int arraySum(List<Integer> numbers) {
    // Write your code here
    Scanner a =new Scanner(System.in);
    //Number of elements
    int n=a.nextInt();
    //Getting elements for array of size n
    int array[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++)
    {
        array[i]=a.nextInt();
        
    }
      for(int i:array)
    {
        sum=sum+array[i];
    }
    
    return sum;
    
    }

}

public class Solution {

  
  //River records 
  
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
     * Complete the 'maxTrailing' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int maxTrailing(List<Integer> arr) {
    // Write your code here
    int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int array[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            array[i] = s.nextInt();
        }
    int maxDiff = -1; 
    
    // Initialize max element from right side 
    int maxRight = array[n-1]; 

    for (int i = n-2; i >= 0; i--) 
    { 
        if (array[i] > maxRight) 
            maxRight = array[i]; 
        else
        { 
            int diff = maxRight - array[i]; 
            if (diff > maxDiff) 
            { 
                maxDiff = diff; 
            } 
        } 
    } 
    return maxDiff; 
    }

}

public class Solution {
