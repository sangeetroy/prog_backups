//to input any integer number and print the frequency in ascending order .
import java.util.*;
class frequency
{
    public static void main()
    {
    Scanner sc = new Scanner(System.in);
    int i,f,n1,k,maxfreq,j,n;
     maxfreq=0;
   n=sc.nextInt();
    for(i=1;i<=9;i++)
    {
        f=0;
        n1=n;
        while(n1>0)
        {
            k=n1%10;
            if(k==i)
            f++;
            n1=n1/10;
        }
        if(f>0)
        {
           System.out.println("Digit:"+i+"Frequency:"+f);
        }
    }
    
    }
}
        

    