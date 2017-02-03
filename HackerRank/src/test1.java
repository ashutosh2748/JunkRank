

	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.time.*;

	public class test1 {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
Calendar c=Calendar.getInstance();
c.clear();
c.set(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
System.out.println(c.DAY_OF_WEEK);
	    }
	}



