import java.util.*;
class bin_obj
{
    int n;
    int n1;
    bin_obj(int s)
    {
        n=s;
    }
    void clac()
    {
        int cr=0,a=0,a1=0,i=0;
        String s=" ";
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
        System.out.print(s.charAt(i));
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        n1=sc.nextInt();
        bin_obj n2=new bin_obj(n1);
    }
}   