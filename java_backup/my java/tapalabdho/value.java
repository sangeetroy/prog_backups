//to input any multidigit number less than 10000 and store all the digit in seperate values in different variables .
import java.util.*;
class value
{
    public static void main()
    {
        int n,a,c,d,n1,i,b;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        c=0;
        n1=n;
        while(n1>0)
        {
            c++;
            n1=n1/10;
        }
        i=1;
        a=b=c=d=0;
        while(i<=c)
        {
            if(n>0)
            {
                a=n%10;
                n=n/10;
            }
            if(n>0)
            {
                b=n%10;
                n=n/10;
            }
            if(n>0)
            {
                c=n%10;
                n=n/10;
            }
            if(n>0)
            {
                d=n%10;
                n=n/10;
            }
           
                if(a!=0)
                System.out.println(a);
                if(b!=0)
                System.out.println(b);
                if(c!=0)
                System.out.println(c);
                if(d!=0)
                System.out.println(d);
                i++;
            }
        }
    }