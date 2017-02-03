import java.util.Scanner;

public class funnynotfunny {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int q=0;q<=t;q++){
        String S=in.next();
            boolean flag=false;
        for(int i=0,n=S.length()-1;i<S.length()-2;i++){
            if(Math.abs(S.charAt(i)-S.charAt(i+1))==Math.abs(S.charAt(n)-S.charAt(n-1)))flag=true;
            else{flag=false;break;}
            n--;
        }
            if(flag)System.out.println("Funny");
            else System.out.println("Not Funny");
        }
    }
}
