import java.util.*;
public class sort2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int mx=a[0],mn=a[0];
        for(int i=0;i<n;i++)
        {
            if(mx<a[i])
            mx=a[i];
            if(mn>a[i])
            mn=a[i];
        }
        int md=0;
        int eo=1,f=-1;
        if(n%2==0)
        {
            md=n/2+1;
        }
        else if(n%2!=0)
        {
            md=n/2-1;
        }
        int c=0;
        for(int i=mx;i>=mn;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(a[j]==i)
                { c++;
                    eo=eo*-1;
                    if(c%2!=0||c==1)
                    f++;
                    System.out.println("f"+f);
                    int k=f*eo;
                    int tp=a[md+k];
                    a[md+k]=a[j];
                    a[j]=tp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" , ");
        }
    }
}
                    

                
         