package func_rec_;
import java.util.*;
class func_rec_boundary_elements
{
    int n;
    int a[][];
    func_rec_boundary_elements(int num)
    {
        n=num;
         a=new int[n][n];
    }
      void input()
    {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
            System.out.print("Enter a number");
            a[i][j]=sc.nextInt();
        }
    }
}
void print(int i)
{
    if(i==n)
    return;
    else
    {
        System.out.println(a[0][i]+"  ");
        System.out.println(a[i][0]+"  ");
        print((i+1));
    }
}
void print2(int j)
{
    if(j==n)
    return;
    else
    {
        System.out.print(a[j][n-1]+"  ");
        System.out.print(a[n-1][j]+"  ");
        print((j+1));
    }
}
}