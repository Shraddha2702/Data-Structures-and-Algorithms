//Selection Sort
//Set 1st element as i
//2nd to n .. j 
//Initially j=min , increment j
//if then j<min, then that j become min
//At the end compare i and min
// if i>min, then swap

class SelectionSort
{
	int arr = new int[5];
	int final = new int[5];
	
	public static void main(String args[])
	{
		Scanner se = new Scanner(System.in);
		for(int k = 0; k <= arr.length; k++)
		{
			arr[k]= se.nextInt();
		}
		
		final = sort(arr);
		
		for(k=0; k<final.length;k++)
		{
			System.out.println(final[k]);
		}
	}
	
	static int[] sort(int[] array)
	{
		for(int i=0;i< array.length - 1; i++)
		{
			int min = array[i+1];
			for(int j=i+1; j< array.length; j++)
			{
				if(array[j] < min)
				{
					min = array[j];
				}
			}
			
			if(min < array[i])
			{
				int temp = array[i];
				array[i] = min;
				min= temp;
			}
		}
		
		return array;
	}
}