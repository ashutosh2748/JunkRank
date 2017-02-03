package dynamic;

import java.math.BigInteger;
import java.util.Scanner;

/*     
 * Output at one typical time 
 
Value of n 50
Starttime in milliseconds 0
Fibonacci brute
12586269025
Brute Counter
40730022147
Time taken by bruteforce 119976
Fibonacci Memoised
12586269025
Memoised Counter
99
Time taken by memoised 1

*/


public class Fibonacci {
	
	static BigInteger result[];
	static long counterbrute=0;
	static long counter=0;
	public static void main(String[] args) {
			
		
		
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		
	
		int n=in.nextInt();
		result=new BigInteger[n];
		for(int i=0;i<n;i++)
			result[i]=BigInteger.valueOf(-1);
		
		result[0]=BigInteger.valueOf(a);
		result[1]=BigInteger.valueOf(b);
		System.out.println(FibonacciMemoised(n-1,a,b));
	
		

	}

	private static BigInteger FibonacciMemoised(int n,int a,int b) {
		// TODO Auto-generated method stub
		//counter++;
		if(result[n].compareTo(BigInteger.ZERO)<0){
						if(n==0){
							return BigInteger.valueOf(a);
						}
			if(n==1){
				return BigInteger.valueOf(b);
				}
			else 
				{
				result[n]= FibonacciMemoised(n-2,a,b).add(FibonacciMemoised(n-1,a,b).multiply(FibonacciMemoised(n-1,a,b)));
					}
					}
			
		return result[n];
		
	}

	
	private static long FibonacciBrute(int n) {
		counterbrute++;
		if(n==0)return 0;
		if(n==1)return 1;
		else return (FibonacciBrute(n-1)+FibonacciBrute(n-2));
	}
	
	

}