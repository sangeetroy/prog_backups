package link.link_stack_queue;

import java.io.*;
class queue1
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
    class que
    {
        int x;
        void input()throws IOException
        {
           x=Integer.parseInt(br.readLine());
        }
        void disp()
        {
            System.out.println(x);
        }
        que next;
    }
    que front,rear;//top1;
    queue1()
    {
      //top=new stack();
      front=null;
      rear=null;
      //top1=top;
      
    }
    que insert(que s)throws IOException
    {
        if (s==null)
        {
        s=new que();
        s.input();
        s.next=null;
        
    }
    else
    {
      que p=new que();
      
      p=s;
      while(p.next!=null)
        p=p.next;
        p.next=new que();
        p=p.next;
        p.input();
        p.next=null;
        
    }       
    //s.disp();    
    return s;
    }
    que del(que s,que r)
    {
        if(s==null)
       {
           System.out.println("Nothing to delete....");
           return s;
        }
        else
        {
           System.out.println("Deleted element...");
           s.disp();
           s=r.next;
           rear=rear.next;
           return s;
        }
        
    }
    void display(que s,que r)
    {
       if(s==null)
       {
           System.out.println("Nothing to display....");
           return;
        }
        que p,p1;
       p=new que();
       p1=new que();
        p=s;
        p1=r;
        p.disp();
        p1=p1.next;
        while(p1!=null)
        {
            p1.disp();
            p1=p1.next;
        }
    }
    
     void impl()throws IOException
    {
        int x;
        do
        {
            System.out.println("Press 1 for Push:");
            System.out.println("Press 2 for Pop:");
            System.out.println("Press 3 for Display:");
            System.out.println("Press 4 for Exit:");
            System.out.println("Enter choice:");
            x=Integer.parseInt(br.readLine());
            switch(x)
            {
                case 1:if(front==null)
                        {
                        front= insert(front);
                        rear=new que();
                        rear.x=front.x;
                        rear.next=null;
                    }
                       else
                       {
                        rear= insert(rear);   
                    }  
                       
                        break;
                case 2:front= del(front,rear);
                        break;
                case 3:display(front,rear);
                       break;
                case 4: System.exit(0);
                        break;
            }
        }while(true);
    }
}
