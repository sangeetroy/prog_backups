public class p5
{
public static void main(String args[])
{
int i,j,k;
for(i=1;i<=5;i++)
{
for(j=1;j<=(5-i);j++)
System.out.print(j);
for(j=1;j<=(5-(5-i));j++)
System.out.print("*");
System.out.println(" ");
}
}
}
