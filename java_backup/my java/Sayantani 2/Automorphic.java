class Automorphic
{
  public static void main (int n)
{
  int m,a,f,k,s1,k1,s,s2;
  m=n*n;
  f=0;
  s=0;
  while(m>0)
  {
      k=m%10;
      s=(s*10)+k;
      s1=0;
      s2=s;
      while(s2>0)
      {
          k1=s2%10;
          s1=(s1*10)+k1;
          s2=s2/10;
        }
        if(s1==n)
        {
            f=1;
            break;
        }
        m=m/10;
    }
    if(f==1)
    System.out.print("automorphic");
    else
    System.out.print("Not automorphic");
}
}
