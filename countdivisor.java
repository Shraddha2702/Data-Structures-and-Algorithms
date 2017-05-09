//Count Divisors
import java.util.*;

class countdivisor
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		int count = 0;
		
		if(l<=1000 && r<=1000 && k<=1000)
		{
			for(int i=l; i<=r; i++)
			{
				if(i%k == 0)
				{
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
}