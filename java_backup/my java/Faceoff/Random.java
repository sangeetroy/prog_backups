import java.io.*;
class Random
{
    public static void main()throws IOException
    {
        int a[]=new int[10];
        int i,k,j,c=0,f;
        for(i=0;i<10;i++)
        {
            k=(int)(i*Math.random());
            if(k>=1 && k<=6)
            {
                a[c++]=k;
            }
        }
        for(i=0;i<c;i++)
        System.out.println(a[i]);
        System.out.println("Frequency:");
        for(i=1;i<=6;i++)
        {
            f=0;
            for(j=0;j<c;j++)
            if(a[j]==i)
             f++;
            if(f>0)
             System.out.println(i+","+f);
        }
    }
}
            
        