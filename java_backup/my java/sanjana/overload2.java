 

class overload2
{
int a, b,c1;
double c,d,f;
char e;
String g, h;
void area (int x, int y)
{
int z;
a=x;
b=y;
z=a*b;
System.out.println("Area of rectangle:"+z);
}
void area (double x)
{
double z;
c=x;
z=Math.pow(a,2);
System.out.println("Area of square:"+z);
}
void area (int x)
{
int z;
c1=x;
z=22/7*e*e;
System.out.println("Area of circle:"+z);
}
void area (double g, double h)
{
double z;
c=g;
d=h;
f=1/2*g*h;
System.out.println("Area of triangle:"+f);
}
}
