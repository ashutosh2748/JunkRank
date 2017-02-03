import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Intarraycomparisionwithzero {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        float lessThanZero=0,moreThanZero=0,zero=0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int arr_i=0; arr_i < n; arr_i++){
        	if(arr[arr_i]<0)lessThanZero++;
        	else if(arr[arr_i]==0)zero++;
        	else moreThanZero++;
        }
        System.out.printf("%f\n%f\n%f",moreThanZero/n,lessThanZero/n,zero/n);

        
    }
    	
}