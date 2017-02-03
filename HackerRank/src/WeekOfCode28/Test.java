package WeekOfCode28;

import java.util.Scanner;

public class Test {
	
	public static void main(String srgs[]){
		Scanner in=new Scanner(System.in);
		
		long finalresult=0;
		//int n=in.nextInt();
		//in.next(); //to deal with remaining chaartcters in the line
		String abc=in.next();
		int size=abc.length();
		int[] seq=new int [size];
		for(int i=1;i<size;i++){
			seq[i]=(abc.charAt(i-1)-'0');
			//seq[i][1]=i;
			
		}
		/*for(int i=1;i<size;i++){
			seq[i][0]=(abc.charAt(i-1)-'0');
			seq[i][1]=i;
			
		}
		int sum=0;
		for(int i=0;i<size+1;i++){
			if(seq[i][0]%8==0)finalresult++;
			sum+=seq[i][0];
			sum=sum%8;
			seq[i][2]=sum;
			
		}
		int[] result=new int[8];
		
			  for(int j=0;j<size+1;j++){
				  for(int i=0;i<8;i++){
				  if(seq[j][2]==i)result[i]++;
			  }
	}
			  
			  for(int i=0;i<8;i++){
				  finalresult+=(result[i]*(result[i]-1))/2;
			  }
			//  finalresult=finalresult+result[0];
*/			  
			  System.out.println(solve(seq,8));
			  System.out.println(kSub(8, seq));
			  
			  }

	
	
	public static int solve(int[] arr, int d)
	 {
	//  Object o;
	  int Answer = 0;
	  int[] hash = new int[d];

	  int sum = 0;
	  int val;
	  int num;

	  for (int i = 0; i < arr.length; i++) {
	   num = arr[i];

	   if(num % d == 0) // count numbers which are divisible by divisor
	    Answer ++ ;

	   sum +=  num; 
	   val = sum % d;

	   if(val<0) //handle negative numbers
	    val = val * (-1);

	   hash[val] = hash[val] + 1;
	  }

	  int size=hash.length ;
	  for (int i = 0; i < size; i++)  {
	   int count = hash[i];

	   if(count > 1)
	    Answer = Answer + count * (count -1)/2 ;
	  }
	  System.out.println(Answer+hash[0]);
	  return Answer+hash[0];
	 } 
	
	static long kSub(int k, int[] nums) {
	    

	    int [] sum = new int[nums.length];
	    long count = 0;    
	    sum[0] = nums[0];
	    
	    for(int i = 1; i < nums.length; i++){
	        sum[i] = sum[i-1] + nums[i];
	    }
	    
	    int [] kVal = new int[k];
	    
	    for(int i = 0; i < sum.length; i++){       
	        int mod = sum[i] % k;

	        if(mod == 0)
	            count++;

	        count += kVal[mod];
	        kVal[mod] += 1;
	             
	    }
	    return count;
	}

}
