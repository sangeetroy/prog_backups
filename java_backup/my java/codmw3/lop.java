import java.util.*;
public class lop
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        
        int a,aa=0,c,d,e=0,m,n,i,j,g,k,p;
        int l=0;
        
        System.out.println("Enter limit");
        a=sc.nextInt();
        
        int b[]=new int[a];
        d=0;
        for(c=0;c<a;c=c+1)
        {
            System.out.println("Enter Number");
            b[c]=sc.nextInt(); 
        }
        e=b[0]+1;
        for(l=0;l<a;l=l+1)
        {
            if(b[l]>e)
            {
                e=b[l]+1;
            }
            }
        i=0;
        j=0;
        g=0;
        for(m=0;m<a;m=m+1)
        {
            for(n=0;n<a;n=n+1)
            {
                if(b[n]>g && b[n]<e)
                {
                    
                    aa=n;
                }
            }
            e=b[aa]+1;
            System.out.println(+e);
        }
    }
}