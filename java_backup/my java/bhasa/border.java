import java.io.*;
class border
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a[][];
    int i,j,n;
    
    void input()throws IOException
    {
        System.out.println("ENTER n");
        n=Integer.parseInt(br.readLine());
        a=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("ENTER ELEMENT FOR ("+i+","+j+")");
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
        print();
    }
    
    void print()throws IOException
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println();
        }
        printborder();
    }
    
    void printborder()throws IOException
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
            if(i==0 || i==n-1)
            {
                
                System.out.print(a[i][j]+" ");
            }
            else
            if(j==0 || j==n-1)
            System.out.print(a[i][j]+" ");
            else
            if(i!=0 && i!=n-1 && j!=0 && j!=n-1)
            System.out.print("   ");
        }
            System.out.println();
        }
    }
}
        