import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	//4 1
    	//3 10 2 9
    	//7
    	Scanner in=new Scanner(System.in);
    	int n=in.nextInt();
    	int k=in.nextInt();
    	int a[]=new int[n];
    	int sum=0;
    	for(int i=0;i<n;i++){
    		a[i]=in.nextInt();
    		sum+=a[i];
    	}
    	int correctsum=sum-a[k];
    	
    	int share=in.nextInt();
    	if(share==correctsum/2)System.out.println("Bon Appetit");
    	else System.out.println(share-correctsum/2);
    	
    	
    	
    }
}