import java.io.*;
public class circular
{
    int a[],f=0,r=0,b,cc=0;
    void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ch;
        System.out.println("Enter limit");
        b=Integer.parseInt(br.readLine());
        a=new int[b];
        System.out.println("press 1 to enter element");
        System.out.println("press 2 to delete element");
        System.out.println("press 3 to display element");
        System.out.println("press 4 to stop");
        while(true)
        {
            System.out.println("Enter your choice");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1: 
                insert();
                break;
                case 2: 
                delete();
                break;
                case 3: 
                display();
                break;
                case 4:
                System.exit(0);
                default:
                System.out.println("Error");
            }
        }
        
    }
    void insert()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int e;
        System.out.println("Enter data");
        e=Integer.parseInt(br.readLine());
        if(cc==b)
        {
            System.out.println("quene is full");
            return;
        }
        else if(r<b-1)
        {
            cc++;
            a[r++]=e;
        }
        else if(f>0 && r==b-1)
        {
            cc++;
            r=0;
            a[r]=e;
        }
        else if(f>0 && r>=0)
        {
            cc++;
            a[r++]=e;
        }
    }
    void delete()
    {
        if(f==r)
        {
            System.out.println("quene is empty");
            return;
        }
        else
        {
            cc--;
            f++;
        }
    }
    void display()
    {
        int k;
       if(r<b-1)
       {
          for(k=f;k<r;k++)
          {
               System.out.println(+a[k]);          
          }
    }
    else if(r>=0 && r<=b-1)
    {
         for(k=f;k<r;k++)
         {
               System.out.println(+a[k]);          
         }
         for(k=0;k<f;k++)
         {
               System.out.println(+a[k]);          
         }
    }
   }
}  
        
            
        
        