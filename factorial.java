//Factorial of the number
import java.util.*;

class factorial
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int ans = 1;
		if(n>=1 && n<=10)
		{
			for(int i=n; i>=1; i--)
			{
				ans = ans * i;
				//System.out.println(ans);
			}
			
			System.out.println(ans);
		}
	}
}