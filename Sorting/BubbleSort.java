//Bubble Sort
import java.util.Arrays;

class BubbleSort
{
	int[] array;
	
	public static void main(String args[])
	{
		int[] arr = {2,4,6,1,3,9,5};
		System.out.println(Arrays.toString(arr));
		BubbleSort b = new BubbleSort();
		b.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public void sort(int[] array)
	{
		this.array = array;
		
		for(int i=0;i<array.length-1; i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i] > array[j])
				{
					int temp = array[i];
					array[i]= array[j];
					array[j]=temp;
				}
			}
		}
	}
}