


	package sorting;

	import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

	public class Counting3 {
		
		 public static void main(String[] args) {
		        
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		        Scanner in=new Scanner(System.in);
		        int n=in.nextInt();
		        int arr[]=new int[n];
		        int[] cnt =new int[100];
		        String[] s=new String[n];
		        for(int i=0;i<100;i++){
		        	cnt[i]=0;
		        }
		        
		        for(int i=0;i<n;i++){
		            arr[i]=in.nextInt();
		           s[i]=in.next();
		        }
		        for(int i=0;i<n;i++){
		        //	int num=arr[i];
		        //	count+=num;
		       	//cnt[arr[i]]=cnt[arr[i]]+count;
		            cnt[arr[i]]++;
		        }
		        
		        int cumulativeCount[]=Arrays.copyOf(cnt, cnt.length);
		        int count=cumulativeCount[0];
		        for(int i=1;i<100;i++){
		        	count+=cumulativeCount[i];
		        	cumulativeCount[i]=count;
		        }
		        for(int i=0;i<100;i++){
		        	if(cnt[i]>0){
		        		//for(int j=0;j<cnt[i];j++)
		        			System.out.print(s[i]+" ");
		        			//count++;
		        		}
		        }
		        
		        for(int i=0;i<cumulativeCount.length;i++) 
		        System.out.print(cumulativeCount[i]+" ");
		        String test="";
		      //  test.sub
		    }

	}


