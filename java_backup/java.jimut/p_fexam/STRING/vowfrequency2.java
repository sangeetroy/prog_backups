package STRING;
import java.io.*;
class vowfrequency2
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n,m="";
int i,l,j,k,vow=0;
char ch,ch1;
System.out.println("Enter any sentence:");
n=cd.readLine();
l=n.length();
for(i=0;i<=l;i++)
{
ch=n.charAt(i);
if(ch!=' ' && ch!='.')
{
m=m+ch;
}
else if(ch!=' ' || ch!='.')
{
k=m.length();
for(j=0;j<=k-1;j++)
{
ch1=m.charAt(j);
if(ch1=='a'||ch1=='A'||ch1=='e'||ch1=='E'||ch1=='i'||ch1=='I'||ch1=='o'||ch1=='O'||ch1=='u'||ch1=='U')
vow=vow+1;
}
System.out.println("No. of vowels in word"+" " +m+" "+"is:"+" "+vow);
m="";
vow=0;
}
}
}
}