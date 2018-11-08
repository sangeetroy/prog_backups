package Inheritance;
import java.util.*;
class Search extends Sort
{
    int l,mid,h,v;
    Search(int n2)
    {
        super(n2);
        super.sort1();
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to be found out ");
        v=sc.nextInt();
    }
    void calc()
    {
        mid=n/2;
        l=0;
        h=n-1;
        while(l<h)
        {
            if(a[mid]==v)
            {
                System.out.print("Element found ");
                break;
            }
            else if(v>a[mid])
            l=mid+1;
            else
            h=mid-1;
            mid=(l+h)/2;
        }
    }
    void main()
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a anumber ");
        n=sc.nextInt();
        Search obj=new Search(n);
        obj.input();
        obj.calc();
    }
}