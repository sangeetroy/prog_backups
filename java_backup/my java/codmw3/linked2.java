import java.io.*;
public class linked2
{
    int c=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    class list
    {
        int a=1;
        void input()throws IOException
        {
            c++;
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
  linked2()
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
        System.out.println("count is "+(c-1));
        while(ob2.a!=0)
        {
            ob2.display();
            ob2=ob2.next;
        }
    }
}