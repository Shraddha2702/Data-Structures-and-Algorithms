//Rail-Fence Cipher
//Take a string
//No keys needed
//Divide the key from even places and arrange in two different arrays

import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

class RailFence
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		char[] string = s.toCharArray();
		int l = (string.length)/2;
		
		//System.out.print(Arrays.toString(string));
		
		char[] partone = new char[10];
		char[] parttwo = new char[10];
		int k=0;
		
		for(int i=0; i< string.length; i++)
		{
			if(i%2 == 0)
			{
				partone[i] = string[i];
			}
			if(i%2 != 0)
			{
				parttwo[k] = string[i];
				k++;
			}
		}
		
		
		for(int i=0; i<partone.length; i++)
		{
			System.out.print(partone[i]+" ");
		}
	
		
		for(int i=0; i<parttwo.length; i++)
		{
			System.out.print(parttwo[i]+" ");
		}
	}
}