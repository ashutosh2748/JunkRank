package graph;


import java.io.*;
import java.util.*;
import java.util.function.Predicate;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class DiakstraUsingMatrix {

	
	 
	
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
    		
    		HashMap<Integer,Vertex> vertices; 
    	//	HashSet<Edge> edges;
    		ArrayList<Edge>[][] matrix;
    		int size;
    		class Vertex implements Comparable<Vertex>
    			{
    			String Label;
    			int id;
    		//	List<Edge> adjacent;
				private int length=-1;
				private Vertex parent;
				private int weight;
    			Vertex(int id){
    				this.id=id;
    			//	adjacent=new ArrayList<Edge>();
    				Label="U";
    			}
    			public int getWeight(){
    				return weight;
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
			//	public List<Edge> getIncident() {
					// TODO Auto-generated method stub
		//			return adjacent;
		//		}
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
				public void setWeight(int i) {
					// TODO Auto-generated method stub
					this.weight=i;
				}
				
				public int compare(Vertex o1, Vertex o2) {
					// TODO Auto-generated method stub
					if(o1.getWeight()>o2.getWeight())return 1;
					else if(o1.getWeight()==o2.getWeight())return 0;
					return -1;
				}
				
				@Override
				public int compareTo(Vertex o) {
					// TODO Auto-generated method stub
					if(weight>o.getWeight())return 1;
					else if(weight==o.getWeight())return 0;
					else return -1;
				}
    				
    			}
    		
    		 class Edge{
    			//int id;
    			Vertex start,end;
    			String label;
    			int weight; 
    			
    			public Edge(Vertex v1, Vertex v2, int wt) {
    				// TODO Auto-generated constructor stub
    				weight=wt;
    				start=v1;
    				end=v2;
    				label="U";
    			}
    			public int getWeight(){
    				return weight;
    			}
    			public Vertex getStart() {
    				return start;
    			}
    			public void setStart(Vertex start) {
    				this.start = start;
    			}
    			public Vertex getEnd() {
    				return end;
    			}
    			public void setEnd(Vertex end) {
    				this.end = end;
    			}
    			public String getLabel() {
    				return label;
    			}
    			public void setLabel(String label) {
    				this.label = label;
    			}
				public Vertex opposite(Vertex v) {
					// TODO Auto-generated method stub
					if(v==start)return end;
					else return start;
					
					
				}
    			
    		}
    		Graph(int [][]ed,int n){
    			vertices=new HashMap<Integer, Vertex>();
    		//	edges=new HashSet<Edge>();
    			matrix=new ArrayList[n][n];
    			size=n;
    			for(int i=0;i<n;i++)
    				vertices.put(i, new Vertex(i));
    			for(int[] e:ed){
    				
    				Vertex v1=vertices.get(e[0]-1);
    				Vertex v2=vertices.get(e[1]-1);
    				int wt=e[2];
    				ArrayList<Edge> multipath;
    				if(matrix[e[0]-1][e[1]-1]==null){
    				
    				multipath=new ArrayList();
    				
    				}
    				else multipath=matrix[e[0]-1][e[1]-1];
    				Edge edge=new Edge(v1,v2,wt);
    				multipath.add(edge);
    				
    				matrix[e[0]-1][e[1]-1]=multipath;
    				matrix[e[1]-1][e[0]-1]=multipath;
    				
    				//Vertices v1=new Vertices(e[0]-1);
    				//Vertices v2=new Vertices(e[1]-1);
    				//if(!vertices.containsKey(e[0]))vertices.put(e[0],v1);
    				//if(!vertices.containsKey(e[1]))vertices.put(e[1],v2);
    				//edges.add(new Edge(v1,v2,wt));
    			}
    			/*for(Integer v: vertices.keySet()){
    				Vertex vertex=vertices.get(v);
    				//vertex.setIncident(new LinkedList<Edge>());
    				for(Edge e :edges){
    					if(e.getStart()==vertex||e.getEnd()==vertex){
    						vertex.getIncident().add(e);
    					}
    				}
    				
    			}*/
    		}
    		
    		
    		
    		
    		private List<Edge> getIncident(Vertex v) {
				// TODO Auto-generated method stub
				//return null;
				int vid=v.getId();
				List<Edge>L=new ArrayList();
			 for(int i=0;i<size;i++){
				 if(matrix[vid][i]!=null)L.addAll(matrix[vid][i]);
			 }
			 return L;
			}
			/*public void BFS(int s) {
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
				Vertex vertex=vertices.get(s-1);
				BFS(vertex);
			}*/
		/*	public void BFS(Vertex vertex) {
				List<Vertex> L=new LinkedList<Vertex>();
				int count=0;
				vertex.setLength(count);
				L.add(vertex);
				vertex.setLabel("V");
				int temp=vertex.getLength();
				while(!L.isEmpty()){
					Vertex v=L.get(0);
					
					if(temp!=v.getLength())count++;
					temp=v.getLength();
					L.remove(0);
					//if((v.getLength()-1==count))count++;
					List<Edge> li= v.getIncident();
					
					//	for(Edge e:li){
					for(int k = 0;k<li.size();k++){
							//count++;
							Edge e=li.get(k);
							if(e.getLabel().equals("U")){
								Vertex w=e.opposite(v);
								
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
			public void out(int s,int m, StringBuilder output) {
				Vertex main=vertices.get(s-1);
				
				for(int i=0;i<m;i++){
					Vertex vertex=vertices.get(i);
				if(vertex!=main){if(vertex.length!=-1)
					//System.out.printf("%d ",vertex.getLength()*6);{
				{	output.append(vertex.getLength()*6);
					output.append(" ");
				}
				else output.append("-1 ");
				}
				
					//System.out.printf("-1 ");
				}
				for(Integer v: vertices.keySet()){
					Vertices vertex=vertices.get(v);
					if(vertex!=main)
					System.out.printf("%d ",vertex.getLength()*6);
					
				}
			}*/
			
			public void Diakstra(int s) {
				// TODO Auto-generated method stub
				
				Queue<Vertex> main=new PriorityQueue<Vertex>();
				
				Vertex vs=vertices.get(s);
				for(Integer v: vertices.keySet()){
    				Vertex vertex=vertices.get(v);
    				vertex.setWeight(100001);
    				
				if(vertex.equals(vs))vertex.setWeight(0);
				
				main.add(vertex);
				}
				while (!main.isEmpty()){
					Vertex u=main.poll();
					List<Edge> li=getIncident(u);
					for(Edge e: li){
						Vertex z=e.opposite(u);
						int r=u.getWeight()+e.getWeight();
						if(r<z.getWeight()){z.setWeight(r);
						replaceKey(z,main);}
						
						
						
						
					}
				}
			}
			private void replaceKey(Vertex z, Queue<Vertex> main) {
				
				Predicate<? super Vertex> filter = (v)->v.equals(z);
				main.removeIf(filter);
				main.add(z);
				
			}
    	}
    	
    	
    	
    //	long endTime = System.nanoTime();
    	//System.out.println("Create classes time");
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
    		
    		int[][] edges=new int[edgeCount][3];
    		
    		for (int j=0;j<edgeCount;j++){
    			
    			edges[j][0]=in.nextInt();
    			edges[j][1]=in.nextInt();
    			edges[j][2]=in.nextInt();
    			
    			
    		}
    		int s=in.nextInt();
    		
    		Graph G=new Graph(edges,verticeCount);
    		G.Diakstra(s-1);
    		
    		for(Integer v: G.vertices.keySet()){
    			Graph.Vertex vertex=G.vertices.get(v);
    			if(vertex==G.vertices.get(s-1));
    			else {
    				if(vertex.getWeight()!=100001)System.out.print(vertex.getWeight()+" ");
    				else System.out.print(-1+" ");
    			}
    					
    		}
    		System.out.println();
    		//G.out(s,verticeCount,output[ii]);
    		
    	}
    	in.close();
    	/*for (int ii=0;ii<q;ii++){
    		System.out.println(output[ii].toString());
    	}
    	
    	long TendTime = System.nanoTime();
    	System.out.println("Exectuion time total is : ");
    	System.out.println(TendTime-startTime);
    	  	
    	*/
    	}

   
    


	 
    }
