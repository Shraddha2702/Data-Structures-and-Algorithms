//Insertion Sort

import java.util.Arrays;

class InsertionSort
{
	int[] array;
	
	InsertionSort(int[] array)
	{
		this.array = array;
	}
	
	public static void main(String args[])
	{
		int[] arr = {1,4,3,2,5,9,7};
		System.out.println(Arrays.toString(arr));
		InsertionSort sr = new InsertionSort(arr);
		sr.sort();
		System.out.println(Arrays.toString(arr));
	}
	
	public void sort()
	{
		int m = array.length;
		
		for(int j=1; j< m; j++)
		{
			int key = array[j];
			
			int i = j-1;
			
			while((i>-1) && key < array[i])
			{
				array[i+1] = array[i];
				i--;
			}
			array[i+1]= key;
		}
	}
}