import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        long diagPrimary=0;
        long diagSecondary=0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++)
            	{
            	if(a_i==a_j)diagPrimary+=a[a_i][a_j];
            	if(a_i==n-a_j-1)diagSecondary+=a[a_i][a_j];
            	}
        
        }
        System.out.println(Math.abs(diagPrimary-diagSecondary));
        
    }
}
