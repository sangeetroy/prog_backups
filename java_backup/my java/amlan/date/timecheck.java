package date;

import java.io.*;
class timecheck
{public static void main()throws IOException
{long s=0;
int yy,m,d,d1,yy1,m1,s1,hh,mm,hh1,mm1,dd;
long i,k,k1,t,t1,t2,t3;

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter first date");
System.out.println("Enter day");
d=Integer.parseInt(br.readLine());
System.out.println("Enter month");
m=Integer.parseInt(br.readLine());
System.out.println("Enter year");
yy=Integer.parseInt(br.readLine());
System.out.println("Enter second date");
System.out.println("Enter day");
d1=Integer.parseInt(br.readLine());
System.out.println("Enter month");
m1=Integer.parseInt(br.readLine());
System.out.println("Enter year");
yy1=Integer.parseInt(br.readLine());
System.out.println("Enter Login Hour");
hh=Integer.parseInt(br.readLine());
System.out.println("Enter Login Minute");
mm=Integer.parseInt(br.readLine());
System.out.println("Enter Logout Hour");
hh1=Integer.parseInt(br.readLine());
System.out.println("Enter Logout Minute");
mm1=Integer.parseInt(br.readLine());
s=0;
for(i=1900;i<yy;i++)
{if(yy%4==0||yy%400==0)
s=s+366;
else
s=s+365;
}
for(i=1;i<m;i++)
{
if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
s=s+31;
else
if(i==4||i==6||i==9||i==11)
s=s+30;
else
if(i==2)
{
if(yy%4==0||yy%400==0)
s=s+29;
else
s=s+28;
}
}
s=s+d;
s1=0;
for(i=1900;i<yy1;i++)
{if(yy1%4==0||yy1%400==0)
s1=s1+366;
else
s1=s1+365;
}
for(i=1;i<m1;i++)
{
if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
s1=s1+31;
else
if(i==4||i==6||i==9||i==11)
s1=s1+30;
else
if(i==2)
{
if(yy1%4==0||yy1%400==0)
s1=s1+29;
else
s1=s1+28;
}
}
s1=s1+d1;
dd=(int)(s1-s);
if(dd<=0)
{
if(hh1<hh)
{
System.out.println("Error... Logout date must be greater than Login Date.....");
System.exit(0);
}
}
if(hh==hh1)
{
if(mm1<mm)
{
System.out.println("Error... Logout date must be greater than Login Date.....");
System.exit(0);
}
}
hh1=hh1+(dd*24);
if(mm1<mm)
{
mm1=mm1+60;
hh1=hh1-1;
}
System.out.println("Total Time Difference ::: "+(hh1-hh)+":"+(mm1-mm));
}
}