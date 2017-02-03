import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GraphBFS {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner in =new Scanner(System.in);
    	int q=in.nextInt();
    	for(int ii=0;ii<q;ii++)
    	{
    		
    		int verticeCount=in.nextInt();
    		int edgeCount=in.nextInt();
    		int[][] vertices=new int[verticeCount][2];
    		int[][] edges=new int[edgeCount][3];
    		int[] test=new int[verticeCount];
    		for (int j=0;j<edgeCount;j++){
    			
    			edges[j][0]=in.nextInt();
    			edges[j][1]=in.nextInt();
    			edges[j][3]=0;
    			
    		}
    		int[] nodes=new int[edgeCount*2];
    		
    		for(int k=0;k<edgeCount;k++)
    			nodes[k]=edges[k][0];
    		for(int k=0;k<edgeCount;k++)
    			nodes[k]=edges[k][1];
    		test=removeDuplicates(nodes);
    		for(int i=0;i<test.length;i++){
    			vertices[i][0]=test[i];
    			vertices[i][1]=0;
    		}
    		for(int i=0;i<test.length;i++)
    			if(vertices[i][1]==0)BFS(vertices,edges,vertices[i]);
    		
    	}
    	  	
    			
    	}

   
    private static void BFS(int[][] vertices, int[][] edges, int[] s) {
		// TODO Auto-generated method stub
		List<int []> L=new LinkedList();
		L.add(s);
		s[1]=1;
		while(!L.isEmpty()){
			int [] v=L.remove(0);
			
		}
	}
    
   
























	public static int[] removeDuplicates(int[] arr){
        int end = arr.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {                  
                    /*int shiftLeft = j;
                    for (int k = j+1; k < end; k++, shiftLeft++) {
                        arr[shiftLeft] = arr[k];
                    }*/
                    arr[j] = arr[end-1];
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];
        /*for(int i = 0; i < end; i++){
            whitelist[i] = arr[i];
        }*/
        System.arraycopy(arr, 0, whitelist, 0, end);
        return whitelist;
    }
    
    
    }
