package prac_exam;
import java.util.*;
class product_rec
{
    int a;
    int b;
    product_rec(int m,int n)
    {
        a=m;
        b=n;
    }
    void calc()
    {
        int c=0;
        c=prod(a,b);
        System.out.print(c);
    }
    int prod(int d,int e)
    {
        int f;
        int g;
        f=d;
        g=e;
        if(g>1)
        {
        f=prod((f+f),(g-1));
        return f;
    }
        else
        {
            if(g==1)
            return f;
            else if(g==0)
            return 0;
            else
            return -1;
    }
}
}
