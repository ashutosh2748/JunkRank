import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RevPyramid {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
        	for(int j=1;j<=n;j++)
        		if(i<=n-j)
        			System.out.print(" ");
        		else 
        	System.out.print("#");

        System.out.println();
        }
    }
}
