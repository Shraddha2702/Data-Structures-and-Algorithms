//Java Program
//Prims Algorithm

import java.util.Scanner;

class Prims
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[5][5];
		int[] visited = new int[5];
		int min=999;
		int total=0;
		int u=0;
		int v=0;
	
		
		for(int i=0;i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				matrix[i][j]= sc.nextInt();
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
		visited[0] =1;
		//for(int counter =0; counter<4; counter++){
			
		for(int i=0; i<5; i++)
		{min=999;
			if(visited[i]==1)
			{
				for(int j=0;j<5;j++)
				{
					if(visited[j]!=1)
					{
						if(min > matrix[i][j])
						{
							min = matrix[i][j];
							u=i;
							v=j;
						}
					}
				}
				visited[v] = 1;
				total = total+min;
				System.out.println("Edge Found : "+u+"-->"+v+" Weight:"+min);
				
			}
		}//}
		
		System.out.println("The minimum weight is : "+total);
		
		}
}