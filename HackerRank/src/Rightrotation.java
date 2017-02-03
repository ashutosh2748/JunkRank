import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Rightrotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            int rotasn=k;
            if (rotasn>n) rotasn=k%n;
            
            long test;
            if(m<rotasn)test=m-rotasn+n;
            else test=m-rotasn;
            
            System.out.println(a[(int)test]);
        }
    }
}
