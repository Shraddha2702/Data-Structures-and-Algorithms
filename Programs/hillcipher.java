class hillcipher
{
	
	public static void main(String args[])
	{
		int[][] key = {{5,1},{2,3}};
		int[][] plain = {{11,12,13},{14,15,16}};
		
		int[][] ans = new int[3][3];
		
		//Printing Key
		for(int i=0; i< 2;i++)
		{
			for(int j=0; j< 2; j++)
			{
				System.out.print("\t"+key[i][j]);
			}
			System.out.print("\n");
		}
		
		//Printing Plain text
		for(int i=0; i< 2;i++)
		{
			for(int j=0; j< 3; j++)
			{
				System.out.print("\t"+plain[i][j]);
			}
			System.out.print("\n");
		}
		int sum =0;
		
		 for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                for (int k = 0; k < 2; k++)
                {
                    ans[i][j] = ans[i][j] + key[i][k] * plain[k][j];
                }
            }
        }
		
		
		//Print answer array
		for(int i=0; i< 2;i++)
		{
			for(int j=0; j< 3; j++)
			{
				System.out.print("\t"+ans[i][j]);
			}
			System.out.print("\n");
		}
		
	}
}