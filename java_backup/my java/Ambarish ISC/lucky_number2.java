import java.io.*;
class lucky_number2
{
public static void main(String args[])throws IOException
{
int n,i,t,d,t1,limit;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER LIMIT");
n=Integer.parseInt(br.readLine());
t=0;d=2;t1=n;limit=n;
int a[]=new int[n];
int b[]=new int[n];
for(i=0;i<n;i++)
{
System.out.println("enter element for element no."+(i+1));
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("ORIGINAL SERIES :-");
for(i=0;i<n;i++)
{
System.out.print(a[i]+",");
}
while(d<t1)
{
for(i=0;i<limit;i=i+d)
{
b[t]=a[i];
t++;
}
for(i=0;i<t;i++)
{
a[i]=b[i];
}
System.out.println("");
for(i=0;i<t;i++)
{
System.out.print(a[i]+",");
}
limit=t;t1=t;t=0;d++;
}
}
}