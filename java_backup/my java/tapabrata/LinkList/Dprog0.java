package LinkList;


import java.util.*;
class Dprog0
{
public static void main()
{
int ans=1;
int num=0;
Scanner ob=new Scanner(System.in);
DlinkedList0 ob1=new DlinkedList0();
do
{
System.out.println("enter the number : ");
num=ob.nextInt();
System.out.println("1 to insert from first 2 to insert from last ");
ans=ob.nextInt();
if(ans==1)
ob1.Insert1(num);
else
if(ans==2)
ob1.Insert2(num);
else
System.out.println(" start fresh ");
System.out.println(" 1 to continue 0 to exit\n");
ans=ob.nextInt();
}while(ans==1);
do
{
System.out.println(" 1 to display from first 2 to display from last 3 to calculate vand display the average of highest and lowest node value 4 to exit ");
ans=ob.nextInt();
if(ans==1)
ob1.display1();
else
if(ans==2)
ob1.display2();
else
if(ans==3)
ob1.calc();
else
System.exit(0);
}while(ans==1 || ans==2 || ans==3);
}
}
