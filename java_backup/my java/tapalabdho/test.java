//to inpit any number and check it is twin prime or not .
import java.util.*;
class test
{
    public static void main()
    {
        int i,a,b,f,f1;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        f=0;
        for(i=2;i<a;i++)
        if(a%i==0)
        {
            f=1;
            break;
        }
            if(f==0)
        {
            f1=0;
            for(i=2;i<b;i++)
            if(b%i==0)
        {
            f1=1;
            break;
        }
        if(f1==0 && f1==0)
        {
        if(a-b==2 ||a-b==-2)
            System.out.println("Twin Prime");
        }
    }
}
}
    