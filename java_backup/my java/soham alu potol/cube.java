class cube//s=1+8+27+64............n 
{
public static void main(int n)
{
int i,s=0;
for(i=1;i<=n;i++)
{
s=s+(i*i*i);

}
System.out.print(s);
}
}