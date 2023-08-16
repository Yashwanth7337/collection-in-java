import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class yes {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    
           if(N%2==0)
           {
              System.out.println("Weird");
           }
           else if(N%2==0)
           {
              for(int i=2;i<=5;i++)
              {
                  System.out.println("Not Weird");
              }
           } 
              else if(N%2==0)
              {
                  for(int i=6;i<=20;i++)
                  {
                   System.out.println("Weird");
              }
              }
              else if(N%2==0)
              {
                  for(int i=20;i<100;i++)
                  {
                      System.out.println("Not Weird");
                  }
              }
              else{
                  System.out.println("Weird");
              }
           }
        
    
}

