package String;

import java.util.Scanner;

public class Gemstones {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in=new Scanner(System.in);
	        int size=in.nextInt();
	        int[] alpha=new int[26];
	        for(int i=0;i<26;i++){
	            alpha[i]=0;
	        }
	        String input= new String();
	        for(int i=0;i<size;i++)
	            {
	            input=in.next();
	       
	            int test=(int)'a';
	            for(int j=0;j<26;j++){
	       
	            for(int k=0;k<input.length();k++){
	            	
	            	int temp=(int)(input.charAt(k));
	          
	            
	                if(test==temp){
	            
	                	alpha[j]=alpha[j]+1;
	             
	                	break;
	                	}
	               
	         
	            } test++;
	          
	        }
	            }
	        int count=0;
	       for(int i=0;i<26;i++){
	           if(alpha[i]==size)count++;
	       }
	        System.out.println(count);
	    }

}
