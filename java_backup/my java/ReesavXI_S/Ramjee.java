import java.util.*;
class Ramjee
{
    int n;
    Ramjee()
    {
        n=0;
    }
    void readNum(int nx)
    {
        n=nx;
    }
    int findPower(int x)
    {
        return (x*x);
    }
    int sumOfSquare(int n)
    {
        int a=0;int sum=0;
        while(n>0)
        {
            a=n%10;
            sum=sum+findPower(a);
            n=n/10;
        }
        return sum;
    }
    void isRamjee()
    {
        int copy=n;
        int x=sumOfSquare(copy);
        while(x>10)
        {
            x=sumOfSquare(x);
        }
        if(x==1)
        System.out.print("Ramjee "+n);
    }
}