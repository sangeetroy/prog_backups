import java.util.*;
public class Dateprint
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int c,e,fx=0;
        String a;
        System.out.println("Enter the Fixed Date");
        a=sc.nextLine();
        
        String b[]={"Sunday","Monday","Tuseday","Wednesday","Thursday","Friday","Saturday"};
        for(c=0;c<7;c=c+1)
        {
            if(b[c].equalsIgnoreCase(a))
            {
                fx=c;
            }
        }
        int d[]={31,28,31,30,31,30,31,31,30,31,30,31};
        for(c=0;c<12;c=c+1)
        {
            for(e=1;e<=d[c];e=e+1)
            {
                if(b[fx].equalsIgnoreCase("Sunday"))
                {
                    System.out.println(+e+" "+(c+1)+" "+"2013");
                    
                }
                
                fx++;
                if(fx==7)
                {
                    fx=0;
                }
            }
        }
    }
}
        