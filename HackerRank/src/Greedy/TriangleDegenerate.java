package Greedy;

import java.util.Scanner;

public class TriangleDegenerate {
	
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner in=new Scanner(System.in);
	        int n=in.nextInt();
	        long [] sides= new long[n];
	        for(int i=0;i<n;i++){
	             sides[i]=in.nextLong();
	        }
	        sides=insertIntoSorted(sides);
	        
	        for(int i=n-1;i>1;i--){
	        	long a=(sides[i]);
	        	long b=(sides[i-1]);
	        	long c=(sides[i-2]);
	            if(isTriangle(a,b,c)){
	                System.out.println(sides[i-2]+" "+sides[i-1]+" "+sides[i]);
	                System.exit(0);
	            }
	            
	        }
	        System.out.println("-1");
	        
	    }
	    
	    public static boolean isTriangle(long a,long b,long c){
	        if(a+b>c&&a+c>b&&b+c>a)return true;
	        else return false;
	    }
	     public static long [] insertIntoSorted(long [] ar) {
		        // Fill up this function
		     int count=0;
		    	for(int i=1;i<ar.length;i++){
		        long temp=ar[i];
		        boolean shift=false;
		        
		        int k;
		            for(k=i-1;k>=0&&temp<ar[k];k--){
		            
		                	ar[k+1]=ar[k];count++;shift=true;
		                         }
		            ar[k+1]=temp;
		         //   if(shift==true)count++;
		            //printArray(ar);
		    	}
		   //  System.out.println(count);
	         return ar;
		    }
		    
	    

}
