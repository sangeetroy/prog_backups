import java.util.*;
public class stringencode
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int b,e;
        String a;
        char d,c;
        
        System.out.println("Enter code");
        a=sc.nextLine();
        a=a+" ";
        for(b=0;b<a.length()-1;b=b+1)
        {
            c=a.charAt(b);
            d=a.charAt(b+1);
            if(c=='K' && d=='K')
            {
                System.out.print(" ");
                b++;
            }
            else 
            {
                e=(int)c;
                if(e+2>91)
                {
                    e=65+(e-91);
                    System.out.print((char)e);
                }
                else 
                {
                    System.out.print((char)(e+2));
                }
            }
        }
    }
}