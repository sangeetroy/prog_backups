import java.util.*;
class Pattern
{
    public static void main(String args[])
    {
        int i,j,k,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of term:");
        n=sc.nextInt();
        k=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k);
                k=k+2;
            }
            System.out.println(" ");
        }
    }
}