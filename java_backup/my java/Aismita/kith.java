import java.io.*;
class kith
{
    public static void main(int n)throws IOException
    {
      BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
      int a[]=new int[2*n];
      int s=0,r=0,d=n;int c=0;int fl=0;
      while(n!=0)
      {
          int p=n%10;
         // a[c]=p;
          c++;
          //a[r]=p;
          //r++;
          n/=10;
        }
        int c1=c;n=d;
        while(c1>0)
        {
            int p=n%10;
            a[c1-1]=p;
            c1--;
            n/=10;
        }
        int c2=c;
        
            
        for(int i=c2;i<2*d;i++)
        {
        for(int j=1;j<=c2;j++)
            a[i]+=a[i-j];//+a[i];
        if(a[i]>d)
        {
           // fl=0;
            break;
        }
        else
        if(a[i]==d)
        {
            fl=1;
            break;
        }
    }
    if(fl==0)
    System.out.println("not kith");
    else
    if(fl==1)
    System.out.println("kith");
}
}
        
        