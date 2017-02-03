package WeekOfCode28;

import java.util.Scanner;

public class LuckyNumber8 {
	
	public static void main(String srgs[]){
		Scanner in=new Scanner(System.in);
		
		long finalresult=0;
		int n=in.nextInt();
		//in.next(); //to deal with remaining chaartcters in the line
		String abc=in.next();
		int size=abc.length();
		int[][] seq=new int [size+1][4];
		for(int i=1;i<size+1;i++){
			seq[i][0]=(abc.charAt(i-1)-48);
			seq[i][1]=i;
			
		}
		int sum=0;
		for(int i=0;i<size+1;i++){
		//	if(seq[i][0]%8==0)finalresult++;
			sum+=seq[i][0];
			//sum=sum%8;
			seq[i][2]=sum;
			
		}
		for(int i=0;i<size+1;i++){
			//	if(seq[i][0]%8==0)finalresult++;
				//sum+=seq[i][0];
				//sum=sum%8;
				seq[i][3]=seq[i][2]%8;
				
			}
		
		int[] result=new int[8];
		
			  for(int j=0;j<size+1;j++){
				  for(int i=0;i<8;i++){
				  if(seq[j][3]==i)result[i]++;
			  }
	}
			  
			  for(int i=0;i<8;i++){
				  finalresult+=result[i];
			  }
			//  finalresult=finalresult+result[0];
			  System.out.println();
			  System.out.println(finalresult%(int)((Math.pow(10, 9)+7)));
			  
			  }

}
