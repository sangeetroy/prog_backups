import java.io.*;
class elec
{
    int i,N,pre,u,prv;String name,m;double bill;
    elec()
    {
        N=0;
        name="";
        m="";
        prv=0;
        pre=0;
        u=0;
        bill=0.0;
    }
   void input()throws IOException
    {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the name of the customer");
        name=br.readLine();
        System.out.println("ENTER THE METER NUMBER");
        m=br.readLine();
        System.out.println("enter the previous meter reading");
        prv=Integer.parseInt(br.readLine());
        System.out.println("enter the present meter reading");
        pre=Integer.parseInt(br.readLine());
   
    
   //return(pre-prv);
}
double cal()
{
    u=pre-prv;
    if(u<=100)
    {
        bill=(double)u*2.25;
    }
    else if(u<=200)
    {
        bill=(100*2.25)+(u-100)*2.5;
    }
    else if(u<=300)
    {
        bill=(100*2.25)+(100*2.5)+(u-200)*2.75;
    }
    else if(u>301)
    {
        bill=(100*2.25)+(100*2.5)+(100*2.75)+(u-300)*3;
    }
    return bill;
}
void display()
{
   
    System.out.println("Name:\\t\\"+name+" "+"meter number:\\t\\"+m);
        System.out.println("previous:\\t\\"+prv+" "+"preseny reading:\\t\\"+pre);
        System.out.println("units consumed:\\t\\"+(pre-prv));
       
        System.out.println("bill:\\t"+bill);
    }
    public static void main()throws IOException

    {
        int i=0;int N;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        elec e=new elec();
        System.out.println("enter the number of customers");
        N=Integer.parseInt(br.readLine());
    for(i=0;i<N;i++)
    {
        e.input();
        e.cal();
        e.display();
    }
    }
}
       
  

        