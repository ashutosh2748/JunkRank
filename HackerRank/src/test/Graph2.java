package test;

	import java.io.*;
	import java.util.*;

	public class Graph2 {
	   public static void main(String[] args) throws Exception{
	       class Triple{
	    	   int a,b,range;
	    	   Triple(int a,int b){
	    		   this.a=a;
	    		   this.b=b;
	    		   this.range=Math.abs(a-b);
	    	   }
			public int getA() {
				return a;
			}
			public int getB() {
				return b;
			}
			public int getRange() {
				return range;
			}
	    	   
	       }
		   
		   
		   
		   BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	        String[] temp = bfr.readLine().split(" ");
	        int N = Integer.parseInt(temp[0]);
	        int I = Integer.parseInt(temp[1]);
	        List<Triple> triples=new ArrayList();

	        for(int i = 0; i < I; i++){
	            temp = bfr.readLine().split(" ");
	            int a = Integer.parseInt(temp[0]);
	            int b = Integer.parseInt(temp[1]);
	          // Store a and b in an appropriate data structure of your choice
	            
	            triples.add(new Triple(a,b));
	        }
	        long tempo=0;
	        for(Triple t:triples){
	        	tempo=tempo+t.getRange();
	        }
	     //   System.out.println(tempo);
	        long combinations = (long) Math.pow(2, tempo);

	        // Compute the final answer - the number of combinations
	       
	        System.out.println(combinations);

	    }
	}

	 
	



