import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bakwas {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	String abc="abab";
    	int m=abc.length();
 	   int n=abc.length();
    	System.out.println(isSquare(abc));
    	System.out.println(subseqSquare(abc,m,n));

    	
    }
   public static boolean isSquare(String str){
	   if(str.length()%2==1)return false;
	   else {
		   int m=str.length();
		   if((str.substring(0, m/2)).equals(str.substring(m/2,m)))return true;
	   }
	   return false;
	       	
    }
   hjasfgjasgf
   public static int subseqSquare(String str,int m ,int n){
	   
	   if(m<2||n<2)return 0;
	   
	   else if(isSquare(str))return 1+subseqSquare(str.substring(0, m-1),m-1,n-1);
	   		else return subseqSquare(str.substring(0, m-1),m-1,n)+subseqSquare(str.substring(1, m),m,n-1);
	   
   }
   
}