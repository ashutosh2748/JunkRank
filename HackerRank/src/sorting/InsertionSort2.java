package sorting;

import java.util.Scanner;

public class InsertionSort2 {
	
	    
	    

	    public static void insertIntoSorted(int[] ar) {
	        // Fill up this function
	     int count=0;
	    	for(int i=1;i<ar.length;i++){
	        int temp=ar[i];
	        boolean shift=false;
	        
	        int k;
	            for(k=i-1;k>=0&&temp<ar[k];k--){
	            
	                	ar[k+1]=ar[k];count++;shift=true;
	                         }
	            ar[k+1]=temp;
	         //   if(shift==true)count++;
	            //printArray(ar);
	    	}
	     System.out.println(count);
	    }
	    
	    
	/* Tail starts here */
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int[] ar = new int[s];
	        for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	        }
	        insertIntoSorted(ar);
	        in.close();
	    }
	    
	    
	    private static void printArray(int[] ar) {
	        for(int n: ar){
	            System.out.print(n+" ");
	        }
	        System.out.println("");
	    }

}
