import java.io.*;
class replacingword
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n,m="",p="";
char ch;
int i,l;
System.out.println("Enter nay string:");
n=cd.readLine();
l=n.length();
for(i=0;i<=l-1;i++)
{
ch=n.charAt(i);
if(m.compareTo("Blue")==0)
p=p+" "+"Red";
else
{
p=p+" "+m;
m="";
}
}
System.out.println(p);
}
}