import java.util.*;
public class prime_check
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no.?");
int n=sc.nextInt();
int c=0;
int m=0;
int p=0;
int m1=0;
int n1=0;
int t=1;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
c=c+1;
break;
}
}
if(c==0)
{
  for(int i=n-1;i>=2;i--)
  {
      m=0;
      for(int j=2;j<i;j++)
      {
          if(i%j==0)
          {
              m=m+1;
              //m1=i;
              break;
            }
        }
        if(m==0)
        {
            System.out.println(i);
            break;
        }
    }
    int i=n+1;
    while(t>0)
    {
        
        t++;
        p=0;
      for(int j=2;j<i;j++)
      {
          if(i%j==0)
          {
              p=p+1;
               break;
            }
        }
        if(p==0)
        {
            System.out.println(i);
            break;
        }
       i++; 
    }
}
}
}
