import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Leftrotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
       int rotate=k;
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        if(k>n)rotate=k%n;
        int pos=0,temp,temp2;
        int count=0;
        int pos2=0;
        int temp1=a[pos];
        int vv=0;
        while(count<n)
        {
        	pos2=pos;
        	pos=(pos-rotate)%n;
        	//if(pos==pos2)pos=(pos+1)%n;
            if(n%2==0&&k%2==0&&vv==2){
            	pos=pos+1;
            	vv=0;
            	
            }

        	if(pos<0)pos=pos+n;
        	temp=a[pos];
        	a[pos]=temp1;
        	temp1=temp;
        	count++;
        	vv++;
        }
         
        for(int a_i=0; a_i < n; a_i++)
        System.out.printf("%d ",a[a_i]);
    	
    }
}