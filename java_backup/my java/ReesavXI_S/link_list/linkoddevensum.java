package link_list;
import java.io.*;
class linkoddevensum
{
    DataInputStream in=new DataInputStream(System.in);
    int k;
    list l1=new list();
    list l=new list();
    void input()throws IOException
    {
        String y="y";
        l1=l;
        while(y.equalsIgnoreCase("y")==true)
        {
            l1.insert();
            System.out.print("Another ");
            y=in.readLine();
            if(y.equalsIgnoreCase("y")==true)
            {
                l1.next=new list();
                l1=l1.next;
            }
        }
        l1.next=null;
    }
    void sum()
    {
        l1=l;
        int cr=0,odd_sum=0,even_sum=0;
        while(l1!=null)
        {
            cr=cr+1;
            if(cr%2==1)
            odd_sum=odd_sum+l1.k;
            else
            even_sum=even_sum+l1.k;
            l1=l1.next;
        }
        System.out.println("Sum of odd numbers"+odd_sum);
        System.out.println("Sum of even numbers"+even_sum);
    }
    void main()throws IOException
    {
        input();
        sum();
    }
}