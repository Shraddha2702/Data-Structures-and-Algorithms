import java.util.*;

class photoprog
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		
		if(L <= 10000 && L >=1)
		{
			int N = sc.nextInt();
			
			if(N <= 1000 && N >=1)
			{
				for(int i=0; i<N; i++)
				{
					int W = sc.nextInt();
					int H = sc.nextInt();
					
					if(W <=10000 && H<=10000)
					{
						if(W<L || H<L)
						{
							System.out.println("UPLOAD ANOTHER");
						}
						else
						{
							if(W == H)
							{
								System.out.println("ACCEPTED");
							}
							else
							{
								System.out.println("CROP IT");
							}
						}
					}
				}
			}
		}
	}
}