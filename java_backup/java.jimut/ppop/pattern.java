import java.io.*;
class pattern
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int i,j,k,l;
String n;
System.out.println("Enter any string:");
n=cd.readLine();
l=n.length();
for(i=l-1;i>=0;i--)
{
for(j=0;j<=i;j++)
{
System.out.print(n.charAt(j));
}
for(k=0;k<i;k++)
{
System.out.print(n.charAt(k));
}
System.out.println();
}
}
}