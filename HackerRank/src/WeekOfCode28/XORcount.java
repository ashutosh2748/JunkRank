package WeekOfCode28;

import java.util.Scanner;

public class XORcount {
	public static void main(String [] args){
		Scanner in =new Scanner(System.in);
		int q=in.nextInt();
		for(int k=0;k<q;k++){
		long x=in.nextLong();
		long count=0;
		
		
		
		for(long a=1;a<x;a++){
		//	long value=a^x;
		
			if((a^x)>x){
				count++;
				//System.out.println(value);
			}
		}
		System.out.println(count);
		
	}
	}

	
}
