import java . io.*;
class aascendingorder
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int m[] = new int [10];
int i,j,t,min;
System.out.println("ENTER 10 numbers::");
for(i=0;i<=9;i++)
{
m[i]=Integer.parseInt(cd.readLine());
}
for(i=0;i<=9;i++)
{
min = i;
for(j=i+1;j<=9;j++)
{
if(m[j]<m[min])
{
min = j;
}

t = m[i];
m[i]=m[min];
m[min]=t;

System.out.println(t);
}
}
}
}