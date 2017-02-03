package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in=new Scanner(System.in);
    	int start=in.nextInt();
    	int end=in.nextInt();
    	int k=in.nextInt();
    	int count=0;
    	for(int i=start;i<=end;i++){
    		int sum=Math.abs((i-rev(i)));
    		if(sum%k==0)count++;
    		
    	}
    	System.out.println(count);
    }

	private static int rev(int i) {
		int x=0;
		while(i!=0){
			x=x*10;
			x+=i%10;
			i=i/10;
			
		}
		return x;
	}
}