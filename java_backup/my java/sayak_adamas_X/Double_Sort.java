import java.util.*;
public class Double_Sort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Input the number of elements :");
int n=sc.nextInt();
int a[]=new int[n];
int k;
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int i=0;i<n/2-1;i++)
{
int pos=i;
for(int j=i+1;j<n/2;j++)
if(a[j]<a[pos])
pos=j;
k=a[pos];
a[pos]=a[i];
a[i]=k;
}
int k1=0;
for(int i=n/2;i<n;i++)
{
for(int j=n/2;j<n-k1-1;j++)
if(a[j]>a[j+1])
{
k=a[j];
a[j]=a[j+1];
a[j+1]=k;
}
k1++;
}
System.out.println("Numbers after sorting :");
for(int i=0;i<n;i++)
System.out.println(a[i]);
}
}