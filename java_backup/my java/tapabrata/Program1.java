import java.io.*;
class Program1
{
BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
String str="",str1="",str2="";
int h=0,t=0,u=0,i=0,n;
public void takeNumber()throws IOException
{
System.out.println(" Enter the number ");
n=Integer.parseInt(br.readLine());
while(true)
{
if(i==0)
u=n%10;
else if(i==1)
t=n%10;
else if(i==2)
h=n%10;
i++;
n=n/10;
if(n==0)
break;
}
if(h!=0)
str=word1(h)+"hundred";
if(t>1)
str1=word2(t);
if(t==1)
str2=word3(u);
else
str2=word1(u);
if(!str1.equals("")||!str2.equals(""))
str=str+"and";
if(!str1.equals(""))
str=str+str1+"";
if(!str2.equals(""))
str=str+str2;
}
String word1(int x)
{
String s="";
switch(x)
{case 1:
s="one";
break;
case 2:
s="two";
break;
case 3:
s="three";
break;
case 4:
s="four";
break;
case 5:
s="five";
break;
case 6:
s="six";
break;
case 7:
s="seven";
break;
case 8:
s="eight";
break;
case 9:
s="nine";
break;
}
return s;
}
String word2(int x)
{
String s="";
switch(x)
{
case 2:
s="twenty";
break;
case 3:
s="thirty";
break;
case 4:
s="forty";
break;
case 5:
s="fifty";
break;
case 6:
s="sixty";
break;
case 7:
s="seventy";
break;
case 8:
s="eighty";
break;
case 9:
s="ninety";
break;
}
return s;
}
String word3(int x)
{
String s="";
switch(x)
{case 0:
s="ten";
break;
case 1:
s="eleven";
break;
case 2:
s="twelve";
break;
case 3:
s="thirteen";
break;
case 4:
s="fourteen";
break;
case 5:
s="fifteen";
break;
case 6:
s="sixteen";
break;
case 7:
s="seventeen";
break;
case 8:
s="eighteen";
break;
case 9:
s="nineteen";
break;
}
return s;
}
void main(String args[])throws IOException
{
Program1 ob=new Program1();
ob.takeNumber();
}}




