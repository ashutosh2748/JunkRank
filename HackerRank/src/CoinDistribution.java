import java.util.Scanner;

public class CoinDistribution {

	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int m=in.nextInt();
		int[] M=new int[m];
		if(N==0)System.out.println("0");
		for(int i=0;i<m;i++)
			M[i]=in.nextInt();
		
		
		long[][] resultMemoised=new long[m][N];
		for(int i=0;i<m;i++)
			for(int j=0;j<N;j++)
				resultMemoised[i][j]=-1;

		System.out.println(ways(N,m,M,resultMemoised));
	}
	
	

	public static long ways(int N,int m,int[] M, long[][] resultMemoised){
		
		
		
		if(N==0)return 1;
	//	else if(N<M[0])return 0;
		if(N<0)return 0;
		
		if (m <=0 && N >= 1)
	        return 0;
		if(resultMemoised[m-1][N-1]<0){
		 {
				resultMemoised[m-1][N-1]=ways(N-M[m-1],m,M,resultMemoised)+ways(N,m-1,M, resultMemoised);
			}
			
		}
		return resultMemoised[m-1][N-1];
	}
}
