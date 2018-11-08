import java.util.*;
class Smith
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        n=sc.nextInt();
    }
    void calc()
    {
        int sum_d=0,sum_f=0,sum_g=0;
        sum_d=sum(n);
        for(int i=2;i<n;i++)
        {
            if(prime(i)==true)
               if(n%i==0)
                 sum_g=sum_g+sum(i);
        }
        sum_f=sum(sum_g);
        if(sum_d==sum_f)
        System.out.print("Smith number "+n);
        else
        System.out.print("Non Smith number "+n);
    }
    boolean prime(int n)
    {
        int cr=0,i=n-1;
        while(i>2)
        {
            if(n%i==0)
            cr++;
            i--;
        }
        if(cr==0)
        return true;
        return false;
    }
    int sum(int s)
    {
        int a=0,sum=0;
        while(s>0)
        {
            a=s%10;
            sum=sum+a;
            s=s/10;
        }
        return sum;
    }
}
        