package PRANTIK;

import java.io.*;
class maxminarray
{
public static void main(String args[])throws IOException
{
int i,s,n,max,min;
int a[]=new int[100];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Give n:");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
max=min=a[0];
for(i=0;i<n;i++)
{
if(a[i]>max)
max=a[i];
else
if(a[i]<min)
min=a[i];    
}
System.out.println(max+","+min);
}
}         