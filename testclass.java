import java.util.*;


class testclass
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		if(n <= 1000)
		{
			for(int i=0; i<n; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			int ans = 1;
			
			for(int i=0;i<arr.length; i++)
			{
				ans = ans * arr[i];
			}
			
			ans = ans % (10^9 + 7);
			System.out.println(ans);
		}
	}
}