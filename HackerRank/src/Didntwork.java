import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Didntwork {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int maxA=a[0];
        int minB=b[0];
        for(int a_i=0; a_i < n; a_i++){
            if(maxA<a[a_i])maxA=a[a_i];
        }
        for(int b_i=0; b_i < m; b_i++){
        	if(minB>b[b_i])minB=b[b_i];
        }
        int count=0;
        for(int i=maxA;i<=minB;i++)
        	for(int a_i=0; a_i < n; a_i++){
                if(i%a[a_i]==0)
                	for(int b_i=0; b_i < m; b_i++){
                    	if(a[a_i]%i==0)count++;
                    	else break;
                    }
                else break;
            }
        System.out.println(count);
    }
}