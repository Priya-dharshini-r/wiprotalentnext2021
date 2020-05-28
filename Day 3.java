1.//Maximum number in array

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int n, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[25];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

2.//Max occur in array

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int n, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[25];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println(max);
        for(int i=1;i<a.length;i++)
        {
          if(max==a[i])
          {
          count++;
          }
    }
    System.out.println(count);
}

3.//Factorial of a number Entered by user

import java.util.Scanner;
public class Fact {

    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}

4.//Remove Duplicate in string

import java.util.*;
public class Removedup{
  public static void main(string []args)
  {
    String str="Malayalam";
    System.out.println(RemoveDuplicate(str));
  }
  public static string RemoveDuplicate(String str)
  {
  //Creating a hash set
    set<Character>Set= new Hashset<>();
    StringBuffer sf = new StringBuffer();
    for(int i=0;i<str.length();i++)
    {
    // converting a string into character array
      Character c= str.charAt(i);
      if(!set.contains(c))
      {
        set.add(c);
        sf.append(c);
      }
    }
  }
  return sf.toString();
}

5.//Perfect square


