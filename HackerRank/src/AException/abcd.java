package AException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class abcd {
	 public static void main(String[] args) {
	        Scanner in=new Scanner(System.in);
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        try {
	            int i=in.nextInt();
	            int j=in.nextInt();
	            int k=i/j;
	            System.out.println(k);
	    }
	        catch(InputMismatchException e){
	        	System.out.println("java.util.InputMismatchException");
	        }
	        catch(Exception e){
	           // if(e.)
	            System.out.println(e.getLocalizedMessage());
	        }
	    }

}
