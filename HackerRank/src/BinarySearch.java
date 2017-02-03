import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BinarySearch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in=new Scanner(System.in);
    	int N=in.nextInt();
    	int m=in.nextInt();
    	int[] array=new int[m];
    	for(int i=0;i<m;i++){
    		array[i]=in.nextInt();
    	}
    	System.out.println(search(N,0,m,array));
    	
    }

	private static int search(int n, int start, int end, int[] array) {
		// TODO Auto-generated method stub
		int temp=(start+end)/2;
		if(n==array[temp])return temp;
		if(n>array[temp])return search(n,temp,end,array);
		else return search(n,start,temp,array);
	}
}