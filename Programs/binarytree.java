//Binary Tree using Stacks
//Java Program

class binarytree
{
	public static void main(String args[])
	{
		int[] arr = {10,15,20,30,2,11,14};
		
		int[] ans = new int[15];
		int k=0;
		int n=0;
		int i=0;
		int temp=0;
		ans[k] = 10;
		
		
		while(i<arr.length)
		{ k=i;
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i] < arr[j])
				{
					if(k > 7) k=1;
					k=k+2;
					ans[k]=arr[j];
				}
				else
				{
					i++;
					n = i;
					while(ans[i] > arr[j])
					{
						temp = ans[i];
						ans[i] = arr[j];
						i++;
					}
					ans[i] = arr[j];
				}
			}
		}
		
		for(int m=0; m<ans.length;m++)
		{
			System.out.print("\t"+ans[m]);
		}
	}
}