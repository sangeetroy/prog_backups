package array2d;

import java.io.*;
public class boundary_elements_of_a_matrix
{
public static void main()throws IOException
 {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,j;
System.out.print("Enter the size of the matrix:");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
System.out.print("Enter the matrix elements:");
for(i=0;i<n;i++)
for (j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
for (j=0;j<n;j++)
System.out.print(a[i][j]+" ");
System.out.println("");
}
for(i=0;i<n;i++)
{
if(i==0 || i==(n-1))
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+" ");
}
else
{
for(j=0;j<n;j++)
{
if(j==0 || j==n-1)
{
System.out.print(a[i][j]+" ");
}
else
{
System.out.print(" ");
}
}
}
System.out.println("");
}
}
}