//Suffix Array
//Given a word
//Divide the String into substrings
//Sort the substring in the given array alphabetically


//Take a String
//Convert into char array -- then convert into Integer Array
//Take a temp array and copy int array to temp
//via Selection Sort, find the least value on every step in temp array
//Search the particular value in the int array, and once used it make it visited[i] =1
//Save the index of the visited array in another array
//At the end, this array of nodes, is used to create substrings


//Most Important
//Keep sorting the temp array, on every iteration find the min in the exisiting array and store it

import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

class SuffixArray
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String s =sc.nextLine();
		sc.close();
		
		char[] array = s.toCharArray();
		System.out.println(Arrays.toString(array));
		
		int[] asciiarray = new int[array.length];
		
		for(int i=0; i<array.length; i++)
		{
			asciiarray[i] = array[i];
		}
		
		System.out.println(Arrays.toString(asciiarray));
		
		
		//Iterate through the ascii array in a loop, find the smallest element and create the sub-string
		
		//Selection Sort appropriate for this
		int min = 0;
		int node =0;
		int node1 =0;
		int temp = 0;
		String st =null;
		int[] visited = new int[asciiarray.length];
		int[] nodes = new int[asciiarray.length];
		String[] ans = new String[asciiarray.length];
		int[] temparray = asciiarray.clone();
		
		for(int i=0; i< temparray.length-1; i++)
		{
			min = temparray[i];
			for(int j=i+1; j< temparray.length; j++)
			{
				if(min > temparray[j])
				{
					min = temparray[j];
					node1 =j;
					//System.out.println(" min : "+ min+" node1:" +node1);
				}
				//System.out.println("i :"+i+" j:"+j);
			}
			
			//Search the minimum value in ascii array, get its index, and mark that index as visited and add into nodes array
			
			for(int m=0; m <asciiarray.length; m++)
			{
				if(visited[m] == 0)
				{
					if(min == asciiarray[m])
					{
						nodes[i]=m;
						visited[m] =1;
						break;
					}
				}
			}
			
			temp = temparray[i];
			temparray[i]= temparray[node1];
			temparray[node1] = temp;
			
			//System.out.println("Nodes Array : "+Arrays.toString(nodes));
			//System.out.println("Visited Array: "+Arrays.toString(visited));
			//System.out.println("Temp Array :" +Arrays.toString(temparray));
		}
		
		//System.out.println(Arrays.toString(array));
		
		for(int i=0; i< array.length; i++)
		{
				node = nodes[i];
				st = new String(array, node, array.length - node); //Most Important
				ans[i] = st;
				//System.out.println(Arrays.toString(ans));
		}
		
		System.out.println("Final Suffix Array :"+Arrays.toString(ans));
	}
}