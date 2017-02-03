import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GraphBFS1 {

	
	 class Graph{
		
		HashMap<Integer,Vertices> vertices; 
		HashSet<Edge> edges;
		class Vertices
			{
			String Label;
			int id;
			List<Edge> adjacent;
			Vertices(int id){
				this.id=id;
			}
			public String getLabel() {
				return Label;
			}
			public void setLabel(String label) {
				Label = label;
			}
			public int getId() {
				return id;
			}
				
			}
		
		 class Edge{
			//int id;
			Vertices start,end;
			String Label;
			
			public Edge(Vertices v1, Vertices v2) {
				// TODO Auto-generated constructor stub
				start=v1;
				end=v2;
			}
			public Vertices getStart() {
				return start;
			}
			public void setStart(Vertices start) {
				this.start = start;
			}
			public Vertices getEnd() {
				return end;
			}
			public void setEnd(Vertices end) {
				this.end = end;
			}
			public String getLabel() {
				return Label;
			}
			public void setLabel(String label) {
				Label = label;
			}
			
		}
		Graph(int [][]ed){
			
			for(int[] e:ed){
				Vertices v1=new Vertices(e[0]);
				Vertices v2=new Vertices(e[1]);
				if(!vertices.containsKey(e[0]))vertices.put(e[0],v1);
				if(!vertices.containsKey(e[1]))vertices.put(e[1],v2);
				edges.add(new Edge(v1,v2));
			}
			for(Integer v: vertices.keySet()){
				Vertices vertex=vertices.get(v);
				for(Edge e :edges){
					if(e.getStart()==vertex||e.getEnd()==vertex)vertex.adjacent.add(e);
				}
				
			}
		}
		
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner in =new Scanner(System.in);
    	int q=in.nextInt();
    	for(int ii=0;ii<q;ii++)
    	{
    		
    		int verticeCount=in.nextInt();
    		int edgeCount=in.nextInt();
    		
    		int[][] edges=new int[edgeCount][2];
    		int[] test=new int[verticeCount];
    		for (int j=0;j<edgeCount;j++){
    			
    			edges[j][0]=in.nextInt();
    			edges[j][1]=in.nextInt();
    			
    			
    		}
    		//GraphBFS1 G=new GraphBFS1();
    		Graph G=new Graph(edges);
    		
    		/*int[] nodes=new int[edgeCount*2];
    		
    		for(int k=0;k<edgeCount;k++)
    			nodes[k]=edges[k][0];
    		for(int k=0;k<edgeCount;k++)
    			nodes[k]=edges[k][1];
    		/*test=removeDuplicates(nodes);
    		
    		
    		/*for(int i=0;i<test.length;i++){
    			vertices[i][0]=test[i];
    			vertices[i][1]=0;
    		}
    		for(int i=0;i<test.length;i++)
    			if(vertices[i][1]==0)BFS(vertices,edges,vertices[i]);
    		*/
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
