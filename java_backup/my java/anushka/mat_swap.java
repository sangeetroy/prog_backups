import java.io.*;
class mat_swap
{
    public static void main()throws IOException
    {
        int a[][],i,n,k,k1,j,t;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter term:");
        n=Integer.parseInt(br.readLine());
        a=new int[n][n];
        for(i=0;i<n;i++)
        {
         for(j=0;j<n;j++)
        {   
            a[i][j]=Integer.parseInt(br.readLine());
        }
    }
    for(i=0;i<n;i++)
        {
         for(j=0;j<n;j++)
        {   
            if(a[i][j]>=1 && a[i][j]<=9)
            System.out.print(a[i][j]+" "+" ");
            else
            System.out.print(a[i][j]+" ");
        }
       System.out.println("");
    }
        i=1;
    k=0;
    k1=n-1;
    while(i<=n/2)
    {
      for(j=0;j<n;j++)
      {
          t=a[j][k];
          a[j][k]=a[j][k1];
          a[j][k1]=t;
        }
        k++;
        k1--;
        i++;
    }
     for(i=0;i<n;i++)
        {
         for(j=0;j<n;j++)
        {   
            if(a[i][j]>=1 && a[i][j]<=9)
            System.out.print(a[i][j]+" "+" ");
            else
            System.out.print(a[i][j]+" ");
        }
       System.out.println("");
    }
}
}