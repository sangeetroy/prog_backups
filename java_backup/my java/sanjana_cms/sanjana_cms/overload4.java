package sanjana_cms;

class overload4  
{
int a,b;
double c,d;
string e,f;
void sum(int x, int y)
{
int z;
a=x;
b=y;
z=a+b;
System.out.println (z);
}
void sum(double x, double y)
{
double z;
c=x;
d=y;
z=c+d; 
System.out.println (z);
}
void sum (string x, string y)
{
string z;
e=x;
f=y;
z=e+f;
System.out.println(z);
}
}