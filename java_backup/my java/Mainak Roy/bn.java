import java.util.*;
class bn
{
    void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("binary1");
        String n1=sc.nextLine();
        System.out.println("binary2");int j=n1.length()-1;
        String n2=sc.nextLine(); int c=0; int s=0; String s2="";
        for(int i=0;i<n1.length();i++)
        {
            s=(int)n1.charAt(j)+(int)n2.charAt(j)+c;
            if(s>1)
            {
                s=s-2;
                c=1;
            }
           s=s+48;
            s2=s2+(char)s;
            j--;
        }
        for(int i=s2.length()-1;i>=0;i--)
        {
            System.out.print(s2.charAt(i));
        }
    }
}
            