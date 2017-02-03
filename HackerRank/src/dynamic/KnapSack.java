package dynamic;

import java.util.Scanner;

public class KnapSack {
	static int[][] matrix;
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int q=in.nextInt();
        for(int l=0;l<q;l++){
            int n=in.nextInt();
            int k=in.nextInt();
            int[] a=new int[n];
            for(int j=0;j<n;j++){
                a[j]=in.nextInt();
            }
            matrix=new int[n+1][n+1];
            for(int i=0;i<n+1;i++){
            	matrix[0][i]=-1;
            	matrix[i][0]=-1;
            }
           System.out.println(knapSack(a,k));
            
        }
    }
	private static int knapSack(int[] a, int k) {
		
		
		
		
		
		return k;
		// TODO Auto-generated method stub
		
	}

}
