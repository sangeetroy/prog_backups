package project;

import java.io.*;
class seriespro
{
    public  void main()throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no.of elements:");
        int n,j,k,x,f,s,i,k1;
        n=Integer.parseInt(br.readLine());
        j=1;
        k=1;
        s=0;
        for(i=1;i<=n;i++)
        {
            x=1;
            for(k1=1;k1<=j;k1++)
            x=x*j;
            f=1;
           for(k1=1;k1<=j;k1++)
           f=f*k1;
           s=s+(x/f)*k;
           j=j+2;
           k=k*-1;
        }
        System.out.print(s);
    }
}
           
        