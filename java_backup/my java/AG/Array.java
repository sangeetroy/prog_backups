import java.util.*;
class Array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[],n,i,c;
        System.out.println("Even term");
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
       a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        System.out.println(a[i]);
    }
}
        