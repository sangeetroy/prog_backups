import java.io.*;
public class check1 extends number1
{
   int max,p,k,k1,c;
    public void large_digit()throws IOException
    {
       input();
       k=show();
       
       k1=0;
       while(k>0)
       {
           k1=(k1*10)+k%10;
           k=k/10;
        }
       p=0;
       c=0;
       max=k1%10;
       while(k1>0)
       {
           c++;
           if(k1%10 >=max)
           {
               max=k1%10;
               p=c;
            }
            
            k1=k1/10;
            
        }
        System.out.println("Maximum digit:"+max+"position:"+p);
       
       
    }

   
}
