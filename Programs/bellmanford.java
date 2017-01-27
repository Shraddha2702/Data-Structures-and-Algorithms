//package myclass.Graphs;

//import myclass.PrintArray;

/**
 *
 * @author wijebandara
 */
public class BellmanFord 
{
    private int data[][];
    private int d[];	//Distance
    private int pi[];
    private boolean h[]; //Visited
    
    BellmanFord(int data[][])
    {
        this.data=new int[data.length][data.length];
        this.data=data;
        this.d=new int[data.length];
        this.pi=new int[data.length];
        h=new boolean[data.length];
        
    }
    public boolean bellmanFord(int s)
    {
        initialize();
        d[s]=0;
        pi[s]=0;
        for(int i=0;i<data.length;i++)
        {
            for(int u=0;u<data.length;u++)
            {
                for(int v=0;v<data.length;v++)
                {
                    if(data[u][v]!=0)
                    {
                        relaxation(u,v);
                    }
                }
            }
        }
        //PrintArray.printArray(d," ");
        System.out.println();
        //PrintArray.printArray(pi," ");
        System.out.println();
        for(int u=0;u<data.length;u++)
        {
            for(int v=0;v<data.length;v++)
            {
                if(data[u][v]!=0 && d[v]>d[u]+data[u][v])
                {
                    System.out.println(v+" "+u);
                    return false;
                }
            }
        }
        return true;
    }
    
    private void initialize()
    {
        for(int i=0;i<data.length;i++)
        {
            pi[i]=-1;
            h[i]=false;
        }
    }

    
    private void relaxation(int u ,int v)
    {
        if(!h[v] || d[v]>d[u]+data[u][v])
        {
            d[v]=d[u]+data[u][v];
            pi[v]=u;
            h[v]=true;
        }
    }

	
}