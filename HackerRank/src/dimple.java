import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class dimple
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        if(k>26)k=k%26;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int tempChar=(int)s.charAt(i);
            int tempA=(int)'A';
            int tempZ=tempA+26;
            int tempa=(int)'a';
            int tempz=tempa+26;
            if((tempChar>=tempA&&tempChar<tempZ)){
                tempChar=tempChar-tempA;
                tempChar=(tempChar+k)%26;
                result=result.append((char)(tempChar+tempA));
               // tempchar=(tempchar+k);
            }
            else if((tempChar>=tempa&&tempChar<tempz))
                {
                 tempChar=tempChar-tempa;
                tempChar=(tempChar+k)%26;
                result=result.append((char)(tempChar+tempa));
               // tempchar=(tempchar+k);
                            }
            else result.append(s.charAt(i));
           
        }
         System.out.println(result);
    }
}
