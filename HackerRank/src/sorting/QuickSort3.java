package sorting;

import java.util.Scanner;

public class QuickSort3 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){
		arr[i]=in.nextInt();	
		}
		
		inplaceQuickSort(arr);
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

	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
	}


	private static int partition(int[] arr, int iStart, int iEnd, int pivot) {
		int valueOfPivot=arr[pivot];
		//swap(arr,pivot,iStart);
		int runningIndex=iStart;
		for(int i=iStart;i<=iEnd-1;i++){
			if(arr[i]<valueOfPivot){
				swap(arr,i,runningIndex);
				runningIndex++;
			}
		}
		swap(arr,runningIndex,iEnd);
		//return 0;
		printArray(arr);
		return runningIndex;
	}

	private static void swap(int[] arr, int from, int to) {
		// TODO Auto-generated method stub
		//int fromValue=arr[from];
		int toValue=arr[to];
		arr[to]=arr[from];
		arr[from]=toValue;
		
	}

}
