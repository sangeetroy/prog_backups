import java.io.*;
class test
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char a[][]=new char[5][5];
int k,i,j,p;
public void main1()throws IOException
{

System.out.println("ENTER NUMBER");
int n=Integer.parseInt(br.readLine());
int m = n;
while(m>0)
{
k=m%10;
switch(k)
{
case 0:
p0();
break;
case 1:
p1();
break;
case 2:
p2();
break;
case 3:
p3();
break;
case 4:
p4();
break;
case 5:
p5();
break;
case 6:
p6();
break;
case 7:
p7();
break;
case 8:
p8();
break;
case 9:
p9();
break;
default:
System.out.println("ERROR");
}
m=m/10;
}
}
void zero()
{
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
a[i][j]='0';
}
}
}
void print()
{
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
if(a[i][j]!='0')
System.out.print(a[i][j]);
}
System.out.println();
}
}
void p0()
{
a[0][0]='-';
a[0][1]='-';
a[0][2]='-';
a[0][3]='-';
a[1][0]='|';
a[1][3]='|';
a[2][0]='|';
a[2][3]='|';
a[3][0]='|';
a[3][3]='|';
a[4][0]='-';
a[4][1]='-';
a[4][2]='-';
a[4][3]='-';
print();
zero();
}
void p1()
{
a[0][2]='|';
a[1][2]='|';
a[2][2]='|';
a[3][2]='|';
a[4][2]='|';
print();
zero();
}
void p2()
{
a[0][0]='-';
a[0][1]='-';
a[0][2]='-';
a[0][3]='-';
a[0][4]='-';
a[1][4]='|';
a[2][0]='-';
a[2][1]='-';
a[2][2]='-';
a[2][3]='-';
a[2][4]='-';
a[3][0]='|';
a[4][0]='-';
a[4][1]='-';
a[4][2]='-';
a[4][3]='-';
a[4][4]='-';
print();
zero();
}
void p3()
{
a[0][0]='-';
a[0][1]='-';
a[0][2]='-';
a[0][3]='-';
a[0][4]='-';
a[1][4]='|';
a[2][0]='-';
a[2][1]='-';
a[2][2]='-';
a[2][3]='-';
a[2][4]='-';
a[3][4]='|';
a[4][0]='-';
a[4][1]='-';
a[4][2]='-';
a[4][3]='-';
a[4][4]='-';
print();
zero();
}
void p4()
{
a[0][0]='|';
a[0][4]='|';
a[1][0]='|';
a[1][4]='|';
a[2][0]='|';
a[2][1]='_';
a[2][2]='_';
a[2][3]='_';
a[2][4]='|';
a[3][4]='|';
a[4][4]='|';
print();
zero();
}
void p5()
{
a[0][0]='-';
a[0][1]='-';
a[0][2]='-';
a[0][3]='-';
a[0][4]='-';
a[1][0]='|';
a[2][0]='-';
a[2][1]='-';
a[2][2]='-';
a[2][3]='-';
a[2][4]='-';
a[3][4]='|';
a[4][0]='-';
a[4][1]='-';
a[4][2]='-';
a[4][3]='-';
a[4][4]='-';
print();
zero();
}
void p6()
{
a[0][0]='-';
a[0][1]='-';
a[0][2]='-';
a[0][3]='-';
a[1][0]='|';
a[2][0]='-';
a[2][1]='-';
a[2][2]='-';
a[2][3]='-';
a[3][0]='|';
a[3][3]='|';
a[4][0]='-';
a[4][1]='-';
a[4][2]='-';
a[4][3]='-';
print();
zero();
}
void p7()
{
a[0][0]='-';
a[0][1]='-';
a[0][2]='-';
a[0][3]='-';
a[0][4]='/';
a[1][3]='/';
a[2][2]='/';
a[3][1]='/';
a[4][0]='/';
print();
zero();
}
void p8()
{
a[0][0]='-';
a[0][1]='-';
a[0][2]='-';
a[0][3]='-';
a[1][0]='|';
a[1][3]='|';
a[2][0]='|';
a[2][1]='-';
a[2][2]='-';
a[2][3]='|';
a[3][0]='|';
a[3][3]='|';
a[4][0]='-';
a[4][1]='-';
a[4][2]='-';
a[4][3]='-';
print();
zero();
}
void p9()
{
a[0][0]='|';
a[0][1]='-';
a[0][2]='-';
a[0][3]='|';
a[1][0]='|';
a[1][3]='|';
a[2][0]='|';
a[2][1]='-';
a[2][2]='-';
a[2][3]='|';
a[3][3]='|';
a[4][0]='-';
a[4][1]='-';
a[4][2]='-';
a[4][3]='|';
print();
zero();
}
}
