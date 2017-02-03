package sorting;
import java.util.*;

public class QuickSort2 {
	
	
	          static List<Integer> partition(List<Integer> ar) {
	                    int p=ar.get(0);
	                    List<Integer> left=new ArrayList();
	                    List<Integer> right=new ArrayList();
	                    List<Integer> middle=new ArrayList();
	                    for(int i=0;i<ar.size();i++){
	                    	if(p<ar.get(i))right.add(ar.get(i));
	                    	if(p>ar.get(i))left.add(ar.get(i));
	                    	if(p==ar.get(i)) middle.add(ar.get(i));
	                    }
	                    if(left.size()>1)left=partition(left);
	                    if(right.size()>1)right=partition(right);
	                    
	                    left.addAll(middle);
	    				left.addAll(right);
	    				for(int i=0;i<left.size();i++){
	    					System.out.print(left.get(i)+" ");
	    				}
	    				System.out.println();
	    				return left;
	                 
	                    
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
	           List<Integer> arr=new ArrayList();
	           for(int i=0;i<n;i++){
	              ar[i]=in.nextInt();
	              arr.add(ar[i]);
	           }
	           partition(arr);
	       }    
	   }


