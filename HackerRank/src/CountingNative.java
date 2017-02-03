import java.util.Scanner;

public class CountingNative {

	

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        long t = in.nextLong();
	        long m=3;
	         long i=0;
	        boolean flag=true;
	        while(flag){
	               i=m;
	            while(i>0){
	                i--;
	                t--;
	                if(t==0){flag=false;System.out.println(i+1);break;}
	            }
	            m=2*m;
	         
	        }
	        
	    }
	}

