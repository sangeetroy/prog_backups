public class p3
{
public static void main(String args[])
{
int l,i,j,k,sp;
l=5;sp=0;
for(i=1;i<=5;i++)
{
for(j=1;j<=l;j++)
System.out.print(j);
for(k=1;k<=sp;k++)
System.out.print(" ");
if(i==1)
j=j-2;
else
j=j-1;
while(j>=1)
{
System.out.print(j);
j--;
}
l=l-1;
sp=sp+2;
System.out.println(" ");
}
}
}
