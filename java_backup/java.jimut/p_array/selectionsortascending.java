import java.io.*;
class selectionsortascending
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int m[]=new int[10];
int i,j,t,min;
System.out.print("Enter 10 nos.:");
for(i=0;i<=9;i++)
{

}
for(i=0;i<=9;i++)
{
min=i;
for(j=i+1;j<=9;j++)
{
if(m[j]<m[min])
{
min=j;
}
}
t=m[i];
m[i]=m[min];
m[min]=t;
}
System.out.print("Nos. in ascending order are=");
for(i=0;i<=9;i++)
System.out.print(m[i]+" ");
}
}