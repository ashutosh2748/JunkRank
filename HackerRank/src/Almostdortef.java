	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;


public class Almostdortef {


	

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in =new Scanner(System.in);
	        int n=in.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++){
	            a[i]=in.nextInt();
	        }
	        int swapCounterx=-1;
	        int reverseCounterx=-1;
	        int swapCountery=n-1;
	        int reverseCountery=-1;
	            int swappable=0;
	        int reversable=0;
	        for(int i=0;i<n-1;i++){
	            
	            if(swappable==1){
	                if(a[i]>a[i+1])swappable++;
	                if(a[i]<a[swapCounterx])swappable++;
	                if(a[swapCounterx]<a[i+1])swapCountery=i;
	            }
	            
	            else if(a[i]>a[i+1]){
	                swapCounterx=i;
	                swappable++;
	            }
	            if(swappable>1)break;
	                      
	            
	        }
	        for(int i=0;i<n-1;i++){
	            if(reversable==1){
	                if(a[i]>a[i+1])reverseCountery=i+1;
	               // else reversable++;
	                
	            }  if(reversable>1){
	                if(a[i]>a[i+1])reversable++;
	            }
	            
	            
	            
	            else if(a[i]<a[i+1]){
	                reverseCounterx=i+1;
	                reversable++;
	            }
	            if(reversable>2)break;
	          }
	        if(swappable==0&&reversable==0)System.out.printf("yes");
	        if(swappable==1){System.out.printf("yes\nswap %d %d",swapCounterx+1,swapCountery+1);}
	        else if(reversable==2){
	            System.out.printf("yes\nreverse %d %d",reverseCounterx+1,reverseCountery+1);
	        }
	        else System.out.printf("no");
	                         
	        
	    }
	
}
