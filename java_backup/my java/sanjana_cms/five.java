import java.io.*;
class five
{
public static void main (String args[]) throws IOException
{
String s, w, w1;
int i,j;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter String");
s=br.readLine();
w=w1="";
s=s+" ";
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
if((int)w.charAt(0)>=97&&(int)w.charAt(0)<=122)
w1=w1+(char)(((int)w.charAt(0))-32);
else
w1=w1+w.charAt(0);
for(j=1;j<w.length();j++)
{
if((int)w.charAt(j)>=97&&(int)w.charAt(j)<=122)
w1=w1+w.charAt(j);
}
w1=w1+" ";
w="";
}
else
w=w+s.charAt(i);
}
System.out.println(w1);
}
}





