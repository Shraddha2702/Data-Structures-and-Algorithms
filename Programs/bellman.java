//Bellman Ford Algorithm
//Java Program

class bellman
{
	int[][] data;
	boolean[] visited;
	int[] distance;
	int[] pi;
	
	bellman(int[][] data)
	{
		this.data = data;
		this.distance = new int[data.length];
		this.visited = new boolean[data.length];
		this.p = new int[data.length];
	}
	
	
	boolean bellmanford(int s)
	{
		initialize();
		distance[s] = 0;
		pi[s] =0;
		for(int i=0; i<data.length; i++)
		{
			for(int j=0; j<data.length; j++)
			{
				for(int k=0; k<data.length; k++)
				{
					if(data[i][j] !=0)
					relaxation(i,j);
				}
			}
		}
	}
	
	void initialize()
	{
		for(int i=0; i<data.length; i++)
		{
			pi[i] = -1;
			visited[i] = false;
		}
	}
	
	void relaxation(int u,int v)
	{
		if(!visited[v] || distance[v] > distance[u] + data[u][v])
		{
			distance[v] = distance[u] + data[u][v];
			pi[v] = u;
			visited[v] = true;
		}
	}
	
	public static void main(String[] args)
	{
		data = {{0,999,6,3,999},{3,0,999,999,999},{999,999,0,2,999},{999,1,1,0,999},{999,4,999,2,0}};
		
		bellman b = new bellman(data);
		
		System.out.println("Enter source :");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();
		
		b.bellmanford(s);
	}
}