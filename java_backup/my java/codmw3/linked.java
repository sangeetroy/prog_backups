import java.io.*;
public class linked
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    class list
    {
        int a=1;
        void input()throws IOException
        {
            System.out.println("Enter data");
            a=Integer.parseInt(br.readLine());
        }
        void display()
        {
            System.out.println(+a);
        }
        list next;
    }
    list ob,ob2;
  linked()
  {
        ob=new list();
        ob2=ob;
  }
  void check()throws IOException
  {
      
      while(true)
      {
          ob2.input();
          if(ob2.a==0)
             break;
          ob2.next=new list();
          ob2=ob2.next;
      }
      ob2=null;
      ob2=ob;
    }
    void print()
    {
        while(ob2.a!=0)
        {
            ob2.display();
            ob2=ob2.next;
        }
    }
}