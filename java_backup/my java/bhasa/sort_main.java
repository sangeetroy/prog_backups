import java.util.*;
class diagonal_sort
{
    private int a[][];
    private int n,j,i,k,l,t;
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        n=sc.nextInt();
         a=new int[n][n];
         for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("ENTER ELEMENT FOR POSITION ("+i+","+j+")");
                a[i][j]=sc.nextInt();
            }
        }
    }
    public void display_original()
    {
        System.out.println("ORIGINAL MATRIX");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public void sort()
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    for(k=0;k<n;k++)
                    {
                        for(l=0;l<n;l++)
                        {
                             if(k==l)
                             {
                                 if(a[i][j]>a[k][l])
                                 {
                                     t=a[k][l];
                                     a[k][l]=a[i][j];
                                     a[i][j]=t;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        public void display()
        {
            System.out.println("SORTED ARRAY");
            for(k=0;k<n;k++)
             {
                        for(l=0;l<n;l++)
                        {
                            System.out.print(a[k][l]+" ");
                        }
                            System.out.println();
    }
    
}
}
public class sort_main
{
    public static void main(String args[])
    {
        diagonal_sort obj=new diagonal_sort();
        obj.get();
        obj.display_original();
        obj.sort();
        obj.display();
    }
}

                                 