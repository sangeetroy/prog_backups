import java.io.*;
class binarysearching_array
{
public static void main(String args[])throws IOException
{
int a[]=new int[50];
int i=0,t,j=0,n,v,high=0,low=0,mid,f=0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Give Term:");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
System.out.print("Give Searching Element:");
v=Integer.parseInt(br.readLine());
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
low=0;
 high=n-1;
mid=(low+high)/2;
f=0;
while(low<=high)
{
if(a[mid]==v)
{
f=1;
break;
}
else
if(v>a[mid])
{
low=mid+1;
}
else
if(v<a[mid])
{
high=mid-1;
}
mid=(low+high)/2;
}
if(f==1)
System.out.println("found"+v);
else
System.out.println("Not found"+v);
}
}