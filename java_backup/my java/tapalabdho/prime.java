////to print any multidigit number and print sum of all the prime number .
import java.util.*;
class prime
{
    public static void main()
    {
        int k,s,n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        s=0;
        while(n>0)
        {
            k=n%10;
            if(k==1||k==3||k==5||k==7)
                    s=s+k;
        n=n/10;
    }
    System.out.println(s);
}
}