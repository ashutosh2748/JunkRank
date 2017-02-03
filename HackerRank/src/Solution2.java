
import java.util.*;

public class Solution2 {

	
	 
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    	long startTime = System.nanoTime();
    	
    	

    	
    	class Graph{
    		//int vertices;
    		HashMap<Integer,Vertices> vertices; 
    		HashSet<Edge> edges;
    		class Vertices
    			{
    			int Label;
    			//int id;
    			List<Edge> adjacent=new ArrayList<Edge>();;
				private int length=-1;
    			
    			public int getLabel() {
    				return Label;
    			}
    			public void setLabel(int label) {
    				Label = label;
    			}
    			
				public List<Edge> getIncident() {
					return adjacent;
				}
				public void setLength(int count) {
					this.length=count;
				}
				public int getLength() {
					return this.length;
				}
					
    			}
    		
    		 class Edge{
    			//int id;
    			int start,end;
    			int Label;
    			
    			public Edge(int v1, int v2) {
    				// TODO Auto-generated constructor stub
    				start=v1;
    				end=v2;
    				
    			}
    			public int getStart() {
    				return start;
    			}
    			
    			public int getEnd() {
    				return end;
    			}
    			
    			public int getLabel() {
    				return Label;
    			}
    			public void setLabel(int label) {
    				Label = label;
    			}
				public int opposite(int v) {
					// TODO Auto-generated method stub
					if(v==start)return end;
					else return start;
					
					
				}
    			
    		}
    		Graph(int [][]ed,int n){
    			vertices=new HashMap<Integer, Vertices>();
    			edges=new HashSet<Edge>();
    			for(int i=0;i<n;i++)
    				vertices.put(i, new Vertices());
    			for(int[] e:ed){
    				
    				//Vertices v1=vertices.get(e[0]-1);
    				//Vertices v2=vertices.get(e[1]-1);
    				
    				//Vertices v1=new Vertices(e[0]-1);
    				//Vertices v2=new Vertices(e[1]-1);
    				//if(!vertices.containsKey(e[0]))vertices.put(e[0],v1);
    				//if(!vertices.containsKey(e[1]))vertices.put(e[1],v2);
    				edges.add(new Edge(e[0]-1,e[1]-1));
    			}
    			/*for(Integer v: vertices.keySet()){
    				Vertices vertex=vertices.get(v);
    				//vertex.setIncident(new LinkedList<Edge>());
    				/*for(Edge e :edges){
    					if(e.getStart()==v||e.getEnd()==v){
    						vertex.getIncident().add(e);
    					}
    				}*/
    				
    			//}
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
				
				BFS(s-1,vertices);
			}
			public void BFS(int s, HashMap<Integer,Vertices> vertices2) {
				Vertices vertex=vertices.get(s);
				List<Integer> L=new ArrayList<Integer>();
				int count=0;
				vertex.setLength(count);
				L.add(s);
				vertex.setLabel(1);
				int counter=0;
				int temp=vertex.getLength();
				while(!L.isEmpty()){
					int test=L.get(0);
					Vertices v=vertices.get(test);
					counter++;
					if(temp!=v.getLength())count++;
					temp=v.getLength();
					L.remove(0);
					//if((v.getLength()-1==count))count++;
					//List<Edge> li= v.getIncident();
					
					//	for(Edge e:li){
					//for(int k = 0;k<li.size();k++){
							//count++;
					int counterb=0;
						for(Edge e :edges){
	    					if(e.getStart()==test||e.getEnd()==test){
	    						counterb++;
	    					
							 //e=li.get(k);
							if(e.getLabel()==0){
								int oppo=e.opposite(test);
								Vertices w=vertices.get(e.opposite(test));
								
								if(w.getLabel()==0){
									e.setLabel(2);
									w.setLabel(1);
									L.add(oppo);
									w.setLength(count+1);
									//count--;
								}
								else {
									e.setLabel(3);
									//count--;
								}
							//count--;
							}//count--;
							
	    					}//if(k==li.size()-1)count++;
						}
						System.out.println("counterb: "+counterb);
						//if((v.getLength()-1==count))
						//count++;
				 } //end while
				System.out.println("Counter:");
				System.out.println(counter);
			}
			public void out(int s,int m) {
				Vertices main=vertices.get(s-1);
				
				for(int i=0;i<m;i++){
					Vertices vertex=vertices.get(i);
				if(vertex!=main){
					if(vertex.length!=-1)
					System.out.printf("%d ",vertex.getLength()*6);
				/*{	output.append(vertex.getLength()*6);
					output.append(" ");
				}*/
				else System.out.printf("-1 ");
					//output.append("-1 ");
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
    	long endTime = System.nanoTime();
    	System.out.println("Create classes time");
    	System.out.println(startTime-endTime);
    	
    	Scanner in =new Scanner(System.in);
    	int q=in.nextInt();
    	//StringBuilder[] output=new StringBuilder[q];
    	
    	for(int ii=0;ii<q;ii++)
    	{
    		
    		//output[ii]=new StringBuilder();
    		int verticeCount=in.nextInt();
    		int edgeCount=in.nextInt();
    		
    		int[][] edges=new int[edgeCount][2];
    		
    		for (int j=0;j<edgeCount;j++){
    			
    			edges[j][0]=in.nextInt();
    			edges[j][1]=in.nextInt();
    			
    			
    		}
    		int s=in.nextInt();
    		//in.close();
    		Graph G=new Graph(edges,verticeCount);
    		G.BFS(s);
    		
    		G.out(s,verticeCount);
    		System.out.println();
    		G=null;
    		
    	}
    	in.close();
    	/*for (int ii=0;ii<q;ii++){
    		System.out.println(output[ii].toString());
    	}*/
    	long TendTime = System.nanoTime();
    	System.out.println("Exectuion time total is : ");
    	System.out.println(TendTime-startTime);
    	
    	}

   
    


	 
    }
