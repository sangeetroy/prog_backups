class patte
{
    public static void main(String args[])
    {
        int i,j,l,s,m;
        l=5;s=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=l;j++)
            
             System.out.print(j);
             for(m=1;m<s;m++)
             System.out.print(" ");
             if(i==1)
             j=j-2;
             else
             j=j-1;
             while(j>=1)
             {
                 System.out.print(j);
                 j--;
                }
                s=s+3;
                l=l-1;
                System.out.println(" ");
                 
            }
        }
    }