package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigIntegerTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer nn=new Integer(n);
        
        BigInteger b=new BigInteger(nn.toString(),10);
        BigInteger k=new BigInteger(nn.toString(),10);
        k=k.subtract(BigInteger.ONE);
      //  for(int i=n;i>0;i--)
        while(k.intValue()>0)	{
        	
        	b=b.multiply(k);
        k=k.subtract(BigInteger.ONE);
          
        }
        	
        System.out.println(b);
    }
}
