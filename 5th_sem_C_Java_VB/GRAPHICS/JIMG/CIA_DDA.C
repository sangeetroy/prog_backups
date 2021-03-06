#include<stdio.h>
#include<graphics.h>
#include<conio.h>
#include<math.h>

void dda(int x1,int y1,int x2, int y2 );
int points[2][1000];
int count=0;	// the total no. of coordinates in a arc
void calc_circle(int x, int y, int r);
void draw_circle();
void init_g();
int main()
{

	init_g();
	dda(0,0,90,90);
	dda(0,0,90,0);
	dda(0,0,0,90);
	dda(90,0,0,90);
	dda(0,90,90,90);
	dda(90,90,90,0);
	calc_circle(0,100,100);
	draw_circle();
	getch();
	return 0;
}
void calc_circle(int x,int y, int r)
{
	float p;
	int del;
	int x1=x;
	while(y!=x1)
	{
	del = (x+1)*(x+1)+(y+1)*(y+1)-r*r;
	if(del>0)
	{
		p=(float)(x+0.5)*(x+0.5)-(float)(y-1)*(y-1)-r*r;
		if(p<0)
		{
			points[0][count]=x+1;
			points[1][count]=y-1;
		}
		if(p>=0)
		{
			points[0][count]=x;
			points[1][count]=y-1;
		}
	}
	else if(del<0)
	{
		p=(x+1)*(x+1)-(y-0.5)*(y-0.5)-r*r;
		if(p<0)
		{
			points[0][count]=x+1;
			points[1][count]=y;
		}
		if(p>=0)
		{
			points[0][count]=x+1;
			points[1][count]=y-1;
		}
	}
	else if(del==0)
	{
	     points[0][count]=x+1;
	     points[1][count]=y-1;
	}
	x=points[0][count];
	y=points[1][count];
	count++;
	}
}
void draw_circle()
{
	int i;
	for(i=0;i<count;i++)
	{
		putpixel(320+points[0][i],240-points[1][i],10);
	}
}
void init_g()
{
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"c:\\TurboC3\\BGI");
	setbkcolor(3);
}
void dda(int x1, int y1, int x2, int y2)
{
	int dx,dy,i,x,y,length;
	float delx,dely;
	dx = x2-x1;
	dy = y2-y1;
	if(abs(dx)>=abs(dy))
		length=abs(dx);
	else
		length=abs(dy);
	delx=dx/length;
	dely=dy/length;
	i=0;
	x=x1;
	y=y1;
	while(i<=length)
	{
		putpixel((int)(320+round1(x)),(int)(240-round1(y)),4);
		x=x+delx;
		y=y+dely;
		i++;
	}
}
int round1(int x)
{
	int x_int;
	float frac;
	x_int = (int)x;
	frac = abs((x-x_int));
	if(frac>=0.5&&x>0)
		return  (x_int+1);
	else if(frac<0.5&&x>0)
		return x_int;
	if(frac>=0.5&&x<0)
		return (x_int-1);
	else if(frac<0.5&&x<0)
		return x_int;
	return 0;
}

