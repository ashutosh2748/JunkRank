package sorting;

import java.util.Scanner;

public class Counting {
	
	 public static void main(String[] args) {
	        
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in=new Scanner(System.in);
	        int n=in.nextInt();
	        int arr[]=new int[n];
	        int[] cnt =new int[100];
	      
	        for(int i=0;i<100;i++){
	        	cnt[i]=0;
	        }
	        int count=0;
	        for(int i=0;i<n;i++){
	            arr[i]=in.nextInt();
	           
	        }
	        for(int i=0;i<n;i++){
	       // 	cnt[arr[i]]=cnt[arr[i]]+count;
	            cnt[arr[i]]++;
	        }
	        for(int i=0;i<100;i++){
	        	if(cnt[i]>0){
	        		for(int j=0;j<cnt[i];j++)
	        			System.out.print(i+" ");
	        		}
	        }
	       // for(int i=0;i<n;i++) 
	      //  System.out.print(cnt[i]+" ");
	    }

}
