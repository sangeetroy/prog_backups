import java.util.*;
public class arr
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int b,c,d,k,m,x,y,n;
        System.out.println("Enter limit");
        n=sc.nextInt();
        int a[][]=new int [n][n];
        d=1;
        System.out.println("Enter co-ordinates");
        x=sc.nextInt();
        y=sc.nextInt();
        for(b=0;b<n;b++)
        {
            for(c=0;c<n;c++)
            {
                a[b][c]=d;
                d++;
            }
        }
        for(b=0;b<n;b++)
        {
            for(c=0;c<n;c++)
            {
                System.out.print(+a[b][c]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        k=0;
        m=0;
         for(b=x;b>=0;b--)
        {
            k=a[y][b];
            a[y][b]=m;
            m=k;
            
        }
        for(b=y+1;b<n;b++)
        {
            k=a[b][0];
            a[b][0]=m;
            m=k;
            
        }
       for(b=0;b<n;b++)
        {
            for(c=0;c<n;c++)
            {
                System.out.print(+a[b][c]+" ");
            }
            System.out.println();
        }
   }   
}