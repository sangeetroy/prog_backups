import java.util.*;
class name_encryption
{
    String s=" ";
    name_encryption(String n)
    {
        s=n;
    }
    void clac()
    {
        Scanner sc=new Scanner(System.in);
        String enc=" ";
        int x=0,y=0;
        System.out.print("Enter encryption code");
        enc=sc.nextLine();
        x=add_as(enc);
        y=single_d(x);
        int i=0,r1=0;
        char ch=' ';
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            r1=(int)ch+y;
            System.out.print((char)r1+" ");
        }
    }
    int add_as(String n1)
    {
        String c=" ";
        c=n1;
        int j=0,x=0,sum=0;
        char ch1=' ';
        for(j=0;j<c.length();j++)
        {
            ch1=s.charAt(j);
            x=(int)ch1;
            sum=sum+x;
        }
        return sum;
    }
    int single_d(int n1)
    {
        int d=0,r=0,m=0,i=0,r3=0,r4=0;
        d=n1;
        while(d>0)
        {
            r=d%10;
            m=m+r;
            d=d/10;
        }
        if(m>9)
        {
            while(m>0)
            {
                r=m%10;
                r3=r3+r;
                m=m/10;
            }
            return r3;
        }
        else
        return m;
    }
}

