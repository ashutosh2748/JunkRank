package WeekOfCode28;

import java.util.Scanner;

import test.Solution;

public class Krishna {

    private StringBuilder output = new StringBuilder();
    private final String inputstring;
    long count = 0;
    
    Krishna(final String str){
        inputstring = str;
        combine(str.length()-1);
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // your code goes here
        String s = in.next();
        new Krishna(s);
        in.close();
    }
    
    private void combine(int end ) throws NumberFormatException{
        for( int i = end; i >=end-3; --i ){
            output.append( inputstring.charAt(i) );
            long num = Long.parseLong(output.toString());
            if(num % 8 == 0) {
            	count++;
            	if(i==end-3)count+=output.length()-3;
            	count = count % 1000000007;
            }
            if ( i < inputstring.length() )
            combine( i + 1);
            output.setLength( output.length() - 1 );//output.substring(0, output.length());
        }
        
       
        
    }
    
    public long SubsequenceCounter(String s){
    	if(s.length()<3){
    		
    		 long num = Long.parseLong(s.toString());
    		if(num%8==0)return 1;
    		else return 0;
    	}
    	else return SubsequenceCounter(s.substring(0, s.length()-1))+SubsequenceCounter(s.substring(1, s.length()));
		
    }
    
}
