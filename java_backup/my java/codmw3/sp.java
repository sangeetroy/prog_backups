import java.util.*;
public class sp
{
    Scanner sc=new Scanner(System.in);
    int a[][],b;
    void input()
    {
        int c,d;
        System.out.println("Enter limit");
        b=sc.nextInt();
        a=new int[b][b];
        for(c=0;c<b;c++)
        {
            for(d=0;d<b;d++)
            {
                System.out.println("Enter number");
                a[c][d]=sc.nextInt();
            }
        }
    }
    void check()
    {
        int c,e,d,g=0;
        for(c=0;c<b;c++)
        {
            e=a[c][0];
            for(d=0;d<b;d++)
            {
                if(e<a[c][d])
                {
                    e=a[c][d];
                    g=d;
                }
            }
            g=lw(c,g);
            if(g==e)
            {
                System.out.println("Saddle point present");
                break;
            }
            else
            {
                rearr();
            }
        }
    }
    int lw(int m,int n)
    {
        int i,k;
        k=a[0][n];
        for(i=0;i<b;i++)
        {
            if(k>a[0][i])
            {
                k=a[0][i];
            }
        }
        return i;
    }
    void rearr()
    {
        int m,n,a1,b1,high,l,r,m2,n2;
        
        for(m=0;m<b;m++)
        {
            high=a[m][0];
            m2=0;n2=0;
            for(n=0;n<b;b++)
            {
                if(a[m][n]<high)
                {
                    high=a[m][n];
                    m2=m;
                    n2=n;
                }
            }
            l=cnt(high);
            if(l>=b-1)
            {
                for(l=0;l<b;l++)
                {
                    if(a[l][n2]>high || a[l][n2]==high)
                    {
                      continue;  
                    }
                    else 
                    {
                        for(a1=0;a1<b;a1++)
                        {
                            for(b1=0;b1<b;b1++)
                            { 
                               if(b1==n2)
                               {
                                   continue;
                                }
                                else if(a[a1][b1]>high)
                                {
                                    r=a[a1][b1];
                                    a[a1][b1]=a[l][n2];
                                    a[l][n2]=r;
                                }
                            }
                        }
                    }   
                 }
            }
         }
   }
    int cnt(int i)
   {
       int m,n,c=0;
     for(m=0;m<b;m++)
    {
        for(n=0;n<b;n++)
        {
            if(a[m][n]<i)
            {
                c++;
            }
        }
    }
    return c;
   }
   void main()
   {
       input();
       check();
       display();
}
void display()
{
    int m,n;
    for(m=0;m<b;m++)
    {
        for(n=0;n<b;n++)
        {
            System.out.print(+a[m][n]+" ");
            
        }
        System.out.println();
    }
}
}