import java.util.*;
public class MagicSquare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Side");
        int s=sc.nextInt();
        int a[][]=new int[s][s];
        for(int i=0;i<s;i++)
        for(int j=0;j<s;j++)
        a[i][j]=0;
        int m=s/2;
        a[0][m]=1;
        int l=1;
        int j=m;
        int i=0;
        for(;;)
        {   ++l;
            if(i==s-1)
                i=-1;
                i++;
                
                if(j==s-1)
                    j=-1;
                
                if(a[i][j+1]==0)
                {
                    j++;
                    
                }
                else
                {if(j==-1)
                  j=s-1;
                }
                a[i][j]=l;
            
                if(l>=s*s)
                break;
            }
            
            for(int k1=0;k1<s;k1++)
            {
                for(int k2=0;k2<s;k2++)
                {
                    if(a[k1][k2]>99)
                    System.out.print (" "+a[k1][k2]);
                    if(a[k1][k2]>9)
                    System.out.print ("  "+a[k1][k2]);
                    if(a[k1][k2]<=9)
                    System.out.print ("   "+a[k1][k2]);
                }
            System.out.println();
        }
    }
}
    
        