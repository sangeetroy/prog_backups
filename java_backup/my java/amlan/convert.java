import java.io.*;
class convert
{
    public static void main()throws IOException
    {
        double d,d1,d2;
        int k;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a no.:");
        d=Double.parseDouble(br.readLine());
        k=(int)d;
        d1=d-(double)k;
        int a[]=new int[100];
        int t=0;
        while(k>0)
        {
            int k1=k%2;
            a[t++]=k1;
            k/=2;
        }
        for(int i=t-1;i>=0;i--)
        System.out.print(a[i]);
        
        if(d1>0)
        {
            System.out.print(".");
            int c=0;
            while(d1>0)
            {
                d2=d1*2;
                if(d2>d1)
                {System.out.print(1);
                    d1=d2-1;
                }
                else
                {System.out.print(0);
                    d1=d2;
                }
            c++;
            if(c>4)
            break;
        }}
    }
}