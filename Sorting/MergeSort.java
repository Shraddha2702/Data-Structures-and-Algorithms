//Merge Sort

class MergeSort
{
	public static void main(String args[])
	{
		int[] arr = {2,4,1,6,7,5};
		int[] fin = new int[6];
		
		fin = sort(arr);
		
		for(int k=0; k <arr.length; k++)
		{
			System.out.print(" "+arr[k]);
		}
	}
	
	static int[] sort(int[] array)
	{
		int m = array.length;
		int[] larr = new int[m/2];
		int[] rarr = new int[m/2];
		if(m == 1){ return array;}
		
		else
		{
			int n= array.length /2;
			for(int i = 0; i < n; i++)
			{
				larr[i]= array[i];
			}
			
			for(int j =n+1; j< m; j++)
			{
				rarr[j-(n+1)] = array[j];
			}
			
			larr = sort(larr);
			rarr = sort(rarr);
			
			return merge(larr,rarr);
		}
	}
	
	static int[] merge(int[] a, int[] b)
	{
		int[] c = new int[(a.length + b.length)];
		
		int i=0, j=0, k=0;
		
		if(a[i] < b[j])
		{
			c[k] = a[i];
			i++;
		}
		else{
			c[k] = b[j];
			j++;
		}
		
		return c;
	}
}