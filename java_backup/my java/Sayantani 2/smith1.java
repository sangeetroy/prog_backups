import java.util.*;
class smith1
{
     public static void main()
            {
                 int n,n1,s,j,s1,x;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Number:");
      n=sc.nextInt();
      s=0;
      n1=n;
              while(n>=1)
              {
                  for (j=2;j<=n;j++)
                  {
                      if (n%j==0)
                      {
                          s1=0;
                          x=j;
                while(x>0)
                {
                    s1+=x%10;
                    x=x/10;
                }
                s=s+s1;
                          break;
                        }
                    }
                    n/=j;
                }
                s1=0;
                 while(n1>0)
                {
                    s1+=n1%10;
                    n1=n1/10;
                }
                
                if(s==s1)
                System.out.println("Smith number" + s);
                else
                System.out.println("Not a Smith number" + s);
            }
            
}
