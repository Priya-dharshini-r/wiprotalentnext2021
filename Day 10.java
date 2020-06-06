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
    
    //
    
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'getMinDeletions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int getMinDeletions(String s) {
    // Write your code here
    if (left == 'a') {
            if (right == 'b')
                return 'c';
            if (right == 'c')
                return 'b';
        }

        if (left == 'b') {
            if (right == 'a')
                return 'c';
            if (right == 'c')
                return 'a';
        }

        if (left == 'c') {
            if (right == 'a')
                return 'b';
            if (right == 'b')
                return 'a';
        }

        return left;
    }


    public static int reduction(String a) {

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < a.length(); i++) {
            char res = a.charAt(i);
            while (!stack.empty()) {
                char peek = stack.peek();
                if (peek == res)
                    break;
                else {
                    char popped = stack.pop();
                    res = redux(res, popped);
                }
            }
            stack.push(res);
        }
        return stack.size();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);

        for (int i = 0; i < N; i++) {
            String p = br.readLine();
            int res = Solution.reduction(p);
            System.out.println(res);
        }

    }
    }

public class Solution {
