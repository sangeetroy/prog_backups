package ifcondition;

import java.io.*;
class selection
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int[6];
int i,j,pos,t;
for( i=0;i<6;i++)
a[i]=Integer.parseInt(br.readLine());
for( i=0;i<6-1;i++)
{
 pos=i;
for(j=i+1;j<6;j++)
if(a[j]<a[pos])
 pos=j;
t=a[i];
a[i]=a[pos];
a[pos]=t;
}
for(i=0;i<6;i++)
System.out.print(a[i]);
}
}