import java.util.*;
public class spiral_matrix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter side");
int n=sc.nextInt();
int a[][]=new int[n][n];
for( int x=0;x<n;x++)
        {
            for(int y=0;y<n;y++)
            {
                a[x][y]=0;
            }
            
        }
int h=1;
for(int i=0;i<n;i++)
       {
           
           for(int j=0;j<n-1;j++)
           {
               if(a[i][j]==0)
               {
                   
                
                a[i][j]=h;
                h++;
            }
            }
          
            for(int l=0;l<=n-1;l++)
           {
               if(a[l][n-i-1]==0)
               {
                  
                
                a[l][n-i-1]=h;
                h++;
            }
        }
           
            for(int k=n-1;k>=0;k--)
           {
               if(a[n-i-1][k]==0)
               {
                
                
                a[n-i-1][k]=h;
                h++;
            }
        }
            
                        
            for(int m=n-1;m>=0;m--)
           {
               if(a[m][i]==0)
               {
                a[m][i]=h;
                h++;
            }
        }
            
        }
        
        for( int x=0;x<n;x++)
        {
            for(int y=0;y<n;y++)
            {
                    if(a[x][y]<10)
                    {
                    System.out.print("  ");
                }
                else if(a[x][y]<100)
                {
                    System.out.print(" ");
                }
                System.out.print(a[x][y]+" ");
            }
            System.out.println();
        
    }

}
}