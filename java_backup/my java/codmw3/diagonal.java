import java.util.*;
public class diagonal
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,d,e,g=0;
        
        System.out.println("enter number of columns ");
        System.out.println("enter number of rows");
        a=sc.nextInt();
        b=sc.nextInt();
        g=b-1;
        int c[][]=new int[a][b];
        for(d=0;d<a;d=d+1)
        {
           for(e=0;e<b;e=e+1)
           {
               System.out.println("enter value");
               c[d][e]=sc.nextInt();
            }
        }
        for(d=0;d<a-1;d=d+1)
        {
            for(e=0;e<g;e=e+1)
            {
                System.out.print(+c[d][e]);
            }
            System.out.println();
        }
        g=b-1;
        for(d=0;d<a-1;d=d+1)
        {
            for(e=b-1;e>=g-1;e=e-1)
            {
                System.out.print(+c[d][e]);
            }
            System.out.println();
            g--;
        }
    }
}
            
        
      
        
        