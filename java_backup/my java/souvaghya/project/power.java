package project;

import java.io.*;
class power
{
    int a,b,k;
    power()
    {
    }
  
    power(int x,int y)
    {
        a=x;
        b=y;
        k=cal(x,y);
        System.out.println(k);
    }
    int cal(int m,int n)
    {
        int i,s;
        s=1;
        for(i=1;i<=n;i++)
        s=s*m;
        return s;
    }
    public  void main1()throws IOException
    {
        
        int l,k;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
       
        l=Integer.parseInt(br.readLine());
        k=Integer.parseInt(br.readLine());
        power a1=new power(l,k);
          
          
           
        }
    }


           