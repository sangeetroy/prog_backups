import java.util.*;
class pattern
{
public static void main(String args[])
{
int sp=10,i,j,k;
Scanner sc = new Scanner(System.in);
for(i=1;i<=5;i++)
{
for(k=1;k<=sp;k++)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
System.out.print("*"+" "+" ");
System.out.println("");
sp--;
}
sp=sp+1;
for(i=1;i<=4;i++)
{
for(k=1;k<=sp+i;k++)
{
System.out.print(" ");
}
for(j=4;j>=i;j--)
{
System.out.print("*"+" "+" ");
}
System.out.println("");
//sp++;
}
}
}