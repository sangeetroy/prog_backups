package link.dbllist;

//EXAMPLE OF double LINKED LIST(INSERT AND DISPLAY)
import java.io.*;
class dbllink2
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
class dbllink
{
int x;
void input(int k)throws IOException
{
x=k;
}
void disp()
{
System.out.println(x);
}
dbllink next;
dbllink prev;
}
int m,n;
 String y;
 dbllink s,s1;
 dbllink2()
 {
        y="YES";
         s=new dbllink();
         s1=new dbllink();
        //dbllink s2=new lnk();
        //dbllink s3=new lnk();
        //dbllink s4=new lnk();
        //dbllink s5=new lnk();
        //dbllink s6=new lnk();
        s1=s;
        int c=0;
        s1.next=null;
        s1.prev=null;
    }
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     void insert()throws IOException
     {
         int k,d;
         System.out.println("Enter no:");
         k=Integer.parseInt(br.readLine());
        while(k>0)
        {
            d=k%10;
            s.input(d);
            
            if(k/10>0)
            {
            s.next=new dbllink();
                s.next.prev=s;
                s=s.next;
            }
                k=k/10;
            
        }
        s.next=null;
        display();
        
    }
        //s.l=0;
        void display()
        {
        s=s1;
        System.out.println("Display the list next-> ");
        if(s.next==null)
            s.disp();
        else
        { 
            while(s.next!=null)
            {
                s.disp();
                if(s.next.next==null)
                    s.next.disp();
                s=s.next;
            }
        }
        System.out.println("Display the list previous-> ");
        if(s.prev==null)
            s.disp();
        else
        { 
            while(s.prev!=null)
            {
                s.disp();
                if(s.prev.prev==null)
                    s.prev.disp();
                s=s.prev;
            }
        }
    }
}