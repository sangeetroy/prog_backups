import java.io.*;
class nearest_prime
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,s,f,i,j,n1,k,x;
s=0;
f=0;
System.out.println("ENTER NUMBER");
n=Integer.parseInt(br.readLine());
n1=n;
while(n1>0)
{
k=n1%10;
s=(s*10)+k;
n1=n1/10;
}
while(s>0)
{
x=s%10;
if(x==9)
{
System.out.print("0");
}
else
if(x%2==0)
{
for(i=x;i<9;i++)
{
for(j=2;j<i;j++)
{
if(i%j==0)
{
f=1;
}
else
{
f=0;
}
}
}
if(f==1)
{
System.out.print(i);
}
}
else
if(x%2!=0)
{
System.out.print(x+1);
}
f=0;
s=s/10;
}
}
}

