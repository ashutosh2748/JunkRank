package test;
import java.io.*;
import java.util.*;

public class Regex {
	

	

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in=new Scanner(System.in);
	        int n=in.nextInt();
	        String[] arr= new String[n];
	        in.nextLine();
	        for(int i=0;i<n;i++){
	            arr[i]=in.nextLine();
	        }
	        List<String> str=new ArrayList();



	        String delimit="@";
	        for(int i=0;i<n;i++){
	            String[] temp=arr[i].split(delimit);

	            if(temp[1].equals("gmail.com")){
	            	str.add(temp[0]);
	            }
	        }
	delimit=" ";
	String[] brr=new String[str.size()];
	int i=0;
	for(String test:str){
	String[] temp=test.split(delimit);
	brr[i]=temp[0];
	i++;
	}
	        
	Arrays.sort(brr);
	        for(int k=0;k<brr.length;k++){
	            System.out.println(brr[k]);
	        }
	    }
	
}
