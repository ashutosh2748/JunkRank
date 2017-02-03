package WeekOfCode28;

import java.util.Scanner;

public class EfficientXOR {
	
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		int q=in.nextInt();
		for(int k=0;k<q;k++){
		long x=in.nextLong();
		//long tempx=x;
		long count=0;
		//long count1=0;
		
		//int digit=0;
		//int place=0;
		//int semicount=0;
		long num=1;
		long sum2=0;
		while(true){
			count++;
			sum2=num;
			num=num*2;
			
			if(num>x)break;
		}
		
		count=2*sum2-x-1;
		System.out.println(count);
			
		/*for(long a=1;a<tempx;a++){
		//	long value=a^x;
		
			if((a^tempx)>tempx){
				count1++;
				//System.out.println(value);
			}
		}*/
		
	//	System.out.println(count1);
		
	}
		
		
		/*for(int i=0;i<=9;i++){
			for(int j=0;j<=9;j++){
				System.out.print((i^j)+"\t");
			}
			System.out.println();
		}*/
		in.close();
	}

}
