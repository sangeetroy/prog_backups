package project;

import java.io.*;
class lcm
{
    int a,b;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    lcm() throws IOException
    {
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        cal(a,b);
    }
    void cal(int x,int y)
    {
        int k;
        k=1;
        while((x*k)%y!=0)
        k++;
        System.out.println("Lcm:"+(x*k));
        
    }
    public  void main1()throws IOException
    {
        lcm a=new lcm();
        
    }
}