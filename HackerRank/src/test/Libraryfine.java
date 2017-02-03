package test;

import java.time.LocalDate;
import java.util.Scanner;

public class Libraryfine {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        int d1 = in.nextInt();
	        int m1 = in.nextInt();
	        int y1 = in.nextInt();
	        int d2 = in.nextInt();
	        int m2 = in.nextInt();
	        int y2 = in.nextInt();
	        LocalDate returnDate=LocalDate.of(y1,m1,d1);
	        LocalDate dueDate=LocalDate.of(y2,m2,d2);
	        long fine=0;
	        if(returnDate.isBefore(dueDate)||returnDate.equals(dueDate))fine=0;
	        else if(returnDate.isAfter(dueDate)){
	        	if(returnDate.getYear()==dueDate.getYear()){
	        		if(returnDate.getMonth()==dueDate.getMonth()){
	        			fine=(returnDate.getDayOfYear()-dueDate.getDayOfYear())*15;
	        		}else{
	        				fine=(returnDate.getMonthValue()-dueDate.getMonthValue())*500;
	        		
	        	}
	        		
	        		
	        } else fine=10000;
	     }else fine=10000;
	     System.out.println(fine);
	 }
	 
	 
}
