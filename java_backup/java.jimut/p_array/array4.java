import java.io.*;
class array4
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int i,c=1,a,j;
int m[]=new int[20];
System.out.println("Enter 20 nos.");
for(i=0;i<20;i++)
{
m[i]=Integer.parseInt(cd.readLine());
}
for(j=2;j<a;j++)
{
if(a%j==0)
c=0;
}
if(c==i)
System.out.println(m);
c=1;
}
}