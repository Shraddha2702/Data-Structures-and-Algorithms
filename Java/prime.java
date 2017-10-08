class prime
{
	public static void main(String args[]) throws Exception
	{
		int i = new prime().nearestprime(15);
		System.out.println(i);
	}
	
	int nearestprime(int val)
	{
		//Prime less than val
		int a = 0;
		int b = 0;
		
		int difa = 0;
		int difb = 0;
		
		for(int i=val-1; i>0; i--)
		{
		int flag = 0;
		
			for(int j=2; j<i; j++)
			{
				if(i%j == 0)
				{
					//System.out.println("i "+i+" j "+j);
					flag = 1;
					break;
				}
			}
			
			if(flag == 0)
			{
				//System.out.println("i "+i);
				a = i;
				break;
			}
		}
		
		//Prime greater than val
		for(int  i=val+1; i<=150; i++)
		{
			int flag = 0;
			
			for(int j=2; j<i; j++)
			{
				if(i%j == 0)
				{
					flag = 1;
					break;
				}
			}
			
			if(flag == 0)
			{
				b = i;
				break;
			}
		}
		
		//System.out.println("a "+a+" b "+b);
		//Compare both, whichever less return
		difa = val-a;
		difb = val-b;
		
		if(difa > difb)
		{
			return b;
		}
		else
		{
			return a;
		}
	}
}