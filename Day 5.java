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
