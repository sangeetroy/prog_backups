class sumfactorial
{
  public static void main (int a)
{
  
  int i,j,s,f;
  s=0;
  for (i=1;i<=a;i++)
{
  f=1;
  for (j=1;j<=i;j++)
  f=f*j;
  s=j+f;
}
System.out.println(s);
}
}  