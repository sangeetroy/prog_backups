package finalprojectwork;


import java.io.*;

class krishnamurtinospecial
{
public static void main(String[]args)throws IOException

{

InputStreamReader ab=new InputStreamReader(System.in);

BufferedReader cd=new BufferedReader(ab);

int m,n,p,d,q=0,s=0,f=1,i;

System.out.println("Enter any no:");

n=Integer.parseInt(cd.readLine());

m=n;

while(m!=0)

{

q=m/10;

p=q*10;

d=m-p;

System.out.println("The digit is:"+d);

for(i=1;i<=d;i++)

f=f*i;

s=s+f;

f=1;

m=m/10;

}

if(s==n)

{

System.out.println("The no"+" "+s+"is a special no");

}

else

{

System.out.println("The no"+" "+s+" "+"is not a special no");

}

}
}