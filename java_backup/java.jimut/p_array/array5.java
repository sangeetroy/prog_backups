import java.io.*;
class array5
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferdedReader cd=new BufferedReader(ab);
int a[]=new int[10];
String n[]=new String[10];
System.out.println("Enter 10 names with their tel nos");
for(i=0;i<10;i++)
{
long b[i]=Long.parseLong(cd.readLine());
n[i]=cd.readLine();
System.out.println(n[i]+""+a[i]);
}
}
}
