import java.util.*;
public class recu
{
    Scanner sc=new Scanner(System.in);
    int a,b=0,c=0;
    void input()
    {
        System.out.println("Enter number");
        a=sc.nextInt();
        b=0;c=0;
        rec1(a);
        c=0;
        //System.out.println(b);
        if(b%2==1)
        {
            b+=1;
        }
        rec2(a);
        
    }
    void rec1(int m)
    {
       
        if(m%10==0)
        {
            System.out.println(+(c+m));
            
            return;
        }
        else 
        {
           c=c*10+m%10;
           
        }
         b++;
        rec1(m/10);
    }
    void rec2(int m)
    {
        
       //System.out.println(m+","+c);
        if(c>=(b-1)/2)
        {
            System.out.println(+m%10);
            return;
        }
        else
        {
            c=c+1;
            rec2(m/10);
        }
    }
}
        
    