import java.io.*;
import java.util.*;
public final class string_queries
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	static int[][] pre;
	static int[] sum=new int[26];
	
    public static void main(String args[]) throws Exception
    {
		int n=sc.nextInt(),q=sc.nextInt();char[] a=sc.next().toCharArray();pre=new int[26][n];
		for(int i=0;i<n;i++)
		{
			sum[a[i]-'a']++;
			for(int j=0;j<26;j++)
			{
				pre[j][i]=sum[j];
			}
		}
		for(int i=0;i<q;i++)
		{
			int l=sc.nextInt()-1,r=sc.nextInt()-1;int[] cnt=new int[26];
			for(int j=0;j<26;j++)
			{
				cnt[j]=(pre[j][r]-(l==0?0:pre[j][l-1]));
			}
			List<Integer> list=new ArrayList<Integer>();int sum=0;
			for(int j=0;j<26;j++)
			{
				if(cnt[j]>0)
				{
					list.add(cnt[j]);sum+=cnt[j];
				}
			}
			int now=0,ans=Integer.MAX_VALUE;Collections.sort(list);
			for(int j=0;j<list.size();j++)
			{
				int curr1=now,curr2=sum-now,curr3=curr2-(list.get(j)*(list.size()-j));
				now+=list.get(j);ans=Math.min(ans,curr1+curr3);
			}
			out.println(ans);
		}
		out.close();
    }
}
class FastScanner
{
    BufferedReader in;
    StringTokenizer st;
    public FastScanner(BufferedReader in) {
        this.in = in;
    }
	
    public String nextToken() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
	
	public String next() throws Exception {
		return nextToken().toString();
	}
	
    public int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }
    public double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}