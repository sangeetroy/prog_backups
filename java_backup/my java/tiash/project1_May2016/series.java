package project1_May2016;

//to find the sum of the series using functions
import java.io.*;
class series
{
    double fact(int m)
    {
        int i,f;
        f=1;
        for(i=1;i<=m;i++)
        {
            f=f*i;
            return(f);
        }
    return(m);
}void main()throws IOException
        {
            int a,j,n=0;
            double p,k,s;s=1;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the value of a");
            a=Integer.parseInt(br.readLine());
            series ob=new series();
            for(j=2;j<=n;j=j+2);
            {
            p=Math.pow(a,j);
            k=ob.fact(j);
            s=s+p/k;
        }
            System.out.println("the sum of the series is"+s);
        }
        }