package String;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int count=1;
        int start=0;
        int next=1;
        int secondnext=2;
        //for(int i=0;)
        while(next<n-2){
        	if(c[next]==0){
        		if(c[secondnext]==1){
        			count++;
        			next=next+1;
        			secondnext=secondnext+1;
        		}
        		else {
        			count++;
            		next=next+2;
            		secondnext=secondnext+2;
        		}
        	}
        	else{
        		count++;
        		next=next+2;
        		secondnext=secondnext+2;
        	}
        }
        System.out.println(count);   //only checked upto second last cloud so one added 
    }

}
