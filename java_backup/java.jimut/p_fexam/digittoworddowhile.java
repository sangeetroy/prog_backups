import java.io.*;
class digittoworddowhile
{
void convert(int number)
{
int digit,n;
String conversion="";
n=number;
System.out.println("You have entered number="+number);
do
{
digit=n%10;
conversion=word(digit)+""+conversion;
n=n/10;
}
while(n!=0);
System.out.println("The number in words is="+conversion);
}
public static String word(int ch)
{
String x="";
switch(ch)
{
case 0:
x="zero";
break;
case 1:
x="one";
break;
case 2:
x="two";
break;
case 3:
x="three";
break;
case 4:
x="four";
break;
case 5:
x="five";
break;
case 6:
x="six";
break;
case 7:
x="seven";
break;
case 8:
x="eight";
break;
case 9:
x="nine";
break;
}
return x;
}
}