//Java Program
//Prim's Algorithm

class prim
{
	
	void shortestpath(int[][] graph)
	{
		for(int k=0; k<graph.length;k++)
		{
		for(int i=0; i<graph.length; i++)
		{
			for(int j=0; j<graph.length; j++)
			{
				if(graph[i][k]+graph[k][j] < graph[i][j])
				{
					graph[i][j]= graph[i][k]+graph[k][j];
				}
			}
		}
		}
	}
	
	void printgr(int[][] graph)
	{
		for(int i=0;i<graph.length;i++)
		{
			for(int j=0;j<graph.length;j++)
			{
				System.out.print("\t"+graph[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String args[])
	{
		int[][] graph = {{0,2,0,6,0},
						 {2,0,3,8,5},
						 {0,3,0,0,7},
						 {6,8,0,0,9},
						 {0,5,7,9,0}};
		prim p=new prim();
		
		p.shortestpath(graph);
		p.printgr(graph);
	}
}