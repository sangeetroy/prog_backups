import java.io.*;
class bubblesorting_array
{
public static void main(String args[])throws IOException
{
int a[]=new int[50];
int n,i,j,t;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Give Term:");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}