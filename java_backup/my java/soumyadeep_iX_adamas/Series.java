import java.util.*;
class Series
{
    int n;
    Series()
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        n = SC.nextInt();
    }
    void print()
    {
       int k, j, i;
        int SP = 25;
       int Spa = 4;
       for(i=1;i<=n;i++)
       {
           for(k=1;k<=SP;k++)
           System.out.print(" ");
           if(i==1)
           System.out.print("*");
           else 
           if (i==n)
           {
           for(j=1;j<=n;j++)
           System.out.print("*");
        }
           else 
           {
           System.out.print("*");
           for(k=1;k<=Spa;k++)
           System.out.print(" ");
           System.out.print("*");
        }
        System.out.println("");
           SP=SP-2;
           Spa=Spa+2;
        }
           
        }
    }
           