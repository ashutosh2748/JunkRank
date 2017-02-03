import java.util.Scanner;

public class AppendandDelete {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int sl=s.length();
        int tl=t.length();
        int i=0;
        int count=(tl<sl)?tl:sl;
        for(i=0;i<count;i++){
            if(s.charAt(i)!=t.charAt(i)){
                break;
            
        }
        }
        i=i++;
            int deletions=sl-i;
            int insertions=tl-i;
            int x=k-deletions-insertions;
            if(x<0)System.out.println("No");
            else{
                if(x==0)System.out.println("Yes");
                else if((x-i)%2==0)System.out.println("Yes");
                else if(x>i&&deletions>=i)System.out.println("Yes");
                
             
                
                else System.out.println("No");
            }
            
    
    }

}
