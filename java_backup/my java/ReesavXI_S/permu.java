import java.util.*;
class permu
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter aa number ");
        n=sc.nextInt();
    }
    void calc()
    {
        int r=0,f=0,a=0,sum=0,sum1=0,cr=0;
        r=n;
        while(r>0)
        {
            a=r%10;
            sum=sum+fact(a);
            r=r/10;
            cr++;
        }
        System.out.println("Normal permutations ");
        for(int i=0;i<(int)Math.pow(10,cr);i++)
        {
            f=i;sum1=0;
            while(f>0)
            {
                a=f%10;
                if(a!=0)
                sum1=sum1+fact(a);
                f=f/10;
            }
            if(sum1==sum)
            System.out.println(i);
        }
        System.out.print("Restricted permutations ");
        for(int i=0;i<(int)Math.pow(10,cr);i++)
        {
            f=i;sum1=0;
            while(f>0)
            {
                a=f%10;
                if(a!=0)
                sum1=sum1+fact(a);
                f=f/10;
            }
            if(sum1==sum&&prime(sum1)==true)
            System.out.println(i);
            else if(sum1==sum&&i%2==1)
            System.out.println(i);
        }
    }
    int fact(int i)
    {
        if(i<2)
        return 1;
        else
        return (i*fact(i-1));
    }
    boolean prime(int i)
    {
        int cr=0;
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
            cr=cr+1;
        }
        if(cr==0)
        return true;
        else
        return false;
    }
    void main()
    {
        input();
        calc();
    }
}