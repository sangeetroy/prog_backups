public class lucky
{
public void run(int n)
{

int h=0;
int a[];
a=new int[n];
for(int i=1;i<=n;i++)
{
a[i-1]=i;
}

for(int i=2;i>0;i++)
{
if(a.length<=i)
{
break;
}
int p=a.length/i;
p++;
int b[]=new int[p];
b[0]=a[0];
h=1;
for(int j=1;j<a.length;j++)
{
if(j%i==0)
{
b[h]=a[j];
h++;
}
}
a=new int[b.length];
for(int k=0;k<b.length;k++)
{
a[k]=b[k];
}
}

for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}

