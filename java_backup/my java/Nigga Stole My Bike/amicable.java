import java.util.*;
public class amicable
{
    public void run()
    {
        for(int i=100;i<1000;i++)
        {
            for(int j=i+1;j<1000;j++)
            {
                if(fc(i)==fc(j))
                {
                    System.out.println(i+" & "+j);
                }
            }
        }
        
    }
    public int fc(int a)
    {
        int f=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                f=f+i;
            }
        }
        return f;
    }
}