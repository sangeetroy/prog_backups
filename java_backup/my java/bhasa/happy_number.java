import java.io.*;
class happy_number
{
public static void main(String args[])throws IOException
{
int n,k,p,s;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER NUMBER");
n=Integer.parseInt(br.readLine());
while(n>=10)
{
k=n;
s=0;
while(k>0)
{
p=k%10;
s=s+(p*p);
k=k/10;
}
n=s;
}
if(n==1)
{
System.out.print("it is a happy number");
}
else
{
System.out.print("it is not a happy number");
}
}
}