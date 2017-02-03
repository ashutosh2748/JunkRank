import java.util.Scanner;

public class LisaMath {
	
	public static void main(String [] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int k=in.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=in.nextInt();
	}
	int count=0;
	int pageNumber=1;
	int pageCap=k;
	for(int i=0;i<n;i++){
		if(pageCap<k)pageNumber++;
		pageCap=k;
			for(int j=0;j<arr[i];j++){
			
			if(pageNumber==j+1)count++;
			pageCap--;
			if(pageCap==0){
				pageNumber++;
				pageCap=k;
			}
		}
			
	}
	System.out.println(count);
	}

}
