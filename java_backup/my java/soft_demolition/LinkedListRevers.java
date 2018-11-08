//linked list reversal
import java.util.*;
class Node
{
    private String data;
    private Node link;//address of next node; self-referrential data structure
    public Node()
    {
        data="";
        link=null;        
    }

    public Node(String d, Node l)
    {
        data=d;
        link=l;
    }

    public void setLink(Node l)
    {
        link=l;
    }

    public void setData(String d)
    {
        data=d;
    }

    public String getData()
    {
        return data;
    }

    public Node getLink()
    {
        return link;
    }
}

class SingleLinkedList
{
    private Node start;
    public SingleLinkedList()
    {
        start=null;
    }

    public void insert(String d)
    {
        Node temp=new Node(d, null);
        if(start==null)//no existing node
            start=temp;
        else 
        {
            Node t=start;
            while(t.getLink()!=null)//traversing till the last node
                t=t.getLink();
            t.setLink(temp);
        }
    }
    
    public void reverse()
    {
        if(start==null || start.getLink()==null) System.out.println("Invalid list: Reversal of Linked list not possible. At least two nodes required");
        Node t1=start, t2=null;//left and right pointers      
        Node current, tNode;//for swapping and traversing respectively
        for(int i=1; i<=countNodes()/2; i++)
        {
            current=tNode=t1;
            while(tNode!=t2)
            {
                current=tNode;
                tNode=tNode.getLink();
            }
            t2=current;
            swap(t1, t2);
            t1=t1.getLink();
        }
    }
    
    public void swap(Node a, Node b)
    {
        String t=a.getData();
        a.setData(b.getData());
        b.setData(t);        
    }

    public void display()
    {
        Node t=start;
        System.out.print("| ");
        while(t!=null)
        {
            System.out.print(t.getData() + " |  ");
            t=t.getLink();
        }
        System.out.println();
    }

    public int countNodes()
    {
        Node t=start;
        int c=0;
        while(t!=null)
        {
            t=t.getLink();
            c++;
        }
        return c;
    }
}

public class LinkedListRevers
{
    public static void main(String args[])
    {
        SingleLinkedList sls=new SingleLinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Start entering elements for linked list and enter \"stop\" when you wish to stop entering elements:");
        String input=sc.next();
        while(!input.equalsIgnoreCase("STOP"))
        {
            sls.insert(input);
            input=sc.next();
        }
        System.out.println("Original linked list:");        
        sls.display();
        System.out.println("Reversed linked list:");
        sls.reverse();
        sls.display();
    }
}