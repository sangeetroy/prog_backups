package Inheritance;
import java.util.*;
class B_Search
{
    int a[];
    int n;
    B_Search(int n1)
    {
        n=n1;
    }
    void input()
    {
        a=new int[n];
    }
    void insert()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter a number ");
            a[i]=sc.nextInt();
        }
    }
}