import java.util.*;
class amicable
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number ");
        n=sc.nextInt();
    }
    void amicable(amicable a,amicable b)
    {
        int sum=0;
        for(int i=1;i<a.n;i++)
        {
            if(a.n%i==0)
            {
                sum=sum+i;
            }
        }
        int sum1=0;
        for(int j=1;j<b.n;j++)
        {
            if(b.n%j==0)
            {
                sum1=sum1+j;
            }
        }
        if(sum==b.n&&sum1==a.n)
        {
            System.out.print("Amicable ");
            return;
        }
        System.out.print("Non Amicable ");
    }
    void main()
    {
        amicable a=new amicable();
        amicable b=new amicable();
        a.input();
        b.input();
        amicable(a,b);
    }
}
            