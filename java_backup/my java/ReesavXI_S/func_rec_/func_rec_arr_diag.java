package func_rec_;
import java.util.*;
class func_rec_arr_diag
{
    int n;
    int a[][];
    func_rec_arr_diag(int num)
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
void diag(int i,int n)
{
    if(i==n)
    return;
    else
    {
        System.out.print(a[i][i]+" ");
        System.out.println(" "+a[i][n-i-1]);
        diag((i+1),n);
    }
}
}
