public class Number
{
    void Fibonacci()
    {
        int f=0,s=1,t;
        System.out.println(f);
        System.out.println(s);
        int n=2;
        while(n<15)
        {
            t=f+s;
            System.out.println(t);
            f=s;
            s=t;
            n++;
        }
    }
}

