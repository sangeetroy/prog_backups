package Inheritance;
import java.util.*;
class Octal extends Decimal
{
    void conv()
    {
        super.input();
        int a=0,b=0,s=0,c=0,l=0;
        double a1;
        a=(int)n;
        a1=n-a;
        while(a!=0)
        {
            b=a%8;
            s=(s*10)+b;
            a=a/8;
        }
        while(s>0)
        {
            c=s%10;
            l=(l*10)+c;
            s=s/10;
        }
        System.out.print(l);
    }
}