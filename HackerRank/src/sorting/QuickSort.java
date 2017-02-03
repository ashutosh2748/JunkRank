package sorting;
import java.util.*;

public class QuickSort {
	
	
	          static void partition(int[] ar) {
	                    int p=ar[0];
	                    List<Integer> left=new ArrayList();
	                    List<Integer> right=new ArrayList();
	                    List<Integer> middle=new ArrayList();
	                    for(int i=0;i<ar.length;i++){
	                    	if(p<ar[i])right.add(ar[i]);
	                    	if(p>ar[i])left.add(ar[i]);
	                    	if(p==ar[i]) middle.add(ar[i]);
	                    }
	                    for(Integer i:left){
	                    	System.out.print(i+" ");
	                    }
	                    for(Integer i:middle){
	                    	System.out.print(i+" ");
	                    }
	                    for(Integer i:right){
	                    	System.out.print(i+" ");
	                    }
	                  //  for(int i=0;i<ar.length;i++);
	                    
	       }   
	 
	 static void printArray(int[] ar) {
	         for(int n: ar){
	            System.out.print(n+" ");
	         }
	           System.out.println("");
	      }
	       
	      public static void main(String[] args) {
	           Scanner in = new Scanner(System.in);
	           int n = in.nextInt();
	           int[] ar = new int[n];
	           for(int i=0;i<n;i++){
	              ar[i]=in.nextInt(); 
	           }
	           partition(ar);
	       }    
	   }


