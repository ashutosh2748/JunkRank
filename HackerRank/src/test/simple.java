package test;

import java.util.*;

public class simple {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String test=in.nextLine();
        test=test.replaceAll("\\s", "");
        test=test.toLowerCase();
        //in.nextLine()
        int[] test1=new int[26];
        for(int i=0;i<26;i++){
            test1[i]=-1;
        }
        for(int i=0;i<test.length();i++){
            int temp=0;
            temp=(int)test.charAt(i)-(int)'a';
           // if(temp<0)temp=temp-(int)'A'+(int)'a';
            test1[temp]=1;
            
        //    if(test.charAt(i)=='A'!!test.charAt(i)=='a')
        }
        int sum=0;
        for(int i=0;i<26;i++){
        	sum+=test1[i];
        }
        if(sum==26)System.out.println("pangram");
        else System.out.println("not pangram");
        in.close();

    }
	
}
