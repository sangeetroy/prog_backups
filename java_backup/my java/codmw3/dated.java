import java.util.*;
public class dated
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,a2,b2,c2,n,m1=0,m2=0,d1,d=0;
        System.out.println("enter date 1");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Enter date 2");
        a2=sc.nextInt();
        b2=sc.nextInt();
        c2=sc.nextInt();
        int e[]={31,28,31,30,31,30,31,31,30,31,30,31};
        
        if(a>a2)
        {
            d1=a-a2;
        d=d1*365;
        for(n=0;n<b-1;n=n+1)
        {
            m1=m1+e[n];
        }
        for(n=0;n<b2-1;n=n+1)
        {
            m2=m2+e[n];
        }
        m1=m1+c;m2=m2+c2;
        d=d+m1-m2;
        System.out.println(+d+" Days");
    }
    else if(a2>a)
    {
        d1=a2-a;
        d=d*365;
        for(n=0;n<b-1;n=n+1)
        {
            m1=m1+e[n];
        }
        for(n=0;n<b2-1;n=n+1)
        {
            m2=m2+e[n];
        }
        m1=m1+c;
        m2=m2+c2;
        d=d+m2-m1;
        System.out.println(+d+" Days");
    }
}
}
       
        
        
       
        