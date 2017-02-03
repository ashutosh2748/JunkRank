

	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class FourLoops {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int arr_i=0; arr_i < 6; arr_i++){
	            for(int arr_j=0; arr_j < 6; arr_j++){
	                arr[arr_i][arr_j] = in.nextInt();
	            }
	        }
	        
	        int max=-2000;
	        int sum=0;
	        for(int arr_i=0; arr_i <=3; arr_i++){
	            for(int arr_j=0; arr_j <= 3; arr_j++){
	                
	            	
	            	for(int k=arr_i;k<arr_i+3;k++)
	            		for(int l=arr_j;l<arr_j+3;l++) {
	            			if((k-arr_i==0||k-arr_i==2))
	            										
	            	sum+=arr[k][l];
	            	else if(k-arr_i==1)if(k-arr_i==l-arr_j)sum+=arr[k][l];
	            										}
	            if(max<sum)max=sum;
	            sum=0;
	    }
	            
	
	        
	        }
System.out.println(max);
}
	}