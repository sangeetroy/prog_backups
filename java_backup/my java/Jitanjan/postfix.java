import java.io.*;
class postfix
{
public static void main(String s)
{
System.out.println("inputed expression : \n"+s);
int stack[]=new int [100];
int top=-1,i,n;
char w;
String str="";
for(i=0;i<s.length();i++)
{
w=s.charAt(i);
if(w!='+' && w!='-' && w!='*' && w!='/' && w!='^')
{
str="";
str+=w;
n=Integer.parseInt(str);
if(top==100)
System.out.println("overflow");
else
stack[++top]=n;
}
else
{
if(w=='+')
stack[top-1]=stack[top]+stack[top-1];
else
if(w=='-')
stack[top-1]=stack[top]-stack[top-1];
else
if(w=='*')
stack[top-1]=stack[top]*stack[top-1];
else
if(w=='/')
stack[top-1]=stack[top]/stack[top-1];
else
if(w=='^')
stack[top-1]=(int)Math.pow(stack[top],stack[top-1]);
top=top-1;
}
}
System.out.println("value of the expression : ");
for(i=top;i>=0;i--)
System.out.println(stack[i]);
}
}
