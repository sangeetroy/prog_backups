import java.util.*;
class binary_table
{
    int n=0;
    binary_table(int num)
    {
    n=num;
    }
    void clac()
    {
        int r=0;
        r=(int)Math.pow(2,n);
        int i=0,x=0,b=0,j=0,k=0;
        String s="";
        String s1="";
        for(i=0;i<r;i++)
        {
            x=i;
            s="";
            s1="";
            while(x>0)
            {
                b=x%2;
                s=s+b;
                x=x/2;
            }
            for(j=s.length()-1;j>=0;j--)
            s1=s1+s.charAt(j);
            while(s1.length()<n)
            s1="0"+s1;
            System.out.println(s1);
        }
    }
}
    