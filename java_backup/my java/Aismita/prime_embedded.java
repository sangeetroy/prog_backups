import java.io.*;
class prime_embedded
{
    public static void main(String ar[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number");
        int n=Integer.parseInt(in.readLine());
        int c=0,c1=0;int d=n,n2=n;
        while(n!=0)
        {
            int p=n%10;
            c++;
            n/=10;
        }
        int a[]=new int[c];
        int i=0;
        while(d!=0)
        {
            int p=d%10;
            a[i]=p;
            i++;
            d/=10;
        }
        int g=0;
        for(i=2;i<n2;i++)
        {
            int j=i,i1=i; int f=0;
            while(j!=0)
            {
                int p=j%10;
                c1++;
                for(int k=0;k<c;k++)
                {
                    if(p!=a[k])
                    break;
                    else
                    g++;
                }
                j/=10;
            }
            if(g==c1)
            {
                for(int m=0;m<i1;m++)
                {
                    if(i1%m==0)
                    f++;
                }
                if(f==0)
                System.out.println("Embedded prime..."+i);
            }
        }
    }
}
               
        
        