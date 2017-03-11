//Columnar Cipher
//Take a String, take the no of columns from user
//Rearrange the matrix

import java.util.*;

class Columnar
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int N = sc.nextInt();
		sc.close();
		
		int l = ((s.length())/N)+1;
		
		char[] string = s.toCharArray();
		char[][] matrix = new char[l][N];
		int k=0;
		System.out.println("String lengh :"+string.length+" l:"+l);
		
		for(int i=0; i<l; i++)
		{
			for(int j=0; j<N; j++)
			{
				if(k < string.length)
				{matrix[i][j] = string[k];
				k++;}
				
				if(k > string.length)
				{
					matrix[i][j] = 'x';
				}
				System.out.print(k)
			}
		}
		
		for(int i=0; i<l; i++)
		{
			for(int j=0; j<N; j++)
			{
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println();
		}
	}
}