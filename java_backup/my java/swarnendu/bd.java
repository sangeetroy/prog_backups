import java.util.*;
class bd
{
public static void main(String args[])
{                                     
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter 2 no.s");
a=sc.nextInt();
b=sc.nextInt();
if(a>b)
System.out.println("first number is greater");
else 
if(a<b)
System.out.println("second number is greater");
else
System.out.println("both the numbers are equal");
}
}