import java.util.*;
class maxmin
{
void main(int n)
{
Scanner sc=new Scanner(System.in);
int a[]=new int[n];
int i,max,min;
System.out.println("Enter elements of array");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
max=min=a[0];
for(i=0;i<n;i++)
{
if(a[i]>max)
max=a[i];
else
if(a[i]<min)
min=a[i];
}
System.out.println(max+","+min);
}
}