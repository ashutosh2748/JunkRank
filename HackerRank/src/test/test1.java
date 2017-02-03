package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int score=100;
        int pos=0;
        while(true){
            score--;
            pos=(pos+k)%n;
            if(c[pos]==1)score=score-2;
            if(pos==0)break;
            
            
        }
        System.out.println(score);
    }
}
