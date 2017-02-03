package hackerStack;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Heaptest {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        Queue<Integer> result=new PriorityQueue<Integer>();
      //  Stack<Integer> result=new Stack();
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
       
        for(int i=0;i<n;i++){
        	 int mindistance=n+1;
            int temp=A[i];
            int distance=-1;
            for(int j=0;j<n;j++){
                if(i!=j){
                	if(temp==A[j]){
                		distance=Math.abs(i-j);
                	
                    
                	}
                }
            }
            if(distance<mindistance)mindistance=distance;
            result.add(mindistance);
           
           
        }
        int res=0;
        System.out.println(result);

        while((!result.isEmpty())&&result.peek()==-1)res=result.remove();
        if(result.isEmpty())System.out.println("-1");
        else System.out.println(result.peek());
        System.out.println();
    }
	

}
