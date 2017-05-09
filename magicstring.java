import java.util.*;

class magicstring
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		magicstring mg = new magicstring();
		
		int T = sc.nextInt();
		
		if(T>=1 && T<=100)
		{
			for(int i=0; i<T; i++)
			{
				int S = sc.nextInt();
				
				if(S>=1 && S<=500)
				{
					//StringBuffer st = new StringBuffer();
					//for(int j=0; j<=S; j++)
					//{
						String s = sc.next();
						//s.trim();
						//st.append(s);
					//}
					//System.out.println(st);
					//char[] arr = new String(st).toCharArray();
					char[] arr = s.toCharArray();
					
				
					for(int k=0; k<arr.length; k++)
					{
						

						int val,prim = 0;
						
						val = arr[k];
						//System.out.print(val+" ");
					
						prim= mg.nearestprime(val);
						char newchar = (char)prim;
						//Character newchar = new Character(prim);
						System.out.print(newchar);
					}
				}
			}
		}
	}
	
	
	int nearestprime(int val)
	{
		//Prime less than val
		int a = 0;
		int b = 0;
		
		int difa = 0;
		int difb = 0;
		
		
		
		for(int i=val-1; i>64; i--)
		{
		int flag = 0;
		
			for(int j=2; j<i; j++)
			{
				if(i%j == 0)
				{
					//System.out.println(" A: i "+i+" j "+j);
					flag = 1;
					break;
				}
			}
			
			if(flag == 0)
			{
				//System.out.println("i "+i);
				a = i;
				difa = val-a;
				break;
			}
		}
		
		
		//Prime greater than val
		for(int  p=val+1; p<=122; p++)
		{
			int flag = 0;
			
			for(int q=2; q<p; q++)
			{
				if(p%q == 0)
				{
					//System.out.println(" B : i "+p+" j "+q);
					flag = 1;
					break;
				}
			}
			
			if(flag == 0)
			{
				b = p;
				difb = b-val;
				break;
			}
		}
		
		//System.out.println("a "+a+" b "+b);
		//Compare both, whichever less return
		
		
		//System.out.println("difa "+difa+" difb "+difb);
		
		
		/*if(val == 90 || val == 122)
		{
			return a;
		}
		else if(val == 65 || val == 97)
		{
			return b;
		}*/
		if((difa <= difb) && (difb > 0) && (difa > 0))
		{
			return a;
			
		}
		else
		{
			return b;
		}
	}
}