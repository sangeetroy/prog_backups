import java.io.*;
class diag
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of rows and columns");
        int n=Integer.parseInt(br.readLine());
        int a[][]=new int[n][n];
        int min=10000,max=0,p=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(i==j)
                    continue;
                else
                {
                    if(a[i][j]>max)
                    {
                        max=a[i][j];
                    }
                    if(a[j][i]<min)
                    {
                        min=a[j][i];
                    }
                }
            }
        }
        System.out.println("the minimum element is="+min);
        System.out.println("The maximum element is="+max);
    }
}