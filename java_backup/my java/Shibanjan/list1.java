


import java.io.*;
class list1
{
  list l,l1;
  int x;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  list1()
  {
      l=new list();
      l1=new list();
  }
  void input()throws IOException
  {
      String s;
      s="yes";
      l1=l;
      while(s.equalsIgnoreCase("yes")==true)
      {
          System.out.println("Enter the number");
          x=Integer.parseInt(br.readLine());
          l1.input(x);
          System.out.println("Enter the choice");
          s=br.readLine();
          if(s.equalsIgnoreCase("yes")==true)
          {
              l1.next=new list();
              l1=l1.next;
            }
        }
        l1.next=null;
        reverse(l);
    }
    void show()
    {
        l1=l;
        while(l1!=null)
        {
            l1.show();
           
            l1=l1.next;
        }
    }
    void reverse(list l)
     {
         list l1,l2;
         l1=l;
         int c=0;
         c=0;
         while(l1!=null)
         {
             c++;
             l1=l1.next;
         }
         l1=l;
         System.out.println(c);
         while(c>=1)
         {
             l2=l;
         for(int i=1;i<c;i++)
         {
             l2=l2.next;
         }
         System.out.println(l2.x);
         c--;
         //l1=l1.next;
        }
    }
}