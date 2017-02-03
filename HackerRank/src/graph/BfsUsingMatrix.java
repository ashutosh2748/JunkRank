package graph;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BfsUsingMatrix {

	
	 
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    //	long startTime = System.nanoTime();
    	
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
    		
    		HashMap<Integer,Vertices> vertices; 
    	//	HashSet<Edge> edges;
    		Edge[][] matrix;
    		int size;
    		class Vertices
    			{
    			String Label;
    			int id;
    			//List<Edge> adjacent;
				private int length=-1;
    			Vertices(int id){
    				this.id=id;
    			//	adjacent=new ArrayList<Edge>();
    				Label="U";
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
				//public List<Edge> getIncident() {
					// TODO Auto-generated method stub
				//	return adjacent;
				//}
				public void setLength(int count) {
					// TODO Auto-generated method stub
					this.length=count;
				}
				public int getLength() {
					// TODO Auto-generated method stub
					return this.length;
				}
				/*public void setIncident(List<Edge> list) {
					
					this.adjacent=list;
				}*/
    				
    			}
    		
    		 class Edge{
    		//	int id;
    			Vertices start,end;
    			String Label;
    			
    			public Edge(Vertices v1, Vertices v2) {
    				// TODO Auto-generated constructor stub
    				start=v1;
    				end=v2;
    				Label="U";
    				//this.id=id;
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
    			vertices=new HashMap<Integer, Vertices>();
    			//edges=new HashMap<Edge>();
    			matrix=new Edge[n][n];
    			this.size=n;
    			for(int i=0;i<n;i++)
    				{
    				vertices.put(i, new Vertices(i));
    				
    				}
    		//	int i=0;
    			for(int[] e:ed){
    				
    				Vertices v1=vertices.get(e[0]-1);
    				Vertices v2=vertices.get(e[1]-1);
    				Edge edge=new Edge(v1,v2);
    				matrix[e[0]-1][e[1]-1]=edge;
    				matrix[e[1]-1][e[0]-1]=edge;
    				//Vertices v1=new Vertices(e[0]-1);
    				//Vertices v2=new Vertices(e[1]-1);
    				//if(!vertices.containsKey(e[0]))vertices.put(e[0],v1);
    				//if(!vertices.containsKey(e[1]))vertices.put(e[1],v2);
    				//edges.add(new Edge(v1,v2));
    			}
    			
    			/*for(int[] e:ed){
    				
    				Vertices v1=vertices.get(e[0]-1);
    				Vertices v2=vertices.get(e[1]-1);
    				
    				//Vertices v1=new Vertices(e[0]-1);
    				//Vertices v2=new Vertices(e[1]-1);
    				//if(!vertices.containsKey(e[0]))vertices.put(e[0],v1);
    				//if(!vertices.containsKey(e[1]))vertices.put(e[1],v2);
    				edges.add(new Edge(v1,v2));
    			}
    			for(Integer v: vertices.keySet()){
    				Vertices vertex=vertices.get(v);
    				//vertex.setIncident(new LinkedList<Edge>());
    				for(Edge e :edges){
    					if(e.getStart()==vertex||e.getEnd()==vertex){
    		//				vertex.getIncident().add(e);
    					}
    				}
    				
    			}*/
    		}
			public void BFS(int s) {
				/*for(Edge e:edges){
					e.setLabel("U");
				}
				for(Integer v: vertices.keySet()){
    				Vertices vertex=vertices.get(v);
    				vertex.setLabel("U");
				
			}*/
				/*for(Integer v: vertices.keySet()){
					Vertices vertex=vertices.get(v);
					if(vertex.getLabel().equals("U"))BFS(vertex);
					
				}*/
				Vertices vertex=vertices.get(s-1);
				BFS(vertex);
			}
			public void BFS(Vertices vertex) {
				List<Vertices> L=new LinkedList<Vertices>();
				int count=0;
				vertex.setLength(count);
				L.add(vertex);
				vertex.setLabel("V");
				int temp=vertex.getLength();
				while(!L.isEmpty()){
					Vertices v=L.get(0);
					
					if(temp!=v.getLength())count++;
					temp=v.getLength();
					L.remove(0);
					//if((v.getLength()-1==count))count++;
					List<Edge> li= getIncident(v);
					
					//	for(Edge e:li){
					for(int k = 0;k<li.size();k++){
							//count++;
							Edge e=li.get(k);
							if(e.getLabel().equals("U")){
								Vertices w=e.opposite(v);
								
								if(w.getLabel().equals("U")){
									e.setLabel("D");
									w.setLabel("V");
									L.add(w);
									w.setLength(count+1);
									//count--;
								}
								else {
									e.setLabel("C");
									//count--;
								}
							//count--;
							}//count--;
							
							//if(k==li.size()-1)count++;
						}
						//if((v.getLength()-1==count))
						//count++;
				 } //end while
				
			}
			private List<Edge> getIncident(Vertices v) {
				// TODO Auto-generated method stub
				//return null;
				int vid=v.getId();
				List<Edge>L=new ArrayList();
			 for(int i=0;i<size;i++){
				 if(matrix[vid][i]!=null)L.add(matrix[vid][i]);
			 }
			 return L;
			}
			public void out(int s,int m, StringBuilder output) {
				Vertices main=vertices.get(s-1);
				
				for(int i=0;i<m;i++){
					Vertices vertex=vertices.get(i);
				if(vertex!=main){if(vertex.length!=-1)
					//System.out.printf("%d ",vertex.getLength()*6);{
				{	output.append(vertex.getLength()*6);
					output.append(" ");
				}
				else output.append("-1 ");
				}
				
					//System.out.printf("-1 ");
				}
				/*for(Integer v: vertices.keySet()){
					Vertices vertex=vertices.get(v);
					if(vertex!=main)
					System.out.printf("%d ",vertex.getLength()*6);
					
				}*/
			}
    	}
    	
    	
    	
    	//long endTime = System.nanoTime();
    //	System.out.println("Create classes time");
    //	System.out.println(startTime-endTime);
    	
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
    		int s=in.nextInt();
    		
    		Graph G=new Graph(edges,verticeCount);
    		G.BFS(s);
    		
    		G.out(s,verticeCount,output[ii]);
    		
    	}
    	in.close();
    	for (int ii=0;ii<q;ii++){
    		System.out.println(output[ii].toString());
    	}
    	
  //  	long TendTime = System.nanoTime();
  //  	System.out.println("Exectuion time total is : ");
  //  	System.out.println(TendTime-startTime);
    	  	
    	
    	}

   
    


	 
    }
