//Price  

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'priceCheck' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY products
     *  2. FLOAT_ARRAY productPrices
     *  3. STRING_ARRAY productSold
     *  4. FLOAT_ARRAY soldPrice
     */

    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
    // Write your code here
    function verifyItems(origItems,origPrices,items,prices)
    {
        var changeCount=0;
        for(var i=0;i<items.length;i++)
        {
            System.out.println(origItems.indexOf(items[i]));
            if(prices[i]!==origPrices[origItems.indexOf(items[i])]){
                changeCount+=1;
            }
        }
        System.out.println(changeCount);

        return changeCount;
    }


    }

}

public class Solution {
