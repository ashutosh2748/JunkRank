import java.util.HashMap;
import java.util.Scanner;

public class Krishna {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		String s=in.next();
		HashMap<Character,Integer> test=new HashMap();
		int tempMax=0;
		for(int i=0;i<s.length()-1;i++){
			char temp=s.charAt(i);
		
			if(test.get(temp)==null){
				test.put(temp,1);
				tempMax++;
				}
			if(s.charAt(i)==s.charAt(i+1))tempMax++;
			else tempMax=0;
			if(test.get(temp)<tempMax)test.put(temp, tempMax);
			
		}

		
		System.out.println(test);
	}

}
