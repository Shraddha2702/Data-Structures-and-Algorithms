//Auto-Key Cipher
//Take in a String to encrypt
//Take in a key whose length is less than String
//Make a matrix of 26x26 of Alphabets
//hellogoodmo -- Key 
//goodmorning -- String
//Encrypt using the matrix

import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

class AutoKey
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String k = sc.next();
		sc.close();
		
		if(k.length() <= s.length()){
		int[][] matrix = new int[26][26];
		
		for(int i=0; i<26; i++)
		{
			for(int j=0; j<26; j++)
			{
				matrix[i][j] = (i+j)%26+97;
			}
		}
		
		for(int i=0; i<26; i++)
		{System.out.println(Arrays.toString(matrix[i]));}
		
		char[] string = s.toCharArray();
		char[] key = k.toCharArray();
		
		//System.out.println(Arrays.toString(string));
		//System.out.println(Arrays.toString(key));
		
		int[] stringarr = new int[string.length];
		int[] keyarr = new int[key.length];
		
		for(int i=0; i<stringarr.length; i++)
		{
			stringarr[i] = (int) (string[i]-97);
		}
		
		for(int i=0; i<keyarr.length; i++)
		{
			keyarr[i] =  (key[i]-97);
		}
		
		//System.out.println(Arrays.toString(stringarr));
		//System.out.println(Arrays.toString(keyarr));
		int a=0;
		int b = 0;
		int p = 0;
		char[] chararr = new char[stringarr.length];
		
		for(int i=0; i<stringarr.length; i++)
		{
			//for(int j=0; j<26; j++)
			//{
				a = stringarr[i];
				
				if(i < keyarr.length)
				{b = keyarr[i];}
				else
				{b = stringarr[p]; p++;}
				
				System.out.println("a :"+a+" b :"+b);
				//System.out.println(matrix[a][b]);
				chararr[i] = (char)matrix[a][b];
				
			}
		//}
		
		System.out.println(Arrays.toString(chararr));
		}
	}
}