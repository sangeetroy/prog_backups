import java.io.*;
class sort_11
{
void input()throws IOException
{
DataInputStream in=new DataInputStream(System.in);
int n;
System.out.println("enter array size");
n=Integer.parseInt(in.readLine());
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
System.out.println("Enter number");
a[i]=Integer.parseInt(in.readLine());
}
int j=0,temp=0,pos=0,mid=0,k=1,t=1;
int b[]=new int [n];
for(i=0;i<n-1;i++)
{
pos=i;
for(j=i+1;j<n;j++)
{
if(a[j]>a[pos])
pos=j;
}
temp=a[pos];
a[pos]=a[i];
a[i]=temp;
}
mid=n/2;
t=1;
b[mid]=a[0];
for(i=1;i<n;i=i+2)
{
b[mid+k]=a[i];
b[mid-k]=a[i+1];
k=k+1;
}
System.out.println("Newly Sorted Array");
for(i=0;i<n;i++)
{
for(j=0;j<=30000;j++)
{
}
System.out.print(b[i]+" ");
}

}
}
