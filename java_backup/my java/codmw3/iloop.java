class iloop
{
    public static void main(int n)
    {
        int k=9,p;
        for(int i=1;i<=n;i++)
        {
          p=k;
          for(int j=1;j<=i;j++)
           {
            System.out.print(p);
            p=p+2;
           
            }
            k=k-2;
            System.out.println();
        }
    }
              
              
}   
              


