import java.util.*;
class Series1
{
    public static void main (String args[])
    {
       Scanner SC = new Scanner (System.in);
       System.out.println ("Enter the no.");
       int n = SC.nextInt();
       while(n>0)
       {
           int k = n%10;
           if (k==0)
           System.out.println ("zero");
           if (k==1)
           System.out.println ("one");
           if (k==2)
           System.out.println ("two");
           if (k==3)
           System.out.println ("three");
           if (k==4)
           System.out.println ("four");
           if (k==5)
           System.out.println ("five");
           if (k==6)
           System.out.println ("six");
           if (k==7)
           System.out.println ("seven");
           if (k==8)
           System.out.println ("eight");
           if (k==9)
           System.out.println ("nine");
           n=n/10;
        }
    }
}