import java.util.*;
public class bin_com
{
    Scanner sc=new Scanner(System.in);
    void main()
    {
        int c1,c2,d;
        String e="",a,b;
        System.out.println("Enter binary number 1");
        a=sc.nextLine();
        System.out.println("Enter binary number 2");
        b=sc.nextLine();
        c1=a.length();
        c2=b.length();
        if(c1>c2)
        {
            for(d=0;d<(c1-c2);d++)
            {
                e=e+"0";
            }
            b=e+b;
        }
        else if(c2>c1)
        {
            for(d=0;d<(c2-c1);d++)
            {
                e=e+"0";
            }
            a=e+a;
        }
        for(d=0;d<a.length();d++)
        {
            if(a.charAt(d)=='0' && b.charAt(d)=='0')
            {
                continue;
            }
            else if(a.charAt(d)=='1' && b.charAt(d)=='0')
            {
                System.out.println(a+" is greater");
                break;
            }
            else if(a.charAt(d)=='0' && b.charAt(d)=='1')
            {
                System.out.println(b+" is greater");
                break;
            }
            else if(a.charAt(d)=='1' && b.charAt(d)=='1')
            {
                continue;
            }
        }
    }
}
        