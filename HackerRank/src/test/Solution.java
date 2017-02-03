package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
            {
           int N=in.nextInt();
            int M=in.nextInt();
            int K=in.nextInt();
            
            int rem=M%N;
            int count=(K+rem-1)%N;
            if(count==0)System.out.println(N);
            else System.out.println(count);
           // else System.out.println(count);
        }
    }
}