class keith_num
{
public static void main(int n)
{
int a[]=new int [10000];
int l,m,k,s=0,t=0,i,f=0;
System.out.println("List of keith number(s) between 101 to "+n+" is/are :::");
for(l=101;l<=n;l++)
{
m=l;
while(m>0)
{
k=m%10;
s=(s*10)+k;
m=m/10;
}
while(s>0)
{
k=s%10;
a[t++]=k;
s=s/10;
}
for(i=1;i<t;i++)
{
a[t]=a[i]+a[i+1]+a[i+2];
System.out.println(a[t]);
if(a[t]>=l)
{
if(a[t++]==l)
f=1;
break;
}
}
if(f==1)
System.out.println(l);
}
}
}
