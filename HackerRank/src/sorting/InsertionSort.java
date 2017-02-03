package sorting;

import java.util.Scanner;

public class InsertionSort {
	
	    
	    

	    public static void insertIntoSorted(int[] ar) {
	        // Fill up this function
	      //  for(int j=ar.length-1;j>=0;j--){
	    	for(int i=ar.length-1;i>0;i--){
	        int temp=ar[i];
	        //boolean flag=false;
	        boolean shift=false;
	            for(int k=i-1;k<=i&&k>=0;k--){
	            	
	                if(temp<ar[k]){ar[k+1]=ar[k];
	                
	                printArray(ar);
	                if(k==0){ar[0]=temp;printArray(ar);}
	                shift=true;
	                }
	                else {
	                	ar[k+1]=temp;
	                	if(shift)printArray(ar);
	                	break;
	                	}
	               
	                         }
	            
	    	}
	        
	            
	        //}
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
