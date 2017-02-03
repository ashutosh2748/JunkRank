package String;

import java.util.Scanner;
import java.util.stream.Stream;

public class Dimple {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        String test=s;//=new StringBuilder(s);
      //  int m=n/s.length();
        long count=0;
       //stream=s1;
      //  Stream<String> s1;
       // s1.iterator();
        long counter=0;
       // String testString=new String(s);
       // String first=new String();
       long rem=n%s.length();
       long div=n/s.length();
       for(int i=0;i<s.length();i++){
    	   if(s.charAt(i)=='a')count++;
       }
       counter=count*div;
       for(int i=0;i<rem;i++){
    	   if(s.charAt(i)=='a')counter++;
       }
       
        System.out.print(counter);
       
    }
}
