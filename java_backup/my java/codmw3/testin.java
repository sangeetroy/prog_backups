import java.util.*;
public class testin
{   
    String a,ar[];
    int p[];
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter number");
        a=sc.nextLine();
        ar=new String[a.length()];
        p=new int[a.length()];
    }
    void store()
    {
        int m;
        for(m=0;m<a.length();m++)
        {
            ar[m]+=a.charAt(m);
        }
    }
    void crt()
    {
        int b,c;
        String d,n;
        d="";
        c=0;
        testin ob=new testin();
        ob.p=new int[this.p.length];
        for(b=0;b<a.length();b++)
        {
            d="";
            d+=this.a.charAt(b);
            ob.p[c]=b;
            ob.a=d;
            n=get(ob,c);
            System.out.println(n);
        }
    }
    String get(testin k,int c)
    {
        int m,n,fl;
        String str="",str2="",d;
        for(m=0;m<a.length();m++)
        {
            str=k.a;
            str2="";
            d="";
            fl=0;
            for(n=0;n<=c;n++)
            {
                if(m==k.p[n])
                {
                 fl=1;
                 break;
                }
            }
            if(fl==0)
            {
                d+=a.charAt(m);
                str+=d;
                k.a=str;
                k.p[c+1]=m;
                c++;
                str2=get(k,c);

            }
            System.out.println(str);
        }
        return str2;
    }
    void main()
    {
        input();
        store();
        crt();
    }
}