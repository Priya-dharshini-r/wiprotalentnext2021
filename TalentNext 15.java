//Permutation of 8

 if (l < 3)  
        { 
            if (Integer.parseInt(n) % 8 == 0) 
                return true; 
      
            // check for the reverse 
            // of a number 
            n = new String((new StringBuilder()).append(n).reverse()); 
              
            if (Integer.parseInt(n) % 8 == 0) 
                return true; 
            return false; 
        } 
      
        // Stores the Frequency of 
        // characters in the n. 
        int []hash = new int[10]; 
        for (int i = 0; i < l; i++) 
            hash[n.charAt(i) - '0']++; 
      
        // Iterates for all  
        // three digit numbers 
        // divisible by 8 
        for (int i = 104; i < 1000; i += 8)  
        { 
            int dup = i; 
      
            // stores the frequency of  
            // all single digit in  
            // three-digit number 
            int []freq = new int[10]; 
            freq[dup % 10]++; 
            dup = dup / 10; 
            freq[dup % 10]++; 
            dup = dup / 10; 
            freq[dup % 10]++; 
      
            dup = i; 
      
            // check if the original  
            // number has the digit 
            if (freq[dup % 10] >  
                hash[dup % 10]) 
                continue; 
            dup = dup / 10; 
      
            if (freq[dup % 10] >  
                hash[dup % 10]) 
                continue; 
            dup = dup / 10; 
      
            if (freq[dup % 10] >  
                hash[dup % 10]) 
                continue; 
      
            return true; 
        } 
      
        // when all are checked  
        // its not possible 
        return false;

//k Subsequences

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'kSub' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY nums
     */

    public static long kSub(int k, List<Integer> nums) {
    // Write your code here
    int size = arr.length;
                // list is used to print the pairs
                Map<Integer, List<Integer>> hashMap = new HashMap<Integer, List<Integer>>();
                
                int currentSum = 0;
                for (int index = 0; index < size; index++) {
                        currentSum += arr[index];
                        List<Integer> list = hashMap.get(currentSum % k);
                        if (null != list) {
                                list.add(index);

                        } else {
                                list = new ArrayList<Integer>();
                                list.add(index);
                        }
                        hashMap.put(currentSum % k, list);
                }
                
                int noOfSubArray = 0;
                for(Map.Entry<Integer, List<Integer>> entry : hashMap.entrySet()) {
                        Integer key = entry.getKey();
                        Integer listSize = entry.getValue().size();
                        if(key == 0) {
                                noOfSubArray += (listSize*(listSize+1))/2;
                        } else {
                                noOfSubArray += (listSize*(listSize-1))/2;
                        }
                }
                
                System.out.println("No of subArray in O(k+n) time complexity "+noOfSubArray);
                
        }

    }


public class Solution {
