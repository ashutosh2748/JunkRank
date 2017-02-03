package hackerStack;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PoisionousPlant {

	

	

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    Scanner in=new Scanner(System.in);
	    	int n=in.nextInt();
	    	Stack<Integer> A=new Stack();
	    	Integer a[]=new Integer[n];
	    	int temp1=0,temp2=0;
	    	a[0]=in.nextInt();
	    	temp1=a[0];
	    	int count=0;
	    	int count1=0;
	    for(int i=1;i<n-1;i++){
	    	//A.push(in.nextInt());
	    	
	    	temp2=in.nextInt();
	    	if(temp1>=temp2){
	    //	a[j]=temp2;
	    		A.push(temp2);
	    	//j++;
	    	//	temp1=temp2;
	    	}
	    	else {count1++;}
	    	temp1=A.peek();
	    }
	  //  List l=Arrays.asList(a);
	 //   A.addAll(l);
	   // int count=0;
	    boolean flag=true;
	    Stack<Integer> B=new Stack();
	    while(true){
	    	
	    	int size=A.size();
	    	while(!A.isEmpty()){
	    		
	    		int top=A.pop();
	    		if(!A.isEmpty())
	    		{
	    			if(top<=A.peek())B.push(top);
	    			}
	    		else B.push(top);
	    		//else {flag=false;}
	    	}
	    	if(size==B.size())break;
	    	while(!B.isEmpty()){
	    		A.push(B.pop());
	    	}
	    	count++;
	    	
	    }
	   // System.out.println(count+1);
	    System.out.println(n-count1);
	    
	    	
	    	
	    	
	    }
	}

