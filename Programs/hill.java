//Java Program
//Hill Cipher Encryption
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

class hill
{
	int[] strtoascii(String s)
	{
		char[] st = s.toCharArray();
		int[] array1 = new int[st.length];
		
		for(int i=0; i<st.length; i++)
		{
			array1[i] = st[i];
		}
		
		return array1;
	}
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		hill hi = new hill();
		int[] p = hi.strtoascii(s);
		System.out.println(Arrays.toString(p));
		
		int[][] key = new int[][]{{5,1},{2,3}};
		//int[][] plain = new int[2][3]; // To store multidimensional plain array 
		

		/*int ki=0;
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; i<3; j++)
			{
				if(ki == plain.length) break;
				plain[i][j] = p[ki];
				ki++;
			}
	
		}*/
		
		int[][] plain = new int[][]{{11,12,13},{14,15,16}};
		
		
		//Getting the answer array, by multiplying key with plain
		int[][] ans = new int[key.length][plain[0].length];
		int sum =0;
		
		for(int i=0 ; i<key.length;i++)
		{
			for(int j=0; j<plain[0].length; j++)
			{
				for(int k=0; j< key.length; i++)
				{
					sum = sum + key[i][k]*plain[k][j];
				}
				while(sum > 26) sum=sum%26;
				ans[i][j] =sum;
				sum =0;
			}
		}
		
		
		//Getting the Ans array back from 2-dimensional matrix
		int[] com = new int[2*ans.length];
		int k =0;
		for(int i=0; i<ans.length;i++)
		{
			for(int j=0; j< ans[0].length; j++)
			{
				com[k++]= ans[i][j];
			}
		}
		
		//Got the computed array back 
		//Now convert into char
		char[] fin = new char[com.length];
		
		for(int i=0; i<com.length; i++)
		{
			char c= (char)(com[i]+97);
			
			fin[i] = c;
		}
		
		String answer = new String(fin);
		System.out.println("Encrypted Message : " +answer);
	}
}