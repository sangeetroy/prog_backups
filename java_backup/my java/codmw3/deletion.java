import java.util.*;
public class deletion
{
    Scanner sc=new Scanner(System.in);
        
    class lt
    {
        int a;
        void input()
        {
            System.out.println("Enter number");
            a=sc.nextInt();
        }
        lt ob;
    }
    lt a1=new lt();
    lt a2=a1;
    void start()
    {
        lt str;
        String ch;
        ch="y";
        while(ch.equals("y"))
        {
            System.out.println("Do you want to continue?");
            ch=sc.nextLine();
            if(ch.equals("n"))
            {
                a2=null;
                break;
            }
            else
            {
                a2.input();
                a2.ob=new lt();
                a2=a2.ob;
            }
        }
        a2=a1;
        str=a2.ob;
        a2=str;
    }
}    