package func_rec_;
import java.util.*;
class arr_non_diag
{
    int a[][];
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter aray size ");
        n=sc.nextInt();
        a=new int[n][n];
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter a number ");
                a[i][j]=sc.nextInt();
            }
        }
    }
    void print(int i,int j)
    {
        if(i==n||j==n)
        return;
        if(i!=j)
        System.out.print(a[i][j]+" ");
        print(i,j+1);
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    void main()
    {
        input();
        accept();
        System.out.println("Displaying original matrix ");
        display();
        int i=0;
        while(i<n)
        {
            print(i,0);
            i=i+1;
        }
    }
}