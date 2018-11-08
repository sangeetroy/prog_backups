package Inheritance;
import java.util.*;
class Gen implements Power1,Factorial1
{
    int n;
    void input(int m)
    {
        n=m;
        double x=0;
        double y=0;
        double z=0;
        int k=1;
        double sum=0;
        for(int i=1;i<n;i++)
        {
            x=pow(i);
            y=cal(i);
            z=x/y;
            System.out.print(z+" ");
            k=k*-1;
            z=z*k;
            sum=sum+z;
        }
        System.out.print("The sum is = "+sum);
    }
    public int pow(int i)
    {
        return (int)Math.pow(i,i);
    }
    public int cal(int i)
    {
        int f=1;
        while(i>0)
        {
            f=f*i--;
        }
        return f;
    }
}
