import java.io.*;
class area
{
int a,br,r,g,e,i,j;
double b,h,s;
void area(int x,int y)
{
a=x;
br=y;
g=a*br;
System.out.println("Area of rectangle"+g);
}
void area(int z)
{
r=z;
e=22/7*(r*r);
System.out.println("Area of circle"+e);
}
void area(double m,double n)
{
b=m;
h=n;
s=(b*h)/2;
System.out.println("Area of triangle"+s);
}
void area(double k)
{
s=k;
h=s*s;
System.out.println("Area of square"+h);
}
public static void main(String args[])throws IOException
{
int a1,br1,r1;
double b1,h1,s1;
BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
a1=Integer.parseInt(bfr.readLine());
br1=Integer.parseInt(bfr.readLine());
r1=Integer.parseInt(bfr.readLine());
b1=Double.parseDouble(bfr.readLine());
h1=Double.parseDouble(bfr.readLine());
s1=Double.parseDouble(bfr.readLine());
area s=new area();
area s0=new area();
area s2=new area();
area s3=new area();
s.area(a1,br1);
s0.area(r1);
s2.area(s1);
s3.area(b1,h1);
}
}