import java.util.*;
class discount
{
public static void main(String args[])
{
double p,d;
Scanner sc=new Scanner(System.in);
p=sc.nextDouble();
d=0;
if(p<=10000)
d=p *.10;
else
if(p<=25000)
d=p *.15;
else
if(p<=50000)
d=p *.20;
else
if(p>=50000)
d=p*.15;
System.out.println("discount"+d);
}
}