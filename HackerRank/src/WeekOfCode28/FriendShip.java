package WeekOfCode28;
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

public class FriendShip {
	

	

		
		
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    	
	    	long startTime = System.nanoTime();
	    	
	    	
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
	    		 Integer totalValue=0;
	    		 HashMap<Integer,Long> sum;
	    		 Long maxsum=new Long(0);
	    		 Integer count=0;
	    		
	    		HashMap<Integer,Vertices> vertices; 
	    		HashSet<Edge> edges;
	    		class Vertices
	    			{
	    			String Label;
	    			int id;
	    			int color=0;
	    			int componentId;
	    			List<Edge> adjacent;
					private int length=-1;
	    			Vertices(int id){
	    				this.id=id;
	    				adjacent=new ArrayList<Edge>();
	    				Label="U";
	    			}
	    			public int getComponentId() {
	    				return componentId;
	    			}
	    			public void setComponentId(int componentId) {
	    				this.componentId = componentId;
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
					public void setIncident(List<Edge> list) {
						
						this.adjacent=list;
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
	    				Label="U";
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
	    			sum=new HashMap<Integer, Long>();
	    			vertices=new HashMap<Integer, Vertices>();
	    			edges=new HashSet<Edge>();
	    			for(int i=0;i<n;i++)
	    				vertices.put(i, new Vertices(i));
	    			for(int[] e:ed){
	    				
	    				Vertices v1=vertices.get(e[0]-1);
	    				Vertices v2=vertices.get(e[1]-1);
	    				
	    				//Vertices v1=new Vertices(e[0]-1);
	    				//Vertices v2=new Vertices(e[1]-1);
	    				//if(!vertices.containsKey(e[0]))vertices.put(e[0],v1);
	    				//if(!vertices.containsKey(e[1]))vertices.put(e[1],v2);
	    				edges.add(new Edge(v1,v2));
	    			}
	    		//	int color=1;
	    		//	for(Integer v: vertices.keySet()){
	    		//		Vertices vertex=vertices.get(v);
	    				
	    				//vertex.setIncident(new LinkedList<Edge>());
	    			//	int sum=0;
	    				for(Edge e :edges){
	    					e.getStart().getIncident().add(e);
	    					e.getEnd().getIncident().add(e);
	    						
	    						
	    					}
	    			//	}
	    				
	    			//}
	    		}
	    		
	    		
	    		public void counterValue(){
					for(Integer v: vertices.keySet()){
	    				Vertices vertex=vertices.get(v);
	    				if(vertex.getIncident().size()>0){
	    					count++;
	    					
	    				}
	    				
					}
					System.out.println(2*count*edges.size());
				}
				public void BFS() {
					/*for(Edge e:edges){
						e.setLabel("U");
					}
					for(Integer v: vertices.keySet()){
	    				Vertices vertex=vertices.get(v);
	    				vertex.setLabel("U");
					
				}*/
					int componentid=0;
					for(Integer v: vertices.keySet()){
						componentid++;
						Vertices vertex=vertices.get(v);
						
						if(vertex.getLabel().equals("U")){
							vertex.setComponentId(componentid);
							BFS(vertex);
						}
						long value=sum.get(vertex.getComponentId());
						if(value>maxsum)maxsum=value;
					}
				//	Vertices vertex=vertices.get(s-1);
				//	BFS(vertex);
				}
				
				public void BFS(Vertices vertex) {
					List<Vertices> L=new LinkedList<Vertices>();
				//	int count=0;
				//	vertex.setLength(count);
					int componentid=vertex.getComponentId();
					sum.put(componentid, new Long(0));
					long numberofConnected=1;
					int i=0;
					long value=0;
					L.add(vertex);
					vertex.setLabel("V");
					int temp=vertex.getLength();
					while(!L.isEmpty()){
						Vertices v=L.get(0);
					L.remove(0);
					List<Edge> li= v.getIncident();
					for(int k = 0;k<li.size();k++){
					Edge e=li.get(k);
								if(e.getLabel().equals("U")){
									Vertices w=e.opposite(v);
									
									
									if(w.getLabel().equals("U")){
										w.setComponentId(componentid);
										e.setLabel("D");
										w.setLabel("V");
										L.add(w);
										numberofConnected++;
										i++;
										
										
									}
									else {
										e.setLabel("C");
										
									}
									
									value=sum.get(w.getComponentId());
									value=value+i*numberofConnected;
									sum.put(w.getComponentId(), value);
								
								}
								
								
							}
							
					 } 
					
				}


				public void DFS() {
					int componentid=0;
					for(Integer v: vertices.keySet()){
						componentid++;
						Long numberofConnected=new Long(1);
						Vertices vertex=vertices.get(v);
						
						if(vertex.getLabel().equals("U")){
							vertex.setComponentId(componentid);
							DFS(vertex,numberofConnected,0);
						}
						long value=sum.get(vertex.getComponentId());
						if(value>maxsum)maxsum=value;
					}
					
				}
				
				long value=0;

				private void DFS(Vertices vertex,long numberofConnected,int i) {
					vertex.setLabel("V");
					int componentid=vertex.getComponentId();
					for(Edge e:vertex.getIncident()){
						//Edge e=e;
						if(e.getLabel().equals("U")){
							
							Vertices w=e.opposite(vertex);
							if(w.getLabel().equals("U")){
								w.setComponentId(componentid);
								numberofConnected++;
								i++;
								e.setLabel("D");
								DFS(w,numberofConnected,0);
							}
							else {
								e.setLabel("B");
								numberofConnected--;
							}
							
							
							value=sum.get(w.getComponentId());
							value=value+i*numberofConnected;
							sum.put(w.getComponentId(), value);
						}
						
						numberofConnected--;
						
					}
					
				}
				
				
	    	}
	    	
	    	
	    	
	    	Scanner in =new Scanner(System.in);
	    	int q=in.nextInt();
	    	StringBuilder[] output=new StringBuilder[q];
	    	for(int ii=0;ii<q;ii++)
	    	{
	    		
	    		output[ii]=new StringBuilder();
	    		int verticeCount=in.nextInt();
	    		int edgeCount=in.nextInt();
	    		
	    		int[][] edges=new int[edgeCount][2];
	    		
	    		for (int j=0;j<edgeCount;j++){
	    			
	    			edges[j][0]=in.nextInt();
	    			edges[j][1]=in.nextInt();
	    			
	    			
	    		}
	    		
	    		
	    		Graph G=new Graph(edges,verticeCount);
	    		G.BFS();
	    		System.out.println(G.maxsum);
	    	//	System.out.println(G.totalValue);
	    	//	G.counterValue();
	    		
	    		
	    	}
	    	in.close();
	    	
	    	
	    	
	    	  	
	    	
	    	}

	   
	    


		 
	    


}
