







package gr;
import java.io.*;
class dig_check
{
String s,w;
int c,k,i,p,m,number,count,n1,s1;
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Enter Number:");
s=br.readLine();
System.out.println("Enter checking Number:");
number=Integer.parseInt(br.readLine());
//n1=number;
//count=0;
//while(n1>0)
//{
//count++;
//n1=n1/10;
//}
s1=0;
for(i=0;i<s.length();i++)
{
w="";
w=w+s.charAt(i);
s1=s1+Integer.parseInt(w);
}
if(s1==number)
{
for(i=0;i<s.length();i++)
System.out.print(s.charAt(i)+",");
}
else
{
c=0;
w="";
//System.out.println(s+"dd");
for(i=0;i<s.length();i++)
{
//System.out.println(number);
if(s.charAt(i)=='0' && c==1)
{
System.out.print("0"+",");
c=0;
}
else
{
if(c==1)
c=0;
w=w+s.charAt(i);
k=Integer.parseInt(w);
//System.out.println(k+"dd");

if(k>number)
{
p=k/10;
//if((number-(p+(k%10)))>(number/2))
//{
System.out.print(p+",");
//number=number-p;
//w=w+s.charAt(i);
//}
//else
//{
//System.out.print(p+",");
System.out.print(k%10+",");
number=number-(p+(k%10));
w="";
//}

//System.out.println(k);
//number=number-(p+(k%10));
c=1;
}
else
if(k==number)
System.out.print(k);
}
}
}
}
}


