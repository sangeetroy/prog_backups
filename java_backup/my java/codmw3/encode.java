import java.util.*;
public class encode
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int st1,st2,st3,st4,b,k;
        String cd,c="";
        System.out.println("Enter code");
        cd=sc.nextLine();
        st1=(int)'a';st2=(int)'z';st3=(int)'A';st4=(int)'Z';
        for(b=0;b<cd.length();b++)
        {
            c=c+cd.charAt(b);
            {
                k=Integer.parseInt(c);
                if(k>=st1 && k<=st2)
                {
                    System.out.print(+(char)k);
                    c="";
                }
                else if(k>=st3 && k<=st4)
                {
                    System.out.print(+(char)k);
                    c="";
                }
            }
        }
    }
}
                