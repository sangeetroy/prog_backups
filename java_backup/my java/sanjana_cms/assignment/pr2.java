package assignment;

import java.io.*;
class pr2
{
int n;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
void input()throws IOException
{
System.out.println("Enter a number");
    n=Integer.parseInt (br.readLine());
    if(palincheck(n)==1 && primecheck(n)==1)
    System.out.println("Prime and palindrom");
    else
    System.out.println("either Prime or  palindrom or not");

}
int palincheck (int i)
{
    int j,s;
s=0;
j=i;
while(j>0)
{
    s=(s*10)+j%10;
    j=j/10;
}
if(i==s)
return 1;
else
return 0;
}
int primecheck (int i)
{
    int j,f;
f=0;
for (j=2;j<i/2;j++)
{if(i%j==0)
{
f=1;
break;
}}
if (f==0)
return 1;
else
return 0;
}
public static void main() throws IOException
{
    pr2 p=new pr2();
    p.input();
}
}



