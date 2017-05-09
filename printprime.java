//Prime Number
import java.util.*;

class printprime
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		int flag = 0;
		
		if(no>=1 && no<=1000)
		{
			for(int i=2; i<no; i++)
			{
				for(int j=2; j<i; j++)
				{
					//System.out.println("i "+i+" j "+j+" i%j "+i%j);
					if(i%j==0)
					{
						flag = 1;
						break;
					}
				}
				if(flag == 0)
				{
					System.out.print(i+" ");
				}
				
				flag = 0;
			}
		}
	}
}