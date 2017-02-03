import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeandDate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        char pmcheck=time.charAt(time.length()-2);
        int hour=Integer.parseInt(time.substring(0,2));
        if(hour<12&&(pmcheck=='p'||pmcheck=='P')){
        	hour+=12;
        	}
        	else {
        		if(hour==12&&(pmcheck=='a'||pmcheck=='A'))
        		hour=00;
        	
        	}
        
        
    	String result=hour+time.substring(2, time.length()-2);
    	if(hour<=9)result="0"+result;
    	System.out.println(result);
        
       
    }
   
}
//12:05:45PM
