import java.util.*;
class bin_addmany
{
    String s[];
    int n;
    bin_addmany(int s1)
    {
        n=s1;
        s=new String[n];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter a number ");
            s[i]=sc.nextLine();
        }
    }
    void sum()
    {
        int sum=0; String x="";
        for(int i=0;i<n-1;i++)
        {
            x=sum(s[i],s[i+1]);
            s[i+1]=x;
        }
        System.out.print("Sum is "+x);
    }
    String sum(String q,String s1)
    {
        int cr=0,a=0,a1=0,i=0,n=0,n1=0;
        String s="";
        String z="";
        n=Integer.parseInt(q);
        n1=Integer.parseInt(s1);
        while(n>0||n1>0||cr!=0)
        {
            a=n%10;
            a1=n1%10;
                if(a==0&&a1==0&&cr==0)
                {
                    cr=0;
                s=s+"0";
            }
                else if(a==0&&a1==1&&cr==0)
                {
                    cr=0;
                s=s+"1";
            }
                else if(a==1&&a1==0&&cr==0)
                {
                    cr=0;
                s=s+"1";
            }
                else if(a==1&&a1==1&&cr==0)
                {
                    s=s+"0";
                    cr=1;
                }
             else if(a==0&&a1==0&&cr==1)
              {
                cr=0;  
                s=s+"1";
            }
                else if(a==0&&a1==1&&cr==1)
                {
                cr=1;    
                s=s+"0";
            }
                else if(a==1&&a1==0&&cr==1)
                {
                    cr=1;
                    s=s+"0";
            }
                else if(a==1&&a1==1&&cr==1)
                {
                    s=s+"1";
                    cr=1;
                }
            n=n/10;
            n1=n1/10;
        }
        for(i=s.length()-1;i>=0;i--)
        z=z+s.charAt(i);
        return z;
    } 
}      