import java.io.*;
class pendulum_sorting
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,min,max,i,t,t1,f,f1,j,k;
System.out.println("ENTER ARRAY SIZE");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
for(i=0;i<n;i++)
{
System.out.println("ENTER ARRAY ELEMENT FOR POSITION "+(i+1));
a[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<n;i++)
System.out.print(a[i]+",");
System.out.println("");
min=a[0];
max=a[0];
for(i=0;i<n;i++)
{
if(a[i]<min)
{
min=a[i];
}
else
if(a[i]>max)
{
max=a[i];
}
}
t=n/2;
t1=t-1;
f=0;
f1=0;
for(i=min;i<=max;i++)
{
for(j=0;j<n;j++)
{
if(a[j]==i)
{
if(f==0)
{
k=a[t];
a[t]=a[j];
a[j]=k;
t++;
f=1;
f1=0;
break;
}
else
if(f1==0)
{
k=a[t1];
a[t1]=a[j];
a[j]=k;
t1--;
f=0;
f1=1;
break;
}
}
}
}
for(i=0;i<n;i++)
System.out.print(a[i]+",");
}
}
