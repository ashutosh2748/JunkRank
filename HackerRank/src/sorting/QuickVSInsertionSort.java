package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickVSInsertionSort {
			
	
	
	static int swapcount=0;
	  public static int insertIntoSorted(int[] ar) {
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
	   //  System.out.println(count);
	    	return count;
	    }
	    
	    
	/* Tail starts here */
	   
	    
	    
	    private static void printArray(int[] ar) {
	        for(int n: ar){
	            System.out.print(n+" ");
	        }
	        System.out.println("");
	    }
	    
	    public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++){
			arr[i]=in.nextInt();	
			}
			int[] test=Arrays.copyOf(arr, arr.length);
			int count=insertIntoSorted(test);
			inplaceQuickSort(arr);
			System.out.println((count-swapcount));
		//	printArray(arr);
		}
		

		private static void inplaceQuickSort(int[] arr) {
			inplaceQuicksort(arr,0,arr.length-1);
			
		}

		private static void inplaceQuicksort(int[] arr, int iStart, int iEnd) {
			
			if(iStart>=iEnd)return;
			//int range=iEnd-iStart;
			int pivot=iEnd;
			int newPivot=partition(arr,iStart,iEnd,pivot);
			
			inplaceQuicksort(arr,iStart,newPivot-1);
			inplaceQuicksort(arr,newPivot+1,iEnd);
			
		//	printArray(arr);
			
		}

	

		private static int partition(int[] arr, int iStart, int iEnd, int pivot) {
			int valueOfPivot=arr[pivot];
			//swap(arr,pivot,iStart);
			int runningIndex=iStart;
			for(int i=iStart;i<=iEnd-1;i++){
				if(arr[i]<valueOfPivot){
					swap(arr,i,runningIndex);
				//	if(i!=runningIndex)swapcount++;
					runningIndex++;
				}
			}
			swap(arr,runningIndex,iEnd);
		//	swapcount++;
			//return 0;
		//	printArray(arr);
			return runningIndex;
		}

		private static void swap(int[] arr, int from, int to) {
			// TODO Auto-generated method stub
			//int fromValue=arr[from];
			//if(from!=to)
				swapcount++;
			int toValue=arr[to];
			arr[to]=arr[from];
			arr[from]=toValue;
			
		}
	    
}
