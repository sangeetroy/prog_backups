import java.io.*;
public class shift
{
    public static void main()throws IOException
    {
        int a[][];int i,j,m,n,l,t,k;m=0;n=0;k=0;j=0;int b[];l=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of rows");
        m=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of coloumns");
        n=Integer.parseInt(br.readLine());
        a=new int[m][n];
        System.out.println("enter the number of elements");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("the numbers are:");
        for(i=0;i<m;i++)
        {
        for(j=0;j<n;j++)
        {
            System.out.print(a[i][j]+"");
            System.out.println();
        }
    }
    t=0;
    b=new int[n];
   for(i=0;i<m;i++)
   {
       for(j=0;j<n;j++)
       {
           
           a[i][n-1]=b[t++];
           
           if(j!=n-1)
           a[i][j]=a[i][j+1];
           k=a[i][j];
           if(j==(n-1))
           {
               for(l=0;l<t;l++)
               {
                   a[i][0]=b[l];
        }
    }
}
}
    System.out.print(a[i][j]+"");
    System.out.println();
}
}
        

