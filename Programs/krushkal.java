//Krushkal's Algorithm
//Java Program
import java.util.Scanner;

class krushkal
{
	public static void main(String args[])
	{
		int[][] matrix = new int[5][5];
		int[] visited = new int[5];
		int min =999;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				matrix[i][j] = sc.nextInt();
				
				if(matrix[i][j] == 0)
				{
					matrix[i][j] = 999;
				}
			}
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("\t"+matrix[i][j]);
			}
			System.out.print("\n");
		}
		
		visited[0] = 1;
		int u=0;
		int v=0;
		int total = 0;
		
		for(int i=0;i<4;i++)
		{min = 999;
		
				for(int j=0; j<5; j++)
				{
					if(visited[j] != 1){
					if(min > matrix[i][j])
					{
						min = matrix[i][j];
						v=j;
						u=i;
					}
					}
				}
				
				visited[v] = 1;
				total = total + min;
				System.out.println("Minimum edge from "+u+"-->"+v+" is :"+min);
			
		}
		
		System.out.println("Total :"+total);
	}
}