
import java.io.*;
class daydiff
{
int d,y,m,d1,y1,m1,i,j,k;
long t,t1;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Give date:");
d=Integer.parseInt(br.readLine());
System.out.println("Give month:");
m=Integer.parseInt(br.readLine());
System.out.println("Give year:");
y=Integer.parseInt(br.readLine());
System.out.println("Give last date:");
d1=Integer.parseInt(br.readLine());
System.out.println("Give last month:");
m1=Integer.parseInt(br.readLine());
System.out.println("Give last year:");
y1=Integer.parseInt(br.readLine());
if(y<2000)
k=1900;
else
k=2000;
t=daycal(k,y,m,d);
t1=daycal(k,y1,m1,d1);
System.out.println("Total Difference:"+(t1-t));
}
long daycal(int k,int x,int y, int z)
{
long s=0;
for(i=k;i<x;i++)
{
if(i%4==0 || i%400==0)
s=s+366;
else
s=s+365;
}
for(i=1;i<y;i++)
{
if(i==1 || i==3||i==5||i==7||i==8||i==10||i==12)
s=s+31;
else
if(i==4||i==6||i==9||i==11)
s=s+30;
else
if(i==2)
{
if(y%4==0 || y%400==0)
s=s+29;
else
s=s+28;
}
}
s=s+z;
return s;
}
}

