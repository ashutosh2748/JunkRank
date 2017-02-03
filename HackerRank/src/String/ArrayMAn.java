package String;

import java.util.Scanner;

public class ArrayMAn {
	 public static void main(String[] args) {
	     Scanner in =new Scanner(System.in);
	     int n=in.nextInt();
	     int[] a=new int[n];
	     for(int i=0;i<n;i++){
	    	 a[i]=in.nextInt();
	     }
	     int maxcount=0;
	     for(int j=0;j<n;j++){
	     int temp=a[j];
	     int count=0;
	     
	     for(int i=0;i<n;i++){
	    	 if(a[i]==temp)count++;
	     }
	     if(maxcount<count)maxcount=count;
	     }
	     System.out.println(n-maxcount);
		 
		 
		 
		 
		 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    }

}
