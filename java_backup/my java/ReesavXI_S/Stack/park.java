package Stack;
import java.util.*;
class park
{
    String s[];
    int top,i,k,n;
    String z="";
    park()
    {
        top=-1;
        s=new String[100];
    }
    void PUSH()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter car no ");
        if(top<100)
        s[++top]=sc.nextLine();
        else
        System.out.println("Stack overflow");
    }
    void POP()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter car number");
        z=sc.nextLine();
        int j=-1;
        String stack[]=new String[100];
        int temp=top;
        while(temp>0)
        {
            if(z.equalsIgnoreCase(s[temp])==true)
            {
                for(int hi=top;hi>temp;hi--)
                {
                    stack[++j]=s[hi];
                }
                top--;
                for(int jk=temp;jk<=top;jk++)
                s[jk]=stack[j--];
                break;
            }
            else
            {
            temp--;
        }
        }
    }
    void display()
    {
        int k=top;
        while(k>=0)
        {
            System.out.println(s[k--]);
        }
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Enter 1 for push 2 for pop 3 for display 4 for exit");
            k=sc.nextInt();
            switch(k)
            {
                case 1:
                PUSH();
                break;
                case 2:
                POP();
                break;
                case 3:
                display();
                break;
                case 4:
                System.exit(0);
            }
        }while(true);
    }
}
        
        