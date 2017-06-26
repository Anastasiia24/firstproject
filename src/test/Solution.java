package test;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n==1 || n==2) {System.out.println("1");}
        else
        {System.out.println(fib(n-2,1,1));}
    }

      private static long fib(long n,long a1, long a2){

        if (n!=0)
         { return fib(n-1, a2,a1+a2); }
         else { return a2;}
        }



}
