import java.util.*;
public class linked_queue
{
    Scanner sc=new Scanner(System.in);
    class queue
    {
        int rl,m1,m2;
        void input()
        {
            System.out.println("Enter roll number");
            rl=sc.nextInt();
            System.out.println("Enter marks in unit test 1");
            m1=sc.nextInt();
            System.out.println("Enter marks in unit test 2");
            m2=sc.nextInt();
        }
        void avg()
        {
            int av;
            av=(m1+m2)/2;
            System.out.println("Average marks is "+av);
        }
        queue ob;
    }
    queue a1=new queue();
    queue a2=a1;
    void start()
    {
        int ch=0,fl;
        System.out.println("Enter 1 to enter data");
        System.out.println("Enter 2 to delete a set");
        System.out.println("Enter 3 to stop");
        fl=0;
        while(ch!=3)
        {
            System.out.println("Enter choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: 
                         a2.input();
                         a2.ob=new queue();
                         a2=a2.ob;
                         break;
                case 2:
                         a1=a1.ob;
                         break;
                case 3:
                         fl=1;
                         break;             
            }
            if(fl==1)
            {
                a2=null;
                break;
            }
        }
        a2=a1;
    }
    void calculate()
    {
        while(a2!=null)
        {
            a2.avg();
            a2=a2.ob;
        }
    }
}                     