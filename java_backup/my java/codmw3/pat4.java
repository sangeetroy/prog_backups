import java.util.*;
public class pat4
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e;
        
        System.out.println("Enter number");
        a=sc.nextInt();
        for(b=1;b<=a;b++)
        {
            if(b%2==0)
            {
                System.out.print(" ");
            }
            for(c=1;c<=a;c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}