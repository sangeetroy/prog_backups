import java.util.*;
public class sort
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
        int t=0;
        int p=0;
        if(n%2==0)
        {
            t=n/2+1;
        }
        else
        {
            t=n/2;
        }
        int gh=0;
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            {gh++;
            }
            int k=t-gh;
            for(int j=0;j<n;j++)
            {
                p=a[0];
                if(j==k)
                {
                    j=t+gh;
                    continue;
                }
                if(p<a[j])
                {
                    int lk=p;
                    p=a[j];
                    a[j]=lk;
                }
            }
            if(i==0)
            {
                int mn=a[t];
                a[t]=p;
                p=mn;
            }
            else if(i%2!=0)
            {
                int mn=a[t+gh];
                a[t+gh]=p;
                p=mn;
            }
            else if(i%2==0)
            {
                int mn=a[t-gh];
                a[t-gh]=p;
                p=mn;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" , ");
        }
    }
}
              
                
        
        
        