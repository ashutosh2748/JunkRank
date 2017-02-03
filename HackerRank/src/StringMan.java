import java.io.*;
import java.util.*;

public class StringMan {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int m=A.length();
        int n=B.length();
        System.out.println(m+n);
       int temp =(m<=n)?m:n;
       boolean flag=false;
               for(int i=0;i<temp;i++){
                
                  
                   if(A.charAt(i)>B.charAt(i)){
                    System.out.println("Yes");
                    break;
                    }
                   
                   else if(B.charAt(i)>A.charAt(i)) {
                       System.out.println("No");
                       break;
                         }
                 //  if(i>=m){System.out.println("No");break;}
                 //  if(i>=n){System.out.println("Yes");break;}
                 if(i==temp-1)flag=true;  
               }
               if(flag){
            	   if(m>n){
            		   System.out.println("Yes");
            	   }
            	   else System.out.println("No");
               }
               char c=(char) (A.charAt(0)-'a'+'A');
               A=A.substring(1);
               A=c+A;
               
                c=(char) (B.charAt(0)-'a'+'A');
               B=B.substring(1);
               B=c+B;
               System.out.println(A+" "+B);
    }
}
