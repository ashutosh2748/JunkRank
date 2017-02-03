import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class GraphBFS2 {

	
	 
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	
    	
    	/*********************************************************************************
    	 * 
    	 * 
    	 * 
    	 * 
    	 * 
    	 * 
    	 * 
    	 * 
    	 */
    	
    	class Graph{
    		
    		HashMap<Integer,Vertices> vertices=new HashMap<Integer, Vertices>(); 
    		HashSet<Edge> edges=new HashSet<Edge>();
    		class Vertices
    			{
    			String Label;
    			int id;
    			List<Edge> adjacent;
				private int length;
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
				public List<Edge> getIncident() {
					// TODO Auto-generated method stub
					return adjacent;
				}
				public void setLength(int count) {
					// TODO Auto-generated method stub
					this.length=count;
				}
				public int getLength() {
					// TODO Auto-generated method stub
					return this.length;
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
				public Vertices opposite(Vertices v) {
					// TODO Auto-generated method stub
					if(v==start)return end;
					else return start;
					
				}
    			
    		}
    		Graph(int [][]ed,int n){
    			//vertices=new HashMap<Integer, Vertices>();
    			//edges=new HashSet<Edge>();
    			for(int i=0;i<n;i++)
    				vertices.put(i, new Vertices(i));
    			for(int[] e:ed){
    				
    				Vertices v1=vertices.get(e[0]);
    				Vertices v2=vertices.get(e[1]);
    				
    				//Vertices v1=new Vertices(e[0]);
    				//Vertices v2=new Vertices(e[1]);
    				//if(!vertices.containsKey(e[0]))vertices.put(e[0],v1);
    				//if(!vertices.containsKey(e[1]))vertices.put(e[1],v2);
    				edges.add(new Edge(v1,v2));
    			}
    			for(Integer v: vertices.keySet()){
    				Vertices vertex=vertices.get(v);
    				for(Edge e :edges){
    					if(e.getStart()==vertex||e.getEnd()==vertex)vertex.adjacent.add(e);
    				}
    				
    			}
    		}
			public void BFS() {
				for(Edge e:edges){
					e.setLabel("U");
				}
				for(Integer v: vertices.keySet()){
    				Vertices vertex=vertices.get(v);
    				vertex.setLabel("U");
				
			}
				for(Integer v: vertices.keySet()){
					Vertices vertex=vertices.get(v);
					if(vertex.getLabel().equals("U"))BFS(vertex);
					
				}
			}
			public void BFS(Vertices vertex) {
				List<Vertices> L=new LinkedList();
				int count=0;
				vertex.setLength(count);
				L.add(vertex);
				vertex.setLabel("V");
				
				while(!L.isEmpty()){
					Vertices v=L.get(0);
					List<Edge> li= v.getIncident();
						for(Edge e:li){
							if(e.getLabel().equals("U")){
								Vertices w=e.opposite(v);
								if(w.getLabel().equals("U")){
									e.setLabel("D");
									w.setLabel("V");
									L.add(w);
									count++;
									w.setLength(count);
								}
								else e.setLabel("C");
							}
					}
				}
				
			}
			public void out() {
				// TODO Auto-generated method stub
				for(Integer v: vertices.keySet()){
					Vertices vertex=vertices.get(v);
					System.out.printf("%d ",vertex.getLength()*6);
					System.out.println();
				}
			}
    	}
    	
    	
    	/*********************************************************************************
    	 * 
    	 * 
    	 * 
    	 * 
    	 * 
    	 * 
    	 * 
    	 * 
    	 */
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
    		Graph G=new Graph(edges,verticeCount);
    		G.BFS();
    		G.out();
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

   
    


	/*private static void BFS(int[][] vertices, int[][] edges, int[] s) {
		// TODO Auto-generated method stub
		List<int []> L=new LinkedList();
		L.add(s);
		s[1]=1;
		while(!L.isEmpty()){
			int [] v=L.remove(0);
			
		}
	}*/
    
   





















/*


	public static int[] removeDuplicates(int[] arr){
        int end = arr.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {                  
                    int shiftLeft = j;
                    for (int k = j+1; k < end; k++, shiftLeft++) {
                        arr[shiftLeft] = arr[k];
                    }
                    arr[j] = arr[end-1];
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];
        for(int i = 0; i < end; i++){
            whitelist[i] = arr[i];
        }
        System.arraycopy(arr, 0, whitelist, 0, end);
        return whitelist;
    }
    */
    
    }
